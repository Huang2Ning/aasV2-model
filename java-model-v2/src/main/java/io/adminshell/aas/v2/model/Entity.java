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
* An entity is a submodel element that is used to model entities.
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultEntity.class)
})
public interface Entity {

	/**
	* Describes whether the entity is a co-managed entity or a self-managed entity.
	*
	* More information under http://admin-shell.io/aas/2/0#entityType
	*
	* @return Returns the List of EntityTypes for the property entityTypes.
	*/
	@IRI("http://admin-shell.io/aas/2/0#entityType")
	List<EntityType> getEntityTypes();

	/**
	* Describes whether the entity is a co-managed entity or a self-managed entity.
	*
	* More information under http://admin-shell.io/aas/2/0#entityType
	*
	* @param entityTypes desired value for the property entityTypes.
	*/
	 void setEntityTypes (List<EntityType> entityTypes);

	/**
	* Describes statements applicable to the entity by a set of submodel elements, typically with a qualified value.
	*
	* More information under http://admin-shell.io/aas/2/0#statement
	*
	* @return Returns the List of SubmodelElements for the property statements.
	*/
	@IRI("http://admin-shell.io/aas/2/0#statement")
	List<SubmodelElement> getStatements();

	/**
	* Describes statements applicable to the entity by a set of submodel elements, typically with a qualified value.
	*
	* More information under http://admin-shell.io/aas/2/0#statement
	*
	* @param statements desired value for the property statements.
	*/
	 void setStatements (List<SubmodelElement> statements);

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
