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
* Definition of a security administration point (PDP).
 * @param <E>
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultPolicyAdministrationPoint.class)
})
public interface PolicyAdministrationPoint<E> {

	/**
	* The policy administration point of access control as realized by the AAS itself.
	*
	* Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control.
	*
	* More information under http://admin-shell.io/aas/2/0#localAccessControl
	*
	* @return Returns the List of AccessControls for the property localAccessControls.
	*/
	@IRI("http://admin-shell.io/aas/2/0#localAccessControl")
	List<AccessControl> getLocalAccessControls();

	/**
	* The policy administration point of access control as realized by the AAS itself.
	*
	* Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control.
	*
	* More information under http://admin-shell.io/aas/2/0#localAccessControl
	*
	* @param localAccessControls desired value for the property localAccessControls.
	*/
	 void setLocalAccessControls (List<AccessControl> localAccessControls);

	/**
	* Endpoint to an external access control defining a policy administration point to be used by the AAS.
	*
	* More information under http://admin-shell.io/aas/2/0#externalAccessControl
	*
	* @return Returns the List of Endpoints for the property externalAccessControls.
	*/
	@IRI("http://admin-shell.io/aas/2/0#externalAccessControl")
	List<E> getExternalAccessControls();

	/**
	* Endpoint to an external access control defining a policy administration point to be used by the AAS.
	*
	* More information under http://admin-shell.io/aas/2/0#externalAccessControl
	*
	* @param externalAccessControls desired value for the property externalAccessControls.
	*/
	 void setExternalAccessControls (List<E> externalAccessControls);

}
