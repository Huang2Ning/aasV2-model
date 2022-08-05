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
	* Default implementation of package io.adminshell.aas.v2.model.AccessControl
	
* Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules. 
*/

@IRI("http://admin-shell.io/aas/2/0#AccessControl")
public class DefaultAccessControl implements AccessControl {

	
	@IRI("http://admin-shell.io/aas/2/0#accessPermissionRule")
	protected List<AccessPermissionRule> accessPermissionRules = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#defaultEnvironmentAttributes")
	protected List<Submodel> defaultEnvironmentAttributes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#defaultPermissions")
	protected List<Submodel> defaultPermissions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#defaultSubjectAttributes")
	protected List<Submodel> defaultSubjectAttributes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#selectableEnvironmentAttributes")
	protected List<Submodel> selectableEnvironmentAttributes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#selectablePermissions")
	protected List<Submodel> selectablePermissions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#selectableSubjectAttributes")
	protected List<Submodel> selectableSubjectAttributes = new ArrayList<>();


	public DefaultAccessControl() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.defaultEnvironmentAttributes,
			this.defaultPermissions,
			this.defaultSubjectAttributes,
			this.selectableEnvironmentAttributes,
			this.accessPermissionRules,
			this.selectableSubjectAttributes,
			this.selectablePermissions);
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
			DefaultAccessControl other = (DefaultAccessControl) obj;
			return Objects.equals(this.defaultEnvironmentAttributes, other.defaultEnvironmentAttributes) &&
				Objects.equals(this.defaultPermissions, other.defaultPermissions) &&
				Objects.equals(this.defaultSubjectAttributes, other.defaultSubjectAttributes) &&
				Objects.equals(this.selectableEnvironmentAttributes, other.selectableEnvironmentAttributes) &&
				Objects.equals(this.accessPermissionRules, other.accessPermissionRules) &&
				Objects.equals(this.selectableSubjectAttributes, other.selectableSubjectAttributes) &&
				Objects.equals(this.selectablePermissions, other.selectablePermissions);
		}
	}


	
	@Override 
	public List<Submodel> getDefaultEnvironmentAttributes() {
		return defaultEnvironmentAttributes;
	}
	
	@Override 
	 public void setDefaultEnvironmentAttributes (List<Submodel> defaultEnvironmentAttributes) {
		this.defaultEnvironmentAttributes = defaultEnvironmentAttributes;
	}

	@Override 
	public List<Submodel> getDefaultPermissions() {
		return defaultPermissions;
	}
	
	@Override 
	 public void setDefaultPermissions (List<Submodel> defaultPermissions) {
		this.defaultPermissions = defaultPermissions;
	}

	@Override 
	public List<Submodel> getDefaultSubjectAttributes() {
		return defaultSubjectAttributes;
	}
	
	@Override 
	 public void setDefaultSubjectAttributes (List<Submodel> defaultSubjectAttributes) {
		this.defaultSubjectAttributes = defaultSubjectAttributes;
	}

	@Override 
	public List<Submodel> getSelectableEnvironmentAttributes() {
		return selectableEnvironmentAttributes;
	}
	
	@Override 
	 public void setSelectableEnvironmentAttributes (List<Submodel> selectableEnvironmentAttributes) {
		this.selectableEnvironmentAttributes = selectableEnvironmentAttributes;
	}

	@Override 
	public List<AccessPermissionRule> getAccessPermissionRules() {
		return accessPermissionRules;
	}
	
	@Override 
	 public void setAccessPermissionRules (List<AccessPermissionRule> accessPermissionRules) {
		this.accessPermissionRules = accessPermissionRules;
	}

	@Override 
	public List<Submodel> getSelectableSubjectAttributes() {
		return selectableSubjectAttributes;
	}
	
	@Override 
	 public void setSelectableSubjectAttributes (List<Submodel> selectableSubjectAttributes) {
		this.selectableSubjectAttributes = selectableSubjectAttributes;
	}

	@Override 
	public List<Submodel> getSelectablePermissions() {
		return selectablePermissions;
	}
	
	@Override 
	 public void setSelectablePermissions (List<Submodel> selectablePermissions) {
		this.selectablePermissions = selectablePermissions;
	}
/**
	* This builder class can be used to construct a DefaultAccessControl bean.
*/
	public static class Builder extends AccessControlBuilder<DefaultAccessControl, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAccessControl newBuildingInstance() {
			return new DefaultAccessControl();
		}
	}
}
