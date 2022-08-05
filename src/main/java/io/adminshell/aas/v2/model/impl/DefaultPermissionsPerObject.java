/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v2.model.impl;

import io.adminshell.aas.v2.model.*;
import io.adminshell.aas.v2.model.impl.*;
import io.adminshell.aas.v2.model.builder.*;
import io.adminshell.aas.v2.model.annotations.IRI;
import io.adminshell.aas.v2.model.annotations.KnownSubtypes;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Collection;
import java.util.Set;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.InputStream;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
	* Default implementation of package io.adminshell.aas.v2.model.PermissionsPerObject
	
* Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to. 
*/

@IRI("http://admin-shell.io/aas/2/0#PermissionsPerObject")
public class DefaultPermissionsPerObject implements PermissionsPerObject {

	
	@IRI("http://admin-shell.io/aas/2/0#object")
	protected List<Referable> objects = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#objectPermission")
	protected List<Permission> objectPermissions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#targetObjectAttributes")
	protected List<ObjectAttributes> targetObjectAttributes = new ArrayList<>();


	public DefaultPermissionsPerObject() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.objects,
			this.targetObjectAttributes,
			this.objectPermissions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPermissionsPerObject other = (DefaultPermissionsPerObject) obj;
			return Objects.equals(this.objects, other.objects) &&
				Objects.equals(this.targetObjectAttributes, other.targetObjectAttributes) &&
				Objects.equals(this.objectPermissions, other.objectPermissions);
		}
	}


	
	@Override 
	public List<Referable> getObjects() {
		return objects;
	}
	
	@Override 
	 public void setObjects (List<Referable> objects) {
		this.objects = objects;
	}

	@Override 
	public List<ObjectAttributes> getTargetObjectAttributes() {
		return targetObjectAttributes;
	}
	
	@Override 
	 public void setTargetObjectAttributes (List<ObjectAttributes> targetObjectAttributes) {
		this.targetObjectAttributes = targetObjectAttributes;
	}

	@Override 
	public List<Permission> getObjectPermissions() {
		return objectPermissions;
	}
	
	@Override 
	 public void setObjectPermissions (List<Permission> objectPermissions) {
		this.objectPermissions = objectPermissions;
	}
/**
	* This builder class can be used to construct a DefaultPermissionsPerObject bean.
*/
	public static class Builder extends PermissionsPerObjectBuilder<DefaultPermissionsPerObject, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultPermissionsPerObject newBuildingInstance() {
			return new DefaultPermissionsPerObject();
		}
	}
}
