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
* Enumeration of different key value types within a key. Contains KeyElements, ReferableElements, and IdentifiableElements. 
*/
@IRI("http://admin-shell.io/aas/2/0#KeyElement")
public enum KeyElement {

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#ACCESS_PERMISSION_RULE_REFERABLE_ELEMENT")
ACCESS_PERMISSION_RULE_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#ANNOTATED_RELATIONSHIP_ELEMENT_REFERABLE_ELEMENT")
ANNOTATED_RELATIONSHIP_ELEMENT_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#ASSET_ADMINISTRATION_SHELL_IDENTIFIABLE_ELEMENT")
ASSET_ADMINISTRATION_SHELL_IDENTIFIABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#ASSET_IDENTIFIABLE_ELEMENT")
ASSET_IDENTIFIABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#BASIC_EVENT_REFERABLE_ELEMENT")
BASIC_EVENT_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#BLOB_REFERABLE_ELEMENT")
BLOB_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#CAPABILITY_REFERABLE_ELEMENT")
CAPABILITY_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#CONCEPT_DESCRIPTION_IDENTIFIABLE_ELEMENT")
CONCEPT_DESCRIPTION_IDENTIFIABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#CONCEPT_DICTIONARY_REFERABLE_ELEMENT")
CONCEPT_DICTIONARY_REFERABLE_ELEMENT,

	/** 
	* 
	* Data Element is abstract, i.e. if a key uses 'DataElement' the reference may be a Property, a File etc.
	*/
	@IRI("http://admin-shell.io/aas/2/0#DATA_ELEMENT_REFERABLE_ELEMENT")
DATA_ELEMENT_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#ENTITY_REFERABLE_ELEMENT")
ENTITY_REFERABLE_ELEMENT,

	/** 
	* 
	* Event is abstract
	*/
	@IRI("http://admin-shell.io/aas/2/0#EVENT_REFERABLE_ELEMENT")
EVENT_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#FRAGMENT_REFERENCE_KEY_ELEMENT")
FRAGMENT_REFERENCE_KEY_ELEMENT,

	/** 
	* reference to an element not belonging to an asset administration shell
	*/
	@IRI("http://admin-shell.io/aas/2/0#GLOBAL_REFERENCE_KEY_ELEMENT")
GLOBAL_REFERENCE_KEY_ELEMENT,

	/** 
	* Property with a value that can be provided in multiple languages.
	*/
	@IRI("http://admin-shell.io/aas/2/0#MULTI_LANGUAGE_PROPERTY_REFERABLE_ELEMENT")
MULTI_LANGUAGE_PROPERTY_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#OPERATION_REFERABLE_ELEMENT")
OPERATION_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#PROPERTY_REFERABLE_ELEMENT")
PROPERTY_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#RANGE_REFERABLE_ELEMENT")
RANGE_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#REFERENCE_ELEMENT_REFERABLE_ELEMENT")
REFERENCE_ELEMENT_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#RELATIONSHIPT_ELEMENT_REFERABLE_ELEMENT")
RELATIONSHIPT_ELEMENT_REFERABLE_ELEMENT,

	/** 
	* Collection of Submodel Elements
	*/
	@IRI("http://admin-shell.io/aas/2/0#SUBMODEL_ELEMENT_COLLECTION_REFERABLE_ELEMENT")
SUBMODEL_ELEMENT_COLLECTION_REFERABLE_ELEMENT,

	/** 
	* 
	* Submodel Element is abstract, i.e. if a key uses �SubmodelElement� the reference may be a Property, a SubmodelElementCollection, an Operation etc.
	*/
	@IRI("http://admin-shell.io/aas/2/0#SUBMODEL_ELEMENT_REFERABLE_ELEMENT")
SUBMODEL_ELEMENT_REFERABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#SUBMODEL_IDENTIFIABLE_ELEMENT")
SUBMODEL_IDENTIFIABLE_ELEMENT,

	/** 
	* 
	*/
	@IRI("http://admin-shell.io/aas/2/0#VIEW_REFERABLE_ELEMENT")
VIEW_REFERABLE_ELEMENT;

}
