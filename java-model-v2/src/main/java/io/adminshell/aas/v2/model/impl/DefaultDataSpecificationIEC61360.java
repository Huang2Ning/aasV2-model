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
	* Default implementation of package io.adminshell.aas.v2.model.DataSpecificationIEC61360
	
* Data Specification Template for defining Property Descriptions conformant to IEC 61360. 
*/

@IRI("http://admin-shell.io/aas/2/0#DataSpecificationIEC61360")
public class DefaultDataSpecificationIEC61360 implements DataSpecificationIEC61360 {

	
	@IRI("http://admin-shell.io/aas/2/0#datatype")
	protected List<DataTypeIEC61360> datatypes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#definition")
	protected List<LangString> definitions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#preferedName")
	protected List<LangString> preferedNames = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#shortName")
	protected List<LangString> shortNames = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#sourceOfDefinition")
	protected List<LangString> sourceOfDefinitions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#symbol")
	protected List<String> symbols = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#unit")
	protected List<String> units = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#unitId")
	protected List<Reference> unitIds = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#valueFormat")
	protected List<String> valueFormats = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#valueId")
	protected List<String> valueIds = new ArrayList<>();


	public DefaultDataSpecificationIEC61360() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.datatypes,
			this.preferedNames,
			this.shortNames,
			this.symbols,
			this.units,
			this.unitIds,
			this.valueFormats,
			this.valueIds,
			this.definitions,
			this.sourceOfDefinitions);
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
			DefaultDataSpecificationIEC61360 other = (DefaultDataSpecificationIEC61360) obj;
			return Objects.equals(this.datatypes, other.datatypes) &&
				Objects.equals(this.preferedNames, other.preferedNames) &&
				Objects.equals(this.shortNames, other.shortNames) &&
				Objects.equals(this.symbols, other.symbols) &&
				Objects.equals(this.units, other.units) &&
				Objects.equals(this.unitIds, other.unitIds) &&
				Objects.equals(this.valueFormats, other.valueFormats) &&
				Objects.equals(this.valueIds, other.valueIds) &&
				Objects.equals(this.definitions, other.definitions) &&
				Objects.equals(this.sourceOfDefinitions, other.sourceOfDefinitions);
		}
	}


	
	@Override 
	public List<DataTypeIEC61360> getDatatypes() {
		return datatypes;
	}
	
	@Override 
	 public void setDatatypes (List<DataTypeIEC61360> datatypes) {
		this.datatypes = datatypes;
	}

	@Override 
	public List<LangString> getPreferedNames() {
		return preferedNames;
	}
	
	@Override 
	 public void setPreferedNames (List<LangString> preferedNames) {
		this.preferedNames = preferedNames;
	}

	@Override 
	public List<LangString> getShortNames() {
		return shortNames;
	}
	
	@Override 
	 public void setShortNames (List<LangString> shortNames) {
		this.shortNames = shortNames;
	}

	@Override 
	public List<String> getSymbols() {
		return symbols;
	}
	
	@Override 
	 public void setSymbols (List<String> symbols) {
		this.symbols = symbols;
	}

	@Override 
	public List<String> getUnits() {
		return units;
	}
	
	@Override 
	 public void setUnits (List<String> units) {
		this.units = units;
	}

	@Override 
	public List<Reference> getUnitIds() {
		return unitIds;
	}
	
	@Override 
	 public void setUnitIds (List<Reference> unitIds) {
		this.unitIds = unitIds;
	}

	@Override 
	public List<String> getValueFormats() {
		return valueFormats;
	}
	
	@Override 
	 public void setValueFormats (List<String> valueFormats) {
		this.valueFormats = valueFormats;
	}

	@Override 
	public List<String> getValueIds() {
		return valueIds;
	}
	
	@Override 
	 public void setValueIds (List<String> valueIds) {
		this.valueIds = valueIds;
	}

	@Override 
	public List<LangString> getDefinitions() {
		return definitions;
	}
	
	@Override 
	 public void setDefinitions (List<LangString> definitions) {
		this.definitions = definitions;
	}

	@Override 
	public List<LangString> getSourceOfDefinitions() {
		return sourceOfDefinitions;
	}
	
	@Override 
	 public void setSourceOfDefinitions (List<LangString> sourceOfDefinitions) {
		this.sourceOfDefinitions = sourceOfDefinitions;
	}
/**
	* This builder class can be used to construct a DefaultDataSpecificationIEC61360 bean.
*/
	public static class Builder extends DataSpecificationIEC61360Builder<DefaultDataSpecificationIEC61360, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultDataSpecificationIEC61360 newBuildingInstance() {
			return new DefaultDataSpecificationIEC61360();
		}
	}
}
