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
	* Default implementation of package io.adminshell.aas.v2.model.AssetAdministrationShell
	
* Describes the Administration Shell for Assets, Products, Components, e.g. Machines 
*/

@IRI("http://admin-shell.io/aas/2/0#AssetAdministrationShell")
public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

	
	@IRI("http://admin-shell.io/aas/2/0#administration")
	protected List<AdministrativeInformation> administrations = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#category")
	protected List<String> categories = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#conceptDictionary")
	protected List<ConceptDictionary> conceptDictionaries = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#dataSpecification")
	protected List<Reference> dataSpecifications = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#derivedFrom")
	protected List<Reference> derivedFroms = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#describes")
	protected List<Asset> describes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#description")
	protected List<String> descriptions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#idShort")
	protected List<String> idShorts = new ArrayList<>();



	
	@IRI("http://admin-shell.io/aas/2/0#parent")
	protected List<Referable> parents = new ArrayList<>();



	
	@IRI("http://admin-shell.io/aas/2/0#submodel")
	protected List<Submodel> submodels = new ArrayList<>();

	protected Security securities;
	
	protected List<Identifier> identifications;
	
	@IRI("http://admin-shell.io/aas/2/0#view")
	protected List<View> views = new ArrayList<>();


	public DefaultAssetAdministrationShell() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.conceptDictionaries,
			this.derivedFroms,
			this.describes,
			this.securities,
			this.submodels,
			this.views,
			this.administrations,
			this.identifications,
			this.parents,
			this.categories,
			this.descriptions,
			this.idShorts,
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
			DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
			return Objects.equals(this.conceptDictionaries, other.conceptDictionaries) &&
				Objects.equals(this.derivedFroms, other.derivedFroms) &&
				Objects.equals(this.describes, other.describes) &&
				Objects.equals(this.submodels, other.submodels) &&
				Objects.equals(this.views, other.views) &&
				Objects.equals(this.administrations, other.administrations) &&
				Objects.equals(this.parents, other.parents) &&
				Objects.equals(this.categories, other.categories) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.idShorts, other.idShorts) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications);
		}
	}


	
	@Override 
	public List<ConceptDictionary> getConceptDictionaries() {
		return conceptDictionaries;
	}
	
	@Override 
	 public void setConceptDictionaries (List<ConceptDictionary> conceptDictionaries) {
		this.conceptDictionaries = conceptDictionaries;
	}

	@Override 
	public List<Reference> getDerivedFroms() {
		return derivedFroms;
	}
	
	@Override 
	 public void setDerivedFroms (List<Reference> derivedFroms) {
		this.derivedFroms = derivedFroms;
	}

	@Override 
	public List<Asset> getDescribes() {
		return describes;
	}
	
	@Override 
	 public void setDescribes (List<Asset> describes) {
		this.describes = describes;
	}

	public void setSecurity(Security securities) {
        this.securities = securities;
    }
	
	@Override 
	public List<Submodel> getSubmodels() {
		return submodels;
	}
	
	@Override 
	 public void setSubmodels (List<Submodel> submodels) {
		this.submodels = submodels;
	}

	@Override 
	public List<View> getViews() {
		return views;
	}
	
	@Override 
	 public void setViews (List<View> views) {
		this.views = views;
	}

	@Override 
	public List<AdministrativeInformation> getAdministrations() {
		return administrations;
	}
	
	@Override 
	 public void setAdministrations (List<AdministrativeInformation> administrations) {
		this.administrations = administrations;
	}

	@Override
	public List<Identifier> getIdentifications() {
		return identifications;
	}
	
	@Override 
	 public void setIdentification(List<Identifier> identifications) {
		this.identifications = identifications;
	}

	@Override 
	public List<Referable> getParents() {
		return parents;
	}
	
	@Override 
	 public void setParents (List<Referable> parents) {
		this.parents = parents;
	}

	@Override 
	public List<String> getCategories() {
		return categories;
	}
	
	@Override 
	 public void setCategories (List<String> categories) {
		this.categories = categories;
	}

	@Override 
	public List<String> getDescriptions() {
		return descriptions;
	}
	
	@Override 
	 public void setDescriptions (List<String> descriptions) {
		this.descriptions = descriptions;
	}

	@Override 
	public List<String> getIdShorts() {
		return idShorts;
	}
	
	@Override 
	 public void setIdShorts (List<String> idShorts) {
		this.idShorts = idShorts;
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
	* This builder class can be used to construct a DefaultAssetAdministrationShell bean.
*/
	public static class Builder extends AssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAssetAdministrationShell newBuildingInstance() {
			return new DefaultAssetAdministrationShell();
		}
	}
@Override
public Security getSecurity() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setIdentification(Identifier identification) {
	// TODO Auto-generated method stub
	
}
}
