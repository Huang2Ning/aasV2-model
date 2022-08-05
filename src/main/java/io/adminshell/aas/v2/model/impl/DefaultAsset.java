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
	* Default implementation of package io.adminshell.aas.v2.model.Asset
	
* An Asset describes meta data of an asset that is represented by an AAS. The asset may either represent an asset type or an asset instance. The asset has a globally unique identifier plus � if needed � additional domain specific (proprietary) identifiers.
* Objects may be known in the form of a type or of an instance. An object in the planning phase is known as a type 
*/

@IRI("http://admin-shell.io/aas/2/0#Asset")
public class DefaultAsset implements Asset {

	
	@IRI("http://admin-shell.io/aas/2/0#administration")
	protected List<AdministrativeInformation> administrations = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#assetIdentificationModel")
	protected List<Reference> assetIdentificationModels = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#assetKind")
	protected List<AssetKind> assetKinds = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#billOfMaterial")
	protected List<Reference> billOfMaterials = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#category")
	protected List<String> categories = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#dataSpecification")
	protected List<Reference> dataSpecifications = new ArrayList<>();


	 protected List<Identifier> identifications;
	
	@IRI("http://admin-shell.io/aas/2/0#description")
	protected List<String> descriptions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#idShort")
	protected List<String> idShorts = new ArrayList<>();



	
	@IRI("http://admin-shell.io/aas/2/0#parent")
	protected List<Referable> parents = new ArrayList<>();


	public DefaultAsset() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.assetKinds,
			this.assetIdentificationModels,
			this.billOfMaterials,
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
			DefaultAsset other = (DefaultAsset) obj;
			return Objects.equals(this.assetKinds, other.assetKinds) &&
				Objects.equals(this.assetIdentificationModels, other.assetIdentificationModels) &&
				Objects.equals(this.billOfMaterials, other.billOfMaterials) &&
				Objects.equals(this.administrations, other.administrations) &&
				Objects.equals(this.parents, other.parents) &&
				Objects.equals(this.categories, other.categories) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.idShorts, other.idShorts) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications);
		}
	}


	
	@Override 
	public List<AssetKind> getAssetKinds() {
		return assetKinds;
	}
	
	@Override 
	 public void setAssetKinds (List<AssetKind> assetKinds) {
		this.assetKinds = assetKinds;
	}

	@Override 
	public List<Reference> getAssetIdentificationModels() {
		return assetIdentificationModels;
	}
	
	@Override 
	 public void setAssetIdentificationModels (List<Reference> assetIdentificationModels) {
		this.assetIdentificationModels = assetIdentificationModels;
	}

	@Override 
	public List<Reference> getBillOfMaterials() {
		return billOfMaterials;
	}
	
	@Override 
	 public void setBillOfMaterials (List<Reference> billOfMaterials) {
		this.billOfMaterials = billOfMaterials;
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
	 public void  setIdentification(Identifier identification) {
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
	* This builder class can be used to construct a DefaultAsset bean.
*/
	public static class Builder extends AssetBuilder<DefaultAsset, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAsset newBuildingInstance() {
			return new DefaultAsset();
		}
	}
}
