/*Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */

package io.adminshell.aas.v2.model.impl;

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
	* Default implementation of package io.adminshell.aas.v2.model.AccessControlPolicyPoints
	
* Container for access control policy points. 
*/

@IRI("http://admin-shell.io/aas/2/0#AccessControlPolicyPoints")
public class DefaultAccessControlPolicyPoints implements AccessControlPolicyPoints {

	
	@IRI("http://admin-shell.io/aas/2/0#policyAdministrationPoint")
	protected List<PolicyAdministrationPoint> policyAdministrationPoints = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#policyDecisionPoint")
	protected List<PolicyDecisionPoint> policyDecisionPoints = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#policyEnforcementPoint")
	protected List<PolicyEnforcementPoint> policyEnforcementPoints = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#policyInformationPoints")
	protected List<PolicyInformationPoints> policyInformationPoints = new ArrayList<>();


	public DefaultAccessControlPolicyPoints() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.policyAdministrationPoints,
			this.policyDecisionPoints,
			this.policyEnforcementPoints,
			this.policyInformationPoints);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAccessControlPolicyPoints other = (DefaultAccessControlPolicyPoints) obj;
			return Objects.equals(this.policyAdministrationPoints, other.policyAdministrationPoints) &&
				Objects.equals(this.policyDecisionPoints, other.policyDecisionPoints) &&
				Objects.equals(this.policyEnforcementPoints, other.policyEnforcementPoints) &&
				Objects.equals(this.policyInformationPoints, other.policyInformationPoints);
		}
	}


	
	@Override 
	public List<PolicyAdministrationPoint> getPolicyAdministrationPoints() {
		return policyAdministrationPoints;
	}
	
	@Override 
	 public void setPolicyAdministrationPoints (List<PolicyAdministrationPoint> policyAdministrationPoints) {
		this.policyAdministrationPoints = policyAdministrationPoints;
	}

	@Override 
	public List<PolicyDecisionPoint> getPolicyDecisionPoints() {
		return policyDecisionPoints;
	}
	
	@Override 
	 public void setPolicyDecisionPoints (List<PolicyDecisionPoint> policyDecisionPoints) {
		this.policyDecisionPoints = policyDecisionPoints;
	}

	@Override 
	public List<PolicyEnforcementPoint> getPolicyEnforcementPoints() {
		return policyEnforcementPoints;
	}
	
	@Override 
	 public void setPolicyEnforcementPoints (List<PolicyEnforcementPoint> policyEnforcementPoints) {
		this.policyEnforcementPoints = policyEnforcementPoints;
	}

	@Override 
	public List<PolicyInformationPoints> getPolicyInformationPoints() {
		return policyInformationPoints;
	}
	
	@Override 
	 public void setPolicyInformationPoints (List<PolicyInformationPoints> policyInformationPoints) {
		this.policyInformationPoints = policyInformationPoints;
	}
/**
	* This builder class can be used to construct a DefaultAccessControlPolicyPoints bean.
*/
	public static class Builder extends AccessControlPolicyPointsBuilder<DefaultAccessControlPolicyPoints, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAccessControlPolicyPoints newBuildingInstance() {
			return new DefaultAccessControlPolicyPoints();
		}
	}
}
