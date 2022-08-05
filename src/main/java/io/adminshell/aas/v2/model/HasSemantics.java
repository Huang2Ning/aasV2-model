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
* Element that can have a semantic definition. Identifier of the semantic definition of the element. It is called semantic id of the element. The semantic id may either reference an external global id or it may reference a referable model element of kind=Type that defines the semantics of the element.
* In many cases the idShort is identical to the English short name within the semantic definition as referenced vi aits semantic id.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultHasSemantics.class),
	@KnownSubtypes.Type(value = View.class),
	@KnownSubtypes.Type(value = Submodel.class),
	@KnownSubtypes.Type(value = Qualifier.class),
	@KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface HasSemantics {

	/**
	* Points to the Expression Semantic of the Submodels
	*
	* The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard).
	*
	* More information under http://admin-shell.io/aas/2/0#semanticId
	*
	*/
	Reference getSemanticId();

	/**
	* Points to the Expression Semantic of the Submodels
	*
	* The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard).
	*
	* More information under http://admin-shell.io/aas/2/0#semanticId
	*
	* @param semanticIds desired value for the property semanticIds.
	*/
	void setSemanticId(Reference semanticId);

}
