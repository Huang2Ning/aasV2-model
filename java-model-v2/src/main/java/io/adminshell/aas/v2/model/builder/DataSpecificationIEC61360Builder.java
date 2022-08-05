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

public abstract class DataSpecificationIEC61360Builder<T extends DataSpecificationIEC61360, B extends DataSpecificationIEC61360Builder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for datatypes
	* @param datatypes desired value to be set
	* @return Builder object with new value for datatypes
	*/
	public B datatypes(List<DataTypeIEC61360> datatypes) {
		getBuildingInstance().setDatatypes(datatypes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List datatypes
	* @param datatype desired value to be added
	* @return Builder object with new value for datatypes
	*/
	public B datatype(DataTypeIEC61360 datatype) {
		getBuildingInstance().getDatatypes().add(datatype);
		return getSelf();
	}


	/**
	* This function allows setting a value for preferedNames
	* @param preferedNames desired value to be set
	* @return Builder object with new value for preferedNames
	*/
	public B preferedNames(List<LangString> preferedNames) {
		getBuildingInstance().setPreferedNames(preferedNames);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List preferedNames
	* @param preferedName desired value to be added
	* @return Builder object with new value for preferedNames
	*/
	public B preferedName(LangString preferedName) {
		getBuildingInstance().getPreferedNames().add(preferedName);
		return getSelf();
	}


	/**
	* This function allows setting a value for shortNames
	* @param shortNames desired value to be set
	* @return Builder object with new value for shortNames
	*/
	public B shortNames(List<LangString> shortNames) {
		getBuildingInstance().setShortNames(shortNames);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List shortNames
	* @param shortName desired value to be added
	* @return Builder object with new value for shortNames
	*/
	public B shortName(LangString shortName) {
		getBuildingInstance().getShortNames().add(shortName);
		return getSelf();
	}


	/**
	* This function allows setting a value for symbols
	* @param symbols desired value to be set
	* @return Builder object with new value for symbols
	*/
	public B symbols(List<String> symbols) {
		getBuildingInstance().setSymbols(symbols);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List symbols
	* @param symbol desired value to be added
	* @return Builder object with new value for symbols
	*/
	public B symbol(String symbol) {
		getBuildingInstance().getSymbols().add(symbol);
		return getSelf();
	}


	/**
	* This function allows setting a value for units
	* @param units desired value to be set
	* @return Builder object with new value for units
	*/
	public B units(List<String> units) {
		getBuildingInstance().setUnits(units);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List units
	* @param unit desired value to be added
	* @return Builder object with new value for units
	*/
	public B unit(String unit) {
		getBuildingInstance().getUnits().add(unit);
		return getSelf();
	}


	/**
	* This function allows setting a value for unitIds
	* @param unitIds desired value to be set
	* @return Builder object with new value for unitIds
	*/
	public B unitIds(List<Reference> unitIds) {
		getBuildingInstance().setUnitIds(unitIds);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List unitIds
	* @param unitId desired value to be added
	* @return Builder object with new value for unitIds
	*/
	public B unitId(Reference unitId) {
		getBuildingInstance().getUnitIds().add(unitId);
		return getSelf();
	}


	/**
	* This function allows setting a value for valueFormats
	* @param valueFormats desired value to be set
	* @return Builder object with new value for valueFormats
	*/
	public B valueFormats(List<String> valueFormats) {
		getBuildingInstance().setValueFormats(valueFormats);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List valueFormats
	* @param valueFormat desired value to be added
	* @return Builder object with new value for valueFormats
	*/
	public B valueFormat(String valueFormat) {
		getBuildingInstance().getValueFormats().add(valueFormat);
		return getSelf();
	}


	/**
	* This function allows setting a value for valueIds
	* @param valueIds desired value to be set
	* @return Builder object with new value for valueIds
	*/
	public B valueIds(List<String> valueIds) {
		getBuildingInstance().setValueIds(valueIds);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List valueIds
	* @param valueId desired value to be added
	* @return Builder object with new value for valueIds
	*/
	public B valueId(String valueId) {
		getBuildingInstance().getValueIds().add(valueId);
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
