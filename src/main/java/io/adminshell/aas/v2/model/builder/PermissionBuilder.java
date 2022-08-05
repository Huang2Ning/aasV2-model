/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v2.model.builder;

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

public abstract class PermissionBuilder<T extends Permission, B extends PermissionBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for permissions
	* @param permissions desired value to be set
	* @return Builder object with new value for permissions
	*/
	public B permissions(List<Property> permissions) {
		getBuildingInstance().setPermissions(permissions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List permissions
	* @param permission desired value to be added
	* @return Builder object with new value for permissions
	*/
	public B permission(Property permission) {
		getBuildingInstance().getPermissions().add(permission);
		return getSelf();
	}


	/**
	* This function allows setting a value for kindOfPermissions
	* @param kindOfPermissions desired value to be set
	* @return Builder object with new value for kindOfPermissions
	*/
	public B kindOfPermissions(List<PermissionKind> kindOfPermissions) {
		getBuildingInstance().setKindOfPermissions(kindOfPermissions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List kindOfPermissions
	* @param kindOfPermission desired value to be added
	* @return Builder object with new value for kindOfPermissions
	*/
	public B kindOfPermission(PermissionKind kindOfPermission) {
		getBuildingInstance().getKindOfPermissions().add(kindOfPermission);
		return getSelf();
	}
}
