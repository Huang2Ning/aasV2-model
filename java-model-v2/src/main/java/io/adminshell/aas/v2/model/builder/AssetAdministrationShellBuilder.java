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

public abstract class AssetAdministrationShellBuilder<T extends AssetAdministrationShell, B extends AssetAdministrationShellBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for conceptDictionaries
	* @param conceptDictionaries desired value to be set
	* @return Builder object with new value for conceptDictionaries
	*/
	public B conceptDictionaries(List<ConceptDictionary> conceptDictionaries) {
		getBuildingInstance().setConceptDictionaries(conceptDictionaries);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List conceptDictionaries
	* @param conceptDictionary desired value to be added
	* @return Builder object with new value for conceptDictionaries
	*/
	public B conceptDictionary(ConceptDictionary conceptDictionary) {
		getBuildingInstance().getConceptDictionaries().add(conceptDictionary);
		return getSelf();
	}


	/**
	* This function allows setting a value for derivedFroms
	* @param derivedFroms desired value to be set
	* @return Builder object with new value for derivedFroms
	*/
	public B derivedFroms(List<Reference> derivedFroms) {
		getBuildingInstance().setDerivedFroms(derivedFroms);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List derivedFroms
	* @param derivedFrom desired value to be added
	* @return Builder object with new value for derivedFroms
	*/
	public B derivedFrom(Reference derivedFrom) {
		getBuildingInstance().getDerivedFroms().add(derivedFrom);
		return getSelf();
	}


	/**
	* This function allows setting a value for describes
	* @param describes desired value to be set
	* @return Builder object with new value for describes
	*/
	public B describes(List<Asset> describes) {
		getBuildingInstance().setDescribes(describes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List describes
	* @param describes desired value to be added
	* @return Builder object with new value for describes
	*/
	public B describes(Asset describes) {
		getBuildingInstance().getDescribes().add(describes);
		return getSelf();
	}


	/**
	* This function allows setting a value for securities
	* @param securities desired value to be set
	* @return Builder object with new value for securities
	*/
	public B security(Security security) {
        getBuildingInstance().setSecurity(security);
        return getSelf();
    }



	/**
	* This function allows setting a value for submodels
	* @param submodels desired value to be set
	* @return Builder object with new value for submodels
	*/
	public B submodels(List<Submodel> submodels) {
		getBuildingInstance().setSubmodels(submodels);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List submodels
	* @param submodel desired value to be added
	* @return Builder object with new value for submodels
	*/
	public B submodel(Submodel submodel) {
		getBuildingInstance().getSubmodels().add(submodel);
		return getSelf();
	}


	/**
	* This function allows setting a value for views
	* @param views desired value to be set
	* @return Builder object with new value for views
	*/
	public B views(List<View> views) {
		getBuildingInstance().setViews(views);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List views
	* @param view desired value to be added
	* @return Builder object with new value for views
	*/
	public B view(View view) {
		getBuildingInstance().getViews().add(view);
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
