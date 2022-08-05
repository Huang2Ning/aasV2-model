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
* An element that is referable by its idShort. This id is not globally unique. This id is unique within the name space of the element.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultReferable.class),
	@KnownSubtypes.Type(value = Identifiable.class),
	@KnownSubtypes.Type(value = ConceptDictionary.class),
	@KnownSubtypes.Type(value = View.class),
	@KnownSubtypes.Type(value = SubmodelElement.class),
	@KnownSubtypes.Type(value = AccessPermissionRule.class)
})
public interface Referable {

	/**
	* Reference to the next referable parent element of the element. Constraint AASd-004: Add parent in case of non-identifiable elements.
	*
	* This element is used to ease navigation in the model and thus it enables more performant
	*
	* More information under http://admin-shell.io/aas/2/0#parent
	*
	* @return Returns the List of Referables for the property parents.
	*/
	@IRI("http://admin-shell.io/aas/2/0#parent")
	List<Referable> getParents();

	/**
	* Reference to the next referable parent element of the element. Constraint AASd-004: Add parent in case of non-identifiable elements.
	*
	* This element is used to ease navigation in the model and thus it enables more performant
	*
	* More information under http://admin-shell.io/aas/2/0#parent
	*
	* @param parents desired value for the property parents.
	*/
	 void setParents (List<Referable> parents);

	/**
	* The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints.
	*
	* More information under http://admin-shell.io/aas/2/0#category
	*
	* @return Returns the List of Strings for the property categories.
	*/
	@IRI("http://admin-shell.io/aas/2/0#category")
	List<String> getCategories();

	/**
	* The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints.
	*
	* More information under http://admin-shell.io/aas/2/0#category
	*
	* @param categories desired value for the property categories.
	*/
	 void setCategories (List<String> categories);

	/**
	* Description or comments on the element. The description can be provided in several languages.
	*
	* More information under http://admin-shell.io/aas/2/0#description
	*
	* @return Returns the List of Strings for the property descriptions.
	*/
	@IRI("http://admin-shell.io/aas/2/0#description")
	List<String> getDescriptions();

	/**
	* Description or comments on the element. The description can be provided in several languages.
	*
	* More information under http://admin-shell.io/aas/2/0#description
	*
	* @param descriptions desired value for the property descriptions.
	*/
	 void setDescriptions (List<String> descriptions);

	/**
	* Identifying string of the element within its name space.
	*
	* Constraint AASd-001: In case of a referable element not being an identifiable element this id is mandatory and used for referring to the element in its name space.
	*
	* Constraint AASd-002: idShort shall only feature letters, digits, underscore ('_'); starting mandatory with a letter.
	*
	* Constraint AASd-003: idShort shall be matched case-insensitive.
	*
	* Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. 
	*
	* Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the 'BrowserPath' in OPC UA.
	*
	* More information under http://admin-shell.io/aas/2/0#idShort
	*
	* @return Returns the List of Strings for the property idShorts.
	*/
	@IRI("http://admin-shell.io/aas/2/0#idShort")
	List<String> getIdShorts();

	/**
	* Identifying string of the element within its name space.
	*
	* Constraint AASd-001: In case of a referable element not being an identifiable element this id is mandatory and used for referring to the element in its name space.
	*
	* Constraint AASd-002: idShort shall only feature letters, digits, underscore ('_'); starting mandatory with a letter.
	*
	* Constraint AASd-003: idShort shall be matched case-insensitive.
	*
	* Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. 
	*
	* Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the 'BrowserPath' in OPC UA.
	*
	* More information under http://admin-shell.io/aas/2/0#idShort
	*
	* @param idShorts desired value for the property idShorts.
	*/
	 void setIdShorts (List<String> idShorts);

}
