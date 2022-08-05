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

public abstract class AccessControlBuilder<T extends AccessControl, B extends AccessControlBuilder<T, B>> extends ExtendableBuilder<T, B> {

	/**
	* This function allows setting a value for defaultEnvironmentAttributes
	* @param defaultEnvironmentAttributes desired value to be set
	* @return Builder object with new value for defaultEnvironmentAttributes
	*/
	public B defaultEnvironmentAttributes(List<Submodel> defaultEnvironmentAttributes) {
		getBuildingInstance().setDefaultEnvironmentAttributes(defaultEnvironmentAttributes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List defaultEnvironmentAttributes
	* @param defaultEnvironmentAttributes desired value to be added
	* @return Builder object with new value for defaultEnvironmentAttributes
	*/
	public B defaultEnvironmentAttributes(Submodel defaultEnvironmentAttributes) {
		getBuildingInstance().getDefaultEnvironmentAttributes().add(defaultEnvironmentAttributes);
		return getSelf();
	}


	/**
	* This function allows setting a value for defaultPermissions
	* @param defaultPermissions desired value to be set
	* @return Builder object with new value for defaultPermissions
	*/
	public B defaultPermissions(List<Submodel> defaultPermissions) {
		getBuildingInstance().setDefaultPermissions(defaultPermissions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List defaultPermissions
	* @param defaultPermissions desired value to be added
	* @return Builder object with new value for defaultPermissions
	*/
	public B defaultPermissions(Submodel defaultPermissions) {
		getBuildingInstance().getDefaultPermissions().add(defaultPermissions);
		return getSelf();
	}


	/**
	* This function allows setting a value for defaultSubjectAttributes
	* @param defaultSubjectAttributes desired value to be set
	* @return Builder object with new value for defaultSubjectAttributes
	*/
	public B defaultSubjectAttributes(List<Submodel> defaultSubjectAttributes) {
		getBuildingInstance().setDefaultSubjectAttributes(defaultSubjectAttributes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List defaultSubjectAttributes
	* @param defaultSubjectAttributes desired value to be added
	* @return Builder object with new value for defaultSubjectAttributes
	*/
	public B defaultSubjectAttributes(Submodel defaultSubjectAttributes) {
		getBuildingInstance().getDefaultSubjectAttributes().add(defaultSubjectAttributes);
		return getSelf();
	}


	/**
	* This function allows setting a value for selectableEnvironmentAttributes
	* @param selectableEnvironmentAttributes desired value to be set
	* @return Builder object with new value for selectableEnvironmentAttributes
	*/
	public B selectableEnvironmentAttributes(List<Submodel> selectableEnvironmentAttributes) {
		getBuildingInstance().setSelectableEnvironmentAttributes(selectableEnvironmentAttributes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List selectableEnvironmentAttributes
	* @param selectableEnvironmentAttributes desired value to be added
	* @return Builder object with new value for selectableEnvironmentAttributes
	*/
	public B selectableEnvironmentAttributes(Submodel selectableEnvironmentAttributes) {
		getBuildingInstance().getSelectableEnvironmentAttributes().add(selectableEnvironmentAttributes);
		return getSelf();
	}


	/**
	* This function allows setting a value for accessPermissionRules
	* @param accessPermissionRules desired value to be set
	* @return Builder object with new value for accessPermissionRules
	*/
	public B accessPermissionRules(List<AccessPermissionRule> accessPermissionRules) {
		getBuildingInstance().setAccessPermissionRules(accessPermissionRules);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List accessPermissionRules
	* @param accessPermissionRule desired value to be added
	* @return Builder object with new value for accessPermissionRules
	*/
	public B accessPermissionRule(AccessPermissionRule accessPermissionRule) {
		getBuildingInstance().getAccessPermissionRules().add(accessPermissionRule);
		return getSelf();
	}


	/**
	* This function allows setting a value for selectableSubjectAttributes
	* @param selectableSubjectAttributes desired value to be set
	* @return Builder object with new value for selectableSubjectAttributes
	*/
	public B selectableSubjectAttributes(List<Submodel> selectableSubjectAttributes) {
		getBuildingInstance().setSelectableSubjectAttributes(selectableSubjectAttributes);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List selectableSubjectAttributes
	* @param selectableSubjectAttributes desired value to be added
	* @return Builder object with new value for selectableSubjectAttributes
	*/
	public B selectableSubjectAttributes(Submodel selectableSubjectAttributes) {
		getBuildingInstance().getSelectableSubjectAttributes().add(selectableSubjectAttributes);
		return getSelf();
	}


	/**
	* This function allows setting a value for selectablePermissions
	* @param selectablePermissions desired value to be set
	* @return Builder object with new value for selectablePermissions
	*/
	public B selectablePermissions(List<Submodel> selectablePermissions) {
		getBuildingInstance().setSelectablePermissions(selectablePermissions);
		return getSelf();
	}

	/**
	* This function allows adding a value to the List selectablePermissions
	* @param selectablePermissions desired value to be added
	* @return Builder object with new value for selectablePermissions
	*/
	public B selectablePermissions(Submodel selectablePermissions) {
		getBuildingInstance().getSelectablePermissions().add(selectablePermissions);
		return getSelf();
	}
}
