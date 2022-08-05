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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* Enumeration of all IEC 61360 defined data types. 
*/
@IRI("http://admin-shell.io/aas/2/0#DataTypeIEC61360")
public enum DataTypeIEC61360 {

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#BOOLEAN_IEC6360_DATATYPE")
BOOLEAN_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#DATE_IEC6360_DATATYPE")
DATE_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#RATIONAL_IEC6360_DATATYPE")
RATIONAL_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#RATIONAL_MEASURE_IEC6360_DATATYPE")
RATIONAL_MEASURE_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#REAL_COUNT_IEC6360_DATATYPE")
REAL_COUNT_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#REAL_CURRENCY_IEC6360_DATATYPE")
REAL_CURRENCY_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#REAL_MEASURE_IEC6360_DATATYPE")
REAL_MEASURE_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#STRING_IEC6360_DATATYPE")
STRING_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#STRING_TRANSLATABLE_IEC6360_DATATYPE")
STRING_TRANSLATABLE_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#TIMESTAMP_IEC6360_DATATYPE")
TIMESTAMP_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#TIME_IEC6360_DATATYPE")
TIME_IEC6360_DATATYPE,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#URL_IEC6360_DATATYPE")
URL_IEC6360_DATATYPE;

}
