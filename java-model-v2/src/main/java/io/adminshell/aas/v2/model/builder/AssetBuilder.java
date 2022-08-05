/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v2.model.builder;

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

public abstract class AssetBuilder<T extends Asset, B extends AssetBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for assetKinds
	* @param assetKinds desired value to be set
	* @return Builder object with new value for assetKinds
	*/
	public B assetKinds(List<AssetKind> assetKinds) {
		getBuildingInstance().setAssetKinds(assetKinds);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List assetKinds
	* @param assetKind desired value to be added
	* @return Builder object with new value for assetKinds
	*/
	public B assetKind(AssetKind assetKind) {
		getBuildingInstance().getAssetKinds().add(assetKind);
		return getSelf();
	}


	/**
	* This function allows setting a value for assetIdentificationModels
	* @param assetIdentificationModels desired value to be set
	* @return Builder object with new value for assetIdentificationModels
	*/
	public B assetIdentificationModels(List<Reference> assetIdentificationModels) {
		getBuildingInstance().setAssetIdentificationModels(assetIdentificationModels);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List assetIdentificationModels
	* @param assetIdentificationModel desired value to be added
	* @return Builder object with new value for assetIdentificationModels
	*/
	public B assetIdentificationModel(Reference assetIdentificationModel) {
		getBuildingInstance().getAssetIdentificationModels().add(assetIdentificationModel);
		return getSelf();
	}


	/**
	* This function allows setting a value for billOfMaterials
	* @param billOfMaterials desired value to be set
	* @return Builder object with new value for billOfMaterials
	*/
	public B billOfMaterials(List<Reference> billOfMaterials) {
		getBuildingInstance().setBillOfMaterials(billOfMaterials);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List billOfMaterials
	* @param billOfMaterial desired value to be added
	* @return Builder object with new value for billOfMaterials
	*/
	public B billOfMaterial(Reference billOfMaterial) {
		getBuildingInstance().getBillOfMaterials().add(billOfMaterial);
		return getSelf();
	}


	/**
	* This function allows setting a value for administrations
	* @param administrations desired value to be set
	* @return Builder object with new value for administrations
	*/
	public B administrations(List<AdministrativeInformation> administrations) {
		getBuildingInstance().setAdministrations(administrations);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List administrations
	* @param administration desired value to be added
	* @return Builder object with new value for administrations
	*/
	public B administration(AdministrativeInformation administration) {
		getBuildingInstance().getAdministrations().add(administration);
		return getSelf();
	}


	/**
	* This function allows setting a value for identifications
	* @param identifications desired value to be set
	* @return Builder object with new value for identifications
	*/
	public B identification(Identifier identification) {
		getBuildingInstance().setIdentification(identification);
		return getSelf();
	}


	/**
	* This function allows setting a value for parents
	* @param parents desired value to be set
	* @return Builder object with new value for parents
	*/
	public B parents(List<Referable> parents) {
		getBuildingInstance().setParents(parents);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List parents
	* @param parent desired value to be added
	* @return Builder object with new value for parents
	*/
	public B parent(Referable parent) {
		getBuildingInstance().getParents().add(parent);
		return getSelf();
	}


	/**
	* This function allows setting a value for categories
	* @param categories desired value to be set
	* @return Builder object with new value for categories
	*/
	public B categories(List<String> categories) {
		getBuildingInstance().setCategories(categories);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List categories
	* @param category desired value to be added
	* @return Builder object with new value for categories
	*/
	public B category(String category) {
		getBuildingInstance().getCategories().add(category);
		return getSelf();
	}


	/**
	* This function allows setting a value for descriptions
	* @param descriptions desired value to be set
	* @return Builder object with new value for descriptions
	*/
	public B descriptions(List<String> descriptions) {
		getBuildingInstance().setDescriptions(descriptions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List descriptions
	* @param description desired value to be added
	* @return Builder object with new value for descriptions
	*/
	public B description(String description) {
		getBuildingInstance().getDescriptions().add(description);
		return getSelf();
	}


	/**
	* This function allows setting a value for idShorts
	* @param idShorts desired value to be set
	* @return Builder object with new value for idShorts
	*/
	public B idShorts(List<String> idShorts) {
		getBuildingInstance().setIdShorts(idShorts);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List idShorts
	* @param idShort desired value to be added
	* @return Builder object with new value for idShorts
	*/
	public B idShort(String idShort) {
		getBuildingInstance().getIdShorts().add(idShort);
		return getSelf();
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	public B dataSpecifications(List<Reference> dataSpecifications) {
		getBuildingInstance().setDataSpecifications(dataSpecifications);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List dataSpecifications
	* @param dataSpecification desired value to be added
	* @return Builder object with new value for dataSpecifications
	*/
	public B dataSpecification(Reference dataSpecification) {
		getBuildingInstance().getDataSpecifications().add(dataSpecification);
		return getSelf();
	}
}
