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
	* Default implementation of package io.adminshell.aas.v2.model.Qualifier
	
* A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element. 
*/

@IRI("http://admin-shell.io/aas/2/0#Qualifier")
public class DefaultQualifier implements Qualifier {

	
	@IRI("http://admin-shell.io/aas/2/0#qualifierType")
	protected List<String> qualifierTypes = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#qualifierValue")
	protected List<String> qualifierValues = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#qualifierValueId")
	protected List<Reference> qualifierValueIds = new ArrayList<>();

	protected Reference semanticId;

	public DefaultQualifier() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.qualifierTypes,
			this.qualifierValues,
			this.qualifierValueIds,
			this.semanticId);
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
			DefaultQualifier other = (DefaultQualifier) obj;
			return Objects.equals(this.qualifierTypes, other.qualifierTypes) &&
				Objects.equals(this.qualifierValues, other.qualifierValues) &&
				Objects.equals(this.qualifierValueIds, other.qualifierValueIds);
		}
	}


	
	@Override 
	public List<String> getQualifierTypes() {
		return qualifierTypes;
	}
	
	@Override 
	 public void setQualifierTypes (List<String> qualifierTypes) {
		this.qualifierTypes = qualifierTypes;
	}

	@Override 
	public List<String> getQualifierValues() {
		return qualifierValues;
	}
	
	@Override 
	 public void setQualifierValues (List<String> qualifierValues) {
		this.qualifierValues = qualifierValues;
	}

	@Override 
	public List<Reference> getQualifierValueIds() {
		return qualifierValueIds;
	}
	
	@Override 
	 public void setQualifierValueIds (List<Reference> qualifierValueIds) {
		this.qualifierValueIds = qualifierValueIds;
	}


	 @Override
	    public Reference getSemanticId() {
	        return semanticId;
	    }

	    @Override
	    public void setSemanticId(Reference semanticId) {
	        this.semanticId = semanticId;
	    }
/**
	* This builder class can be used to construct a DefaultQualifier bean.
*/
	public static class Builder extends QualifierBuilder<DefaultQualifier, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultQualifier newBuildingInstance() {
			return new DefaultQualifier();
		}
	}
}
