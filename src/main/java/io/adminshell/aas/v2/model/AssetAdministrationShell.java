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
* Describes the Administration Shell for Assets, Products, Components, e.g. Machines
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell {

	/**
	* An AAS max have one or more concept dictionaries assigned to it. The concept dictionaries typically contain only descriptions for elements that are also used within the AAS (via HasSemantics).
	*
	* More information under http://admin-shell.io/aas/2/0#conceptDictionary
	*
	* @return Returns the List of ConceptDictionarys for the property conceptDictionaries.
	*/
	@IRI("http://admin-shell.io/aas/2/0#conceptDictionary")
	List<ConceptDictionary> getConceptDictionaries();

	/**
	* An AAS max have one or more concept dictionaries assigned to it. The concept dictionaries typically contain only descriptions for elements that are also used within the AAS (via HasSemantics).
	*
	* More information under http://admin-shell.io/aas/2/0#conceptDictionary
	*
	* @param conceptDictionaries desired value for the property conceptDictionaries.
	*/
	 void setConceptDictionaries (List<ConceptDictionary> conceptDictionaries);

	/**
	* This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds.
	*
	* More information under http://admin-shell.io/aas/2/0#derivedFrom
	*
	* @return Returns the List of References for the property derivedFroms.
	*/
	@IRI("http://admin-shell.io/aas/2/0#derivedFrom")
	List<Reference> getDerivedFroms();

	/**
	* This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds.
	*
	* More information under http://admin-shell.io/aas/2/0#derivedFrom
	*
	* @param derivedFroms desired value for the property derivedFroms.
	*/
	 void setDerivedFroms (List<Reference> derivedFroms);

	/**
	* Connect the Asset with the Administration Shell
	*
	* More information under http://admin-shell.io/aas/2/0#describes
	*
	* @return Returns the List of Assets for the property describes.
	*/
	@IRI("http://admin-shell.io/aas/2/0#describes")
	List<Asset> getDescribes();

	/**
	* Connect the Asset with the Administration Shell
	*
	* More information under http://admin-shell.io/aas/2/0#describes
	*
	* @param describes desired value for the property describes.
	*/
	 void setDescribes (List<Asset> describes);

	/**
	* Definition of the security relevant aspects of the AAS.
	*
	* More information under http://admin-shell.io/aas/2/0#security
	*
	*/;
	
	Security getSecurity();
	/**
	* Definition of the security relevant aspects of the AAS.
	*
	* More information under http://admin-shell.io/aas/2/0#security
	*
	* @param securities desired value for the property securities.
	*/
	 void setSecurity(Security security);
	 
	/**
	* Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
	*
	* More information under http://admin-shell.io/aas/2/0#submodel
	*
	* @return Returns the List of Submodels for the property submodels.
	*/
	@IRI("http://admin-shell.io/aas/2/0#submodel")
	List<Submodel> getSubmodels();

	/**
	* Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
	*
	* More information under http://admin-shell.io/aas/2/0#submodel
	*
	* @param submodels desired value for the property submodels.
	*/
	 void setSubmodels (List<Submodel> submodels);

	/**
	* Points to the differents views associated to the Administration Shell via the Submodels.
	*
	* More information under http://admin-shell.io/aas/2/0#view
	*
	* @return Returns the List of Views for the property views.
	*/
	@IRI("http://admin-shell.io/aas/2/0#view")
	List<View> getViews();

	/**
	* Points to the differents views associated to the Administration Shell via the Submodels.
	*
	* More information under http://admin-shell.io/aas/2/0#view
	*
	* @param views desired value for the property views.
	*/
	 void setViews (List<View> views);

	void setAdministrations(List<AdministrativeInformation> administrations);

	List<AdministrativeInformation> getAdministrations();

	void setIdentification(Identifier identification);

	void setParents(List<Referable> parents);

	List<Referable> getParents();

	void setCategories(List<String> categories);

	List<String> getCategories();

	void setDescriptions(List<String> descriptions);

	List<String> getDescriptions();

	void setIdShorts(List<String> idShorts);

	List<String> getIdShorts();

	void setDataSpecifications(List<Reference> dataSpecifications);

	List<Reference> getDataSpecifications();

	List<Identifier> getIdentifications();

	void setIdentification(List<Identifier> identifications);

}
