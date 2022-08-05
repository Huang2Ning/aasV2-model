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
	* Default implementation of package io.adminshell.aas.v2.model.DataSpecificationPhysicalUnit
	
* Data Specification Tempate for Physical Units. 
*/

@IRI("http://admin-shell.io/aas/2/0#DataSpecificationPhysicalUnit")
public class DefaultDataSpecificationPhysicalUnit implements DataSpecificationPhysicalUnit {

	
	@IRI("http://admin-shell.io/aas/2/0#conversionFactor")
	protected List<String> conversionFactors = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#definition")
	protected List<LangString> definitions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#dinNotation")
	protected List<String> dinNotations = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#eceCode")
	protected List<String> eceCodes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#eceName")
	protected List<String> eceNames = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#nistName")
	protected List<String> nistNames = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#registrationAuthority")
	protected List<String> registrationAuthorities = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#siName")
	protected List<String> siNames = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#siNotation")
	protected List<String> siNotations = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#sourceOfDefinition")
	protected List<LangString> sourceOfDefinitions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#supplier")
	protected List<String> suppliers = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#unitName")
	protected List<String> unitNames = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#unitSymbol")
	protected List<String> unitSymbols = new ArrayList<>();


	public DefaultDataSpecificationPhysicalUnit() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.conversionFactors,
			this.dinNotations,
			this.eceCodes,
			this.eceNames,
			this.nistNames,
			this.siNames,
			this.siNotations,
			this.registrationAuthorities,
			this.suppliers,
			this.unitNames,
			this.unitSymbols,
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
			DefaultDataSpecificationPhysicalUnit other = (DefaultDataSpecificationPhysicalUnit) obj;
			return Objects.equals(this.conversionFactors, other.conversionFactors) &&
				Objects.equals(this.dinNotations, other.dinNotations) &&
				Objects.equals(this.eceCodes, other.eceCodes) &&
				Objects.equals(this.eceNames, other.eceNames) &&
				Objects.equals(this.nistNames, other.nistNames) &&
				Objects.equals(this.siNames, other.siNames) &&
				Objects.equals(this.siNotations, other.siNotations) &&
				Objects.equals(this.registrationAuthorities, other.registrationAuthorities) &&
				Objects.equals(this.suppliers, other.suppliers) &&
				Objects.equals(this.unitNames, other.unitNames) &&
				Objects.equals(this.unitSymbols, other.unitSymbols) &&
				Objects.equals(this.definitions, other.definitions) &&
				Objects.equals(this.sourceOfDefinitions, other.sourceOfDefinitions);
		}
	}


	
	@Override 
	public List<String> getConversionFactors() {
		return conversionFactors;
	}
	
	@Override 
	 public void setConversionFactors (List<String> conversionFactors) {
		this.conversionFactors = conversionFactors;
	}

	@Override 
	public List<String> getDinNotations() {
		return dinNotations;
	}
	
	@Override 
	 public void setDinNotations (List<String> dinNotations) {
		this.dinNotations = dinNotations;
	}

	@Override 
	public List<String> getEceCodes() {
		return eceCodes;
	}
	
	@Override 
	 public void setEceCodes (List<String> eceCodes) {
		this.eceCodes = eceCodes;
	}

	@Override 
	public List<String> getEceNames() {
		return eceNames;
	}
	
	@Override 
	 public void setEceNames (List<String> eceNames) {
		this.eceNames = eceNames;
	}

	@Override 
	public List<String> getNistNames() {
		return nistNames;
	}
	
	@Override 
	 public void setNistNames (List<String> nistNames) {
		this.nistNames = nistNames;
	}

	@Override 
	public List<String> getSiNames() {
		return siNames;
	}
	
	@Override 
	 public void setSiNames (List<String> siNames) {
		this.siNames = siNames;
	}

	@Override 
	public List<String> getSiNotations() {
		return siNotations;
	}
	
	@Override 
	 public void setSiNotations (List<String> siNotations) {
		this.siNotations = siNotations;
	}

	@Override 
	public List<String> getRegistrationAuthorities() {
		return registrationAuthorities;
	}
	
	@Override 
	 public void setRegistrationAuthorities (List<String> registrationAuthorities) {
		this.registrationAuthorities = registrationAuthorities;
	}

	@Override 
	public List<String> getSuppliers() {
		return suppliers;
	}
	
	@Override 
	 public void setSuppliers (List<String> suppliers) {
		this.suppliers = suppliers;
	}

	@Override 
	public List<String> getUnitNames() {
		return unitNames;
	}
	
	@Override 
	 public void setUnitNames (List<String> unitNames) {
		this.unitNames = unitNames;
	}

	@Override 
	public List<String> getUnitSymbols() {
		return unitSymbols;
	}
	
	@Override 
	 public void setUnitSymbols (List<String> unitSymbols) {
		this.unitSymbols = unitSymbols;
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
	* This builder class can be used to construct a DefaultDataSpecificationPhysicalUnit bean.
*/
	public static class Builder extends DataSpecificationPhysicalUnitBuilder<DefaultDataSpecificationPhysicalUnit, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultDataSpecificationPhysicalUnit newBuildingInstance() {
			return new DefaultDataSpecificationPhysicalUnit();
		}
	}
}
