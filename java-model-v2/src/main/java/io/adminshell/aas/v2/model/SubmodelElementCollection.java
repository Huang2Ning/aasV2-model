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
* A submodel element collection is a set or list of submodel elements.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultSubmodelElementCollection.class)
})
public interface SubmodelElementCollection {

	/**
	* If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false
	*
	* More information under http://admin-shell.io/aas/2/0#allowDuplicates
	*
	* @return Returns the List of Booleans for the property allowDuplicates.
	*/
	@IRI("http://admin-shell.io/aas/2/0#allowDuplicates")
	List<Boolean> getAllowDuplicates();

	/**
	* If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false
	*
	* More information under http://admin-shell.io/aas/2/0#allowDuplicates
	*
	* @param allowDuplicates desired value for the property allowDuplicates.
	*/
	 void setAllowDuplicates (List<Boolean> allowDuplicates);

	/**
	* If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false
	*
	* More information under http://admin-shell.io/aas/2/0#ordered
	*
	* @return Returns the List of Booleans for the property ordereds.
	*/
	@IRI("http://admin-shell.io/aas/2/0#ordered")
	List<Boolean> getOrdereds();

	/**
	* If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false
	*
	* More information under http://admin-shell.io/aas/2/0#ordered
	*
	* @param ordereds desired value for the property ordereds.
	*/
	 void setOrdereds (List<Boolean> ordereds);

	void setSemanticId(Reference semanticId);

	List<Reference> getDataSpecifications();

	void setKinds(List<ModelingKind> kinds);

	List<ModelingKind> getKinds();

	void setParents(List<Referable> parents);

	List<Referable> getParents();

	void setCategories(List<String> categories);

	List<String> getCategories();

	void setDescriptions(List<String> descriptions);

	List<String> getDescriptions();

	void setIdShorts(List<String> idShorts);

	List<String> getIdShorts();

	void setQualifiers(List<Constraint> qualifiers);

	List<Constraint> getQualifiers();

	void setDataSpecifications(List<Reference> dataSpecifications);

	Reference getSemanticId();


}
