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
	* Default implementation of package io.adminshell.aas.v2.model.AdministrativeInformation
	
* Every Identifiable may have administrative information. Administrative information includes for example Information about the version of the element Information about who created or who made the last change to the element Information about the languages available in case the element contains text, for translating purposed also themmaster or default language may be definedIn the first version of the AAS metamodel only version information as defined by IEC 61360 is defined. In later versions additional attributes may be added. 
*/

@IRI("http://admin-shell.io/aas/2/0#AdministrativeInformation")
public class DefaultAdministrativeInformation implements AdministrativeInformation {

	
	@IRI("http://admin-shell.io/aas/2/0#dataSpecification")
	protected List<Reference> dataSpecifications = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#revision")
	protected List<String> revisions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#version")
	protected List<String> versions = new ArrayList<>();


	public DefaultAdministrativeInformation() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.revisions,
			this.versions,
			this.dataSpecifications);
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
			DefaultAdministrativeInformation other = (DefaultAdministrativeInformation) obj;
			return Objects.equals(this.revisions, other.revisions) &&
				Objects.equals(this.versions, other.versions) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications);
		}
	}


	
	@Override 
	public List<String> getRevisions() {
		return revisions;
	}
	
	@Override 
	 public void setRevisions (List<String> revisions) {
		this.revisions = revisions;
	}

	@Override 
	public List<String> getVersions() {
		return versions;
	}
	
	@Override 
	 public void setVersions (List<String> versions) {
		this.versions = versions;
	}

	@Override 
	public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	@Override 
	 public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}
/**
	* This builder class can be used to construct a DefaultAdministrativeInformation bean.
*/
	public static class Builder extends AdministrativeInformationBuilder<DefaultAdministrativeInformation, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAdministrativeInformation newBuildingInstance() {
			return new DefaultAdministrativeInformation();
		}
	}
@Override
public void add(AdministrativeInformation administration) {
	// TODO Auto-generated method stub
	
}
}
