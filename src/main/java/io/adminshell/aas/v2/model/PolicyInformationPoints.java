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
* Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions.
 * @param <Endpoint>
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultPolicyInformationPoints.class)
})
public interface PolicyInformationPoints<Endpoint> {

	/**
	* If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS.
	*
	* More information under http://admin-shell.io/aas/2/0#externalInformationPoints
	*
	* @return Returns the List of Endpoints for the property externalInformationPoints.
	*/
	@IRI("http://admin-shell.io/aas/2/0#externalInformationPoints")
	List<Endpoint> getExternalInformationPoints();

	/**
	* If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS.
	*
	* More information under http://admin-shell.io/aas/2/0#externalInformationPoints
	*
	* @param externalInformationPoints desired value for the property externalInformationPoints.
	*/
	 void setExternalInformationPoints (List<Endpoint> externalInformationPoints);

	/**
	* References to submodels defining information used by security access permission rules.
	*
	* More information under http://admin-shell.io/aas/2/0#internalInformationPoint
	*
	* @return Returns the List of Submodels for the property internalInformationPoints.
	*/
	@IRI("http://admin-shell.io/aas/2/0#internalInformationPoint")
	List<Submodel> getInternalInformationPoints();

	/**
	* References to submodels defining information used by security access permission rules.
	*
	* More information under http://admin-shell.io/aas/2/0#internalInformationPoint
	*
	* @param internalInformationPoints desired value for the property internalInformationPoints.
	*/
	 void setInternalInformationPoints (List<Submodel> internalInformationPoints);

}
