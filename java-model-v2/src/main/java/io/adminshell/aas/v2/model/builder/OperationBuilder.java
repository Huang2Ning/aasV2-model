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

public abstract class OperationBuilder<T extends Operation, B extends OperationBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for inputVariables
	* @param inputVariables desired value to be set
	* @return Builder object with new value for inputVariables
	*/
	public B inputVariables(List<OperationVariable> inputVariables) {
		getBuildingInstance().setInputVariables(inputVariables);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List inputVariables
	* @param inputVariable desired value to be added
	* @return Builder object with new value for inputVariables
	*/
	public B inputVariable(OperationVariable inputVariable) {
		getBuildingInstance().getInputVariables().add(inputVariable);
		return getSelf();
	}


	/**
	* This function allows setting a value for inoutputVariables
	* @param inoutputVariables desired value to be set
	* @return Builder object with new value for inoutputVariables
	*/
	public B inoutputVariables(List<OperationVariable> inoutputVariables) {
		getBuildingInstance().setInoutputVariables(inoutputVariables);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List inoutputVariables
	* @param inoutputVariable desired value to be added
	* @return Builder object with new value for inoutputVariables
	*/
	public B inoutputVariable(OperationVariable inoutputVariable) {
		getBuildingInstance().getInoutputVariables().add(inoutputVariable);
		return getSelf();
	}


	/**
	* This function allows setting a value for outputVariables
	* @param outputVariables desired value to be set
	* @return Builder object with new value for outputVariables
	*/
	public B outputVariables(List<OperationVariable> outputVariables) {
		getBuildingInstance().setOutputVariables(outputVariables);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List outputVariables
	* @param outputVariable desired value to be added
	* @return Builder object with new value for outputVariables
	*/
	public B outputVariable(OperationVariable outputVariable) {
		getBuildingInstance().getOutputVariables().add(outputVariable);
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


	/**
	* This function allows setting a value for kinds
	* @param kinds desired value to be set
	* @return Builder object with new value for kinds
	*/
	public B kinds(List<ModelingKind> kinds) {
		getBuildingInstance().setKinds(kinds);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List kinds
	* @param kind desired value to be added
	* @return Builder object with new value for kinds
	*/
	public B kind(ModelingKind kind) {
		getBuildingInstance().getKinds().add(kind);
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
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	public B qualifiers(List<Constraint> qualifiers) {
		getBuildingInstance().setQualifiers(qualifiers);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List qualifiers
	* @param qualifier desired value to be added
	* @return Builder object with new value for qualifiers
	*/
	public B qualifier(Constraint qualifier) {
		getBuildingInstance().getQualifiers().add(qualifier);
		return getSelf();
	}


	/**
	* This function allows setting a value for semanticIds
	* @param semanticIds desired value to be set
	* @return Builder object with new value for semanticIds
	*/
	public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }
}
