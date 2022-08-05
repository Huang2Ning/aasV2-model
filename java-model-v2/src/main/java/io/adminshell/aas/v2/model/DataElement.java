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
* A data element is a submodel element that is not further composed out of other submodel elements. A data element is a submodel element that has a value. The type of value differs for different subtypes of data elements.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultDataElement.class),
	@KnownSubtypes.Type(value = Blob.class),
	@KnownSubtypes.Type(value = Range.class),
	@KnownSubtypes.Type(value = MultiLanguageProperty.class),
	@KnownSubtypes.Type(value = Property.class),
	@KnownSubtypes.Type(value = ReferenceElement.class)
})
public interface DataElement {

	void setDataSpecifications(List<Reference> dataSpecifications);

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

	void setSemanticId(Reference semanticId);

	Reference getSemanticId();


}
