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
* A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultQualifier.class)
})
public interface Qualifier {

	/**
	* The qualifier type describes the type of the qualifier that is applied to the element.
	*
	* More information under http://admin-shell.io/aas/2/0#qualifierType
	*
	* @return Returns the List of Strings for the property qualifierTypes.
	*/
	@IRI("http://admin-shell.io/aas/2/0#qualifierType")
	List<String> getQualifierTypes();

	/**
	* The qualifier type describes the type of the qualifier that is applied to the element.
	*
	* More information under http://admin-shell.io/aas/2/0#qualifierType
	*
	* @param qualifierTypes desired value for the property qualifierTypes.
	*/
	 void setQualifierTypes (List<String> qualifierTypes);

	/**
	* The qualifier value is the value of the qualifier.
	*
	* Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId.
	*
	* More information under http://admin-shell.io/aas/2/0#qualifierValue
	*
	* @return Returns the List of Strings for the property qualifierValues.
	*/
	@IRI("http://admin-shell.io/aas/2/0#qualifierValue")
	List<String> getQualifierValues();

	/**
	* The qualifier value is the value of the qualifier.
	*
	* Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId.
	*
	* More information under http://admin-shell.io/aas/2/0#qualifierValue
	*
	* @param qualifierValues desired value for the property qualifierValues.
	*/
	 void setQualifierValues (List<String> qualifierValues);

	/**
	* Reference to the global unqiue id of a coded value.
	*
	* More information under http://admin-shell.io/aas/2/0#qualifierValueId
	*
	* @return Returns the List of References for the property qualifierValueIds.
	*/
	@IRI("http://admin-shell.io/aas/2/0#qualifierValueId")
	List<Reference> getQualifierValueIds();

	/**
	* Reference to the global unqiue id of a coded value.
	*
	* More information under http://admin-shell.io/aas/2/0#qualifierValueId
	*
	* @param qualifierValueIds desired value for the property qualifierValueIds.
	*/
	 void setQualifierValueIds (List<Reference> qualifierValueIds);

	void setSemanticId(Reference semanticId);

	Reference getSemanticId();

}
