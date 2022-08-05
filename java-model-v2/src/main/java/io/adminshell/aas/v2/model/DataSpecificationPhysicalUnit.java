/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v2.model;


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
* Data Specification Tempate for Physical Units.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultDataSpecificationPhysicalUnit.class)
})
public interface DataSpecificationPhysicalUnit {

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#conversionFactor
	*
	* @return Returns the List of Strings for the property conversionFactors.
	*/
	@IRI("http://admin-shell.io/aas/2/0#conversionFactor")
	List<String> getConversionFactors();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#conversionFactor
	*
	* @param conversionFactors desired value for the property conversionFactors.
	*/
	 void setConversionFactors (List<String> conversionFactors);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#dinNotation
	*
	* @return Returns the List of Strings for the property dinNotations.
	*/
	@IRI("http://admin-shell.io/aas/2/0#dinNotation")
	List<String> getDinNotations();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#dinNotation
	*
	* @param dinNotations desired value for the property dinNotations.
	*/
	 void setDinNotations (List<String> dinNotations);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#eceCode
	*
	* @return Returns the List of Strings for the property eceCodes.
	*/
	@IRI("http://admin-shell.io/aas/2/0#eceCode")
	List<String> getEceCodes();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#eceCode
	*
	* @param eceCodes desired value for the property eceCodes.
	*/
	 void setEceCodes (List<String> eceCodes);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#eceName
	*
	* @return Returns the List of Strings for the property eceNames.
	*/
	@IRI("http://admin-shell.io/aas/2/0#eceName")
	List<String> getEceNames();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#eceName
	*
	* @param eceNames desired value for the property eceNames.
	*/
	 void setEceNames (List<String> eceNames);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#nistName
	*
	* @return Returns the List of Strings for the property nistNames.
	*/
	@IRI("http://admin-shell.io/aas/2/0#nistName")
	List<String> getNistNames();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#nistName
	*
	* @param nistNames desired value for the property nistNames.
	*/
	 void setNistNames (List<String> nistNames);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#siName
	*
	* @return Returns the List of Strings for the property siNames.
	*/
	@IRI("http://admin-shell.io/aas/2/0#siName")
	List<String> getSiNames();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#siName
	*
	* @param siNames desired value for the property siNames.
	*/
	 void setSiNames (List<String> siNames);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#siNotation
	*
	* @return Returns the List of Strings for the property siNotations.
	*/
	@IRI("http://admin-shell.io/aas/2/0#siNotation")
	List<String> getSiNotations();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#siNotation
	*
	* @param siNotations desired value for the property siNotations.
	*/
	 void setSiNotations (List<String> siNotations);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#registrationAuthority
	*
	* @return Returns the List of Strings for the property registrationAuthorities.
	*/
	@IRI("http://admin-shell.io/aas/2/0#registrationAuthority")
	List<String> getRegistrationAuthorities();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#registrationAuthority
	*
	* @param registrationAuthorities desired value for the property registrationAuthorities.
	*/
	 void setRegistrationAuthorities (List<String> registrationAuthorities);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#supplier
	*
	* @return Returns the List of Strings for the property suppliers.
	*/
	@IRI("http://admin-shell.io/aas/2/0#supplier")
	List<String> getSuppliers();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#supplier
	*
	* @param suppliers desired value for the property suppliers.
	*/
	 void setSuppliers (List<String> suppliers);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unitName
	*
	* @return Returns the List of Strings for the property unitNames.
	*/
	@IRI("http://admin-shell.io/aas/2/0#unitName")
	List<String> getUnitNames();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unitName
	*
	* @param unitNames desired value for the property unitNames.
	*/
	 void setUnitNames (List<String> unitNames);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unitSymbol
	*
	* @return Returns the List of Strings for the property unitSymbols.
	*/
	@IRI("http://admin-shell.io/aas/2/0#unitSymbol")
	List<String> getUnitSymbols();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unitSymbol
	*
	* @param unitSymbols desired value for the property unitSymbols.
	*/
	 void setUnitSymbols (List<String> unitSymbols);

	void setDefinitions(List<LangString> definitions);

	List<LangString> getDefinitions();

	void setSourceOfDefinitions(List<LangString> sourceOfDefinitions);

	List<LangString> getSourceOfDefinitions();

}
