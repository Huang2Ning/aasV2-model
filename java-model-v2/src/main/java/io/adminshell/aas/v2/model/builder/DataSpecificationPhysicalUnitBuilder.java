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

public abstract class DataSpecificationPhysicalUnitBuilder<T extends DataSpecificationPhysicalUnit, B extends DataSpecificationPhysicalUnitBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for conversionFactors
	* @param conversionFactors desired value to be set
	* @return Builder object with new value for conversionFactors
	*/
	public B conversionFactors(List<String> conversionFactors) {
		getBuildingInstance().setConversionFactors(conversionFactors);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List conversionFactors
	* @param conversionFactor desired value to be added
	* @return Builder object with new value for conversionFactors
	*/
	public B conversionFactor(String conversionFactor) {
		getBuildingInstance().getConversionFactors().add(conversionFactor);
		return getSelf();
	}


	/**
	* This function allows setting a value for dinNotations
	* @param dinNotations desired value to be set
	* @return Builder object with new value for dinNotations
	*/
	public B dinNotations(List<String> dinNotations) {
		getBuildingInstance().setDinNotations(dinNotations);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List dinNotations
	* @param dinNotation desired value to be added
	* @return Builder object with new value for dinNotations
	*/
	public B dinNotation(String dinNotation) {
		getBuildingInstance().getDinNotations().add(dinNotation);
		return getSelf();
	}


	/**
	* This function allows setting a value for eceCodes
	* @param eceCodes desired value to be set
	* @return Builder object with new value for eceCodes
	*/
	public B eceCodes(List<String> eceCodes) {
		getBuildingInstance().setEceCodes(eceCodes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List eceCodes
	* @param eceCode desired value to be added
	* @return Builder object with new value for eceCodes
	*/
	public B eceCode(String eceCode) {
		getBuildingInstance().getEceCodes().add(eceCode);
		return getSelf();
	}


	/**
	* This function allows setting a value for eceNames
	* @param eceNames desired value to be set
	* @return Builder object with new value for eceNames
	*/
	public B eceNames(List<String> eceNames) {
		getBuildingInstance().setEceNames(eceNames);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List eceNames
	* @param eceName desired value to be added
	* @return Builder object with new value for eceNames
	*/
	public B eceName(String eceName) {
		getBuildingInstance().getEceNames().add(eceName);
		return getSelf();
	}


	/**
	* This function allows setting a value for nistNames
	* @param nistNames desired value to be set
	* @return Builder object with new value for nistNames
	*/
	public B nistNames(List<String> nistNames) {
		getBuildingInstance().setNistNames(nistNames);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List nistNames
	* @param nistName desired value to be added
	* @return Builder object with new value for nistNames
	*/
	public B nistName(String nistName) {
		getBuildingInstance().getNistNames().add(nistName);
		return getSelf();
	}


	/**
	* This function allows setting a value for siNames
	* @param siNames desired value to be set
	* @return Builder object with new value for siNames
	*/
	public B siNames(List<String> siNames) {
		getBuildingInstance().setSiNames(siNames);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List siNames
	* @param siName desired value to be added
	* @return Builder object with new value for siNames
	*/
	public B siName(String siName) {
		getBuildingInstance().getSiNames().add(siName);
		return getSelf();
	}


	/**
	* This function allows setting a value for siNotations
	* @param siNotations desired value to be set
	* @return Builder object with new value for siNotations
	*/
	public B siNotations(List<String> siNotations) {
		getBuildingInstance().setSiNotations(siNotations);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List siNotations
	* @param siNotation desired value to be added
	* @return Builder object with new value for siNotations
	*/
	public B siNotation(String siNotation) {
		getBuildingInstance().getSiNotations().add(siNotation);
		return getSelf();
	}


	/**
	* This function allows setting a value for registrationAuthorities
	* @param registrationAuthorities desired value to be set
	* @return Builder object with new value for registrationAuthorities
	*/
	public B registrationAuthorities(List<String> registrationAuthorities) {
		getBuildingInstance().setRegistrationAuthorities(registrationAuthorities);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List registrationAuthorities
	* @param registrationAuthority desired value to be added
	* @return Builder object with new value for registrationAuthorities
	*/
	public B registrationAuthority(String registrationAuthority) {
		getBuildingInstance().getRegistrationAuthorities().add(registrationAuthority);
		return getSelf();
	}


	/**
	* This function allows setting a value for suppliers
	* @param suppliers desired value to be set
	* @return Builder object with new value for suppliers
	*/
	public B suppliers(List<String> suppliers) {
		getBuildingInstance().setSuppliers(suppliers);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List suppliers
	* @param supplier desired value to be added
	* @return Builder object with new value for suppliers
	*/
	public B supplier(String supplier) {
		getBuildingInstance().getSuppliers().add(supplier);
		return getSelf();
	}


	/**
	* This function allows setting a value for unitNames
	* @param unitNames desired value to be set
	* @return Builder object with new value for unitNames
	*/
	public B unitNames(List<String> unitNames) {
		getBuildingInstance().setUnitNames(unitNames);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List unitNames
	* @param unitName desired value to be added
	* @return Builder object with new value for unitNames
	*/
	public B unitName(String unitName) {
		getBuildingInstance().getUnitNames().add(unitName);
		return getSelf();
	}


	/**
	* This function allows setting a value for unitSymbols
	* @param unitSymbols desired value to be set
	* @return Builder object with new value for unitSymbols
	*/
	public B unitSymbols(List<String> unitSymbols) {
		getBuildingInstance().setUnitSymbols(unitSymbols);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List unitSymbols
	* @param unitSymbol desired value to be added
	* @return Builder object with new value for unitSymbols
	*/
	public B unitSymbol(String unitSymbol) {
		getBuildingInstance().getUnitSymbols().add(unitSymbol);
		return getSelf();
	}


	/**
	* This function allows setting a value for definitions
	* @param definitions desired value to be set
	* @return Builder object with new value for definitions
	*/
	public B definitions(List<LangString> definitions) {
		getBuildingInstance().setDefinitions(definitions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List definitions
	* @param definition desired value to be added
	* @return Builder object with new value for definitions
	*/
	public B definition(LangString definition) {
		getBuildingInstance().getDefinitions().add(definition);
		return getSelf();
	}


	/**
	* This function allows setting a value for sourceOfDefinitions
	* @param sourceOfDefinitions desired value to be set
	* @return Builder object with new value for sourceOfDefinitions
	*/
	public B sourceOfDefinitions(List<LangString> sourceOfDefinitions) {
		getBuildingInstance().setSourceOfDefinitions(sourceOfDefinitions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List sourceOfDefinitions
	* @param sourceOfDefinition desired value to be added
	* @return Builder object with new value for sourceOfDefinitions
	*/
	public B sourceOfDefinition(LangString sourceOfDefinition) {
		getBuildingInstance().getSourceOfDefinitions().add(sourceOfDefinition);
		return getSelf();
	}
}
