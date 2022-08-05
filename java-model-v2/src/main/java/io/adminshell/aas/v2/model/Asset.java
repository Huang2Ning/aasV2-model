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
* An Asset describes meta data of an asset that is represented by an AAS. The asset may either represent an asset type or an asset instance. The asset has a globally unique identifier plus � if needed � additional domain specific (proprietary) identifiers.
* Objects may be known in the form of a type or of an instance. An object in the planning phase is known as a type
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAsset.class)
})
public interface Asset {

	/**
	* Denotes whether the Asset of of kind 'Type' or 'Instance'.
	*
	* More information under http://admin-shell.io/aas/2/0#assetKind
	*
	* @return Returns the List of AssetKinds for the property assetKinds.
	*/
	@IRI("http://admin-shell.io/aas/2/0#assetKind")
	List<AssetKind> getAssetKinds();

	/**
	* Denotes whether the Asset of of kind 'Type' or 'Instance'.
	*
	* More information under http://admin-shell.io/aas/2/0#assetKind
	*
	* @param assetKinds desired value for the property assetKinds.
	*/
	 void setAssetKinds (List<AssetKind> assetKinds);

	/**
	* A reference to a Submodel that defines the handling of additional domain specific (proprietary) Identifiers for the asset like e.g. serial number etc.
	*
	* More information under http://admin-shell.io/aas/2/0#assetIdentificationModel
	*
	* @return Returns the List of References for the property assetIdentificationModels.
	*/
	@IRI("http://admin-shell.io/aas/2/0#assetIdentificationModel")
	List<Reference> getAssetIdentificationModels();

	/**
	* A reference to a Submodel that defines the handling of additional domain specific (proprietary) Identifiers for the asset like e.g. serial number etc.
	*
	* More information under http://admin-shell.io/aas/2/0#assetIdentificationModel
	*
	* @param assetIdentificationModels desired value for the property assetIdentificationModels.
	*/
	 void setAssetIdentificationModels (List<Reference> assetIdentificationModels);

	/**
	* Bill of material of the asaset represented by a submodel of the same AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component.
	*
	* More information under http://admin-shell.io/aas/2/0#billOfMaterial
	*
	* @return Returns the List of References for the property billOfMaterials.
	*/
	@IRI("http://admin-shell.io/aas/2/0#billOfMaterial")
	List<Reference> getBillOfMaterials();

	/**
	* Bill of material of the asaset represented by a submodel of the same AAS. This submodel contains a set of entities describing the material used to compose the composite I4.0 Component.
	*
	* More information under http://admin-shell.io/aas/2/0#billOfMaterial
	*
	* @param billOfMaterials desired value for the property billOfMaterials.
	*/
	 void setBillOfMaterials (List<Reference> billOfMaterials);

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

}
