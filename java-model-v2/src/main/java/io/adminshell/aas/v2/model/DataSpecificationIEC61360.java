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
* Data Specification Template for defining Property Descriptions conformant to IEC 61360.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultDataSpecificationIEC61360.class)
})
public interface DataSpecificationIEC61360 {

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#datatype
	*
	* @return Returns the List of DataTypeIEC61360s for the property datatypes.
	*/
	@IRI("http://admin-shell.io/aas/2/0#datatype")
	List<DataTypeIEC61360> getDatatypes();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#datatype
	*
	* @param datatypes desired value for the property datatypes.
	*/
	 void setDatatypes (List<DataTypeIEC61360> datatypes);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#preferedName
	*
	* @return Returns the List of LangStrings for the property preferedNames.
	*/
	@IRI("http://admin-shell.io/aas/2/0#preferedName")
	List<LangString> getPreferedNames();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#preferedName
	*
	* @param preferedNames desired value for the property preferedNames.
	*/
	 void setPreferedNames (List<LangString> preferedNames);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#shortName
	*
	* @return Returns the List of LangStrings for the property shortNames.
	*/
	@IRI("http://admin-shell.io/aas/2/0#shortName")
	List<LangString> getShortNames();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#shortName
	*
	* @param shortNames desired value for the property shortNames.
	*/
	 void setShortNames (List<LangString> shortNames);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#symbol
	*
	* @return Returns the List of Strings for the property symbols.
	*/
	@IRI("http://admin-shell.io/aas/2/0#symbol")
	List<String> getSymbols();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#symbol
	*
	* @param symbols desired value for the property symbols.
	*/
	 void setSymbols (List<String> symbols);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unit
	*
	* @return Returns the List of Strings for the property units.
	*/
	@IRI("http://admin-shell.io/aas/2/0#unit")
	List<String> getUnits();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unit
	*
	* @param units desired value for the property units.
	*/
	 void setUnits (List<String> units);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unitId
	*
	* @return Returns the List of References for the property unitIds.
	*/
	@IRI("http://admin-shell.io/aas/2/0#unitId")
	List<Reference> getUnitIds();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#unitId
	*
	* @param unitIds desired value for the property unitIds.
	*/
	 void setUnitIds (List<Reference> unitIds);

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#valueFormat
	*
	* @return Returns the List of Strings for the property valueFormats.
	*/
	@IRI("http://admin-shell.io/aas/2/0#valueFormat")
	List<String> getValueFormats();

	/**
	* 
	*
	* More information under http://admin-shell.io/aas/2/0#valueFormat
	*
	* @param valueFormats desired value for the property valueFormats.
	*/
	 void setValueFormats (List<String> valueFormats);

	/**
	* The Type 'ValueList' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs.
	*
	* More information under http://admin-shell.io/aas/2/0#valueId
	*
	* @return Returns the List of Strings for the property valueIds.
	*/
	@IRI("http://admin-shell.io/aas/2/0#valueId")
	List<String> getValueIds();

	/**
	* The Type 'ValueList' lists all the allowed values for a concept description for which the allowed values are listed in an enumeration. The value list is a set of value reference pairs.
	*
	* More information under http://admin-shell.io/aas/2/0#valueId
	*
	* @param valueIds desired value for the property valueIds.
	*/
	 void setValueIds (List<String> valueIds);

	void setDefinitions(List<LangString> definitions);

	List<LangString> getDefinitions();

	void setSourceOfDefinitions(List<LangString> sourceOfDefinitions);

	List<LangString> getSourceOfDefinitions();

}
