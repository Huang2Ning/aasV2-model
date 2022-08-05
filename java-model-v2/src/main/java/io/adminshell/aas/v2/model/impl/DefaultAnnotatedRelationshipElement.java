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
	* Default implementation of package io.adminshell.aas.v2.model.AnnotatedRelationshipElement
	
* An annotated relationship element is an relationship element that can be annotated with additional data elements. 
*/

@IRI("http://admin-shell.io/aas/2/0#AnnotatedRelationshipElement")
public class DefaultAnnotatedRelationshipElement implements AnnotatedRelationshipElement {

	protected List<Reference> annotations = new ArrayList<>();
	protected Reference semanticIds;
	
	@IRI("http://admin-shell.io/aas/2/0#category")
	protected List<String> categories = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#dataSpecification")
	protected List<Reference> dataSpecifications = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#description")
	protected List<String> descriptions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#idShort")
	protected List<String> idShorts = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#kind")
	protected List<ModelingKind> kinds = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#parent")
	protected List<Referable> parents = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#qualifier")
	protected List<Constraint> qualifiers = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#relationshipFirst")
	protected List<Referable> relationshipFirsts = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#relationshipSecond")
	protected List<Referable> relationshipSeconds = new ArrayList<>();



	public DefaultAnnotatedRelationshipElement() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.annotations,
			this.relationshipFirsts,
			this.relationshipSeconds,
			this.dataSpecifications,
			this.kinds,
			this.parents,
			this.categories,
			this.descriptions,
			this.idShorts,
			this.qualifiers,
			this.semanticIds);
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
			DefaultAnnotatedRelationshipElement other = (DefaultAnnotatedRelationshipElement) obj;
			return Objects.equals(this.relationshipFirsts, other.relationshipFirsts) &&
				Objects.equals(this.relationshipSeconds, other.relationshipSeconds) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.kinds, other.kinds) &&
				Objects.equals(this.parents, other.parents) &&
				Objects.equals(this.categories, other.categories) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.idShorts, other.idShorts) &&
				Objects.equals(this.qualifiers, other.qualifiers);
		}
	}


	
	@Override
    public List<Reference> getAnnotations() {
        return annotations;
    }

    @Override
    public void setAnnotations(List<Reference> annotations) {
        this.annotations = annotations;
    }


	@Override 
	public List<Referable> getRelationshipFirsts() {
		return relationshipFirsts;
	}
	
	@Override 
	 public void setRelationshipFirsts (List<Referable> relationshipFirsts) {
		this.relationshipFirsts = relationshipFirsts;
	}

	@Override 
	public List<Referable> getRelationshipSeconds() {
		return relationshipSeconds;
	}
	
	@Override 
	 public void setRelationshipSeconds (List<Referable> relationshipSeconds) {
		this.relationshipSeconds = relationshipSeconds;
	}


	@Override 
	public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	@Override 
	 public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@Override 
	public List<ModelingKind> getKinds() {
		return kinds;
	}
	
	@Override 
	 public void setKinds (List<ModelingKind> kinds) {
		this.kinds = kinds;
	}

	@Override 
	public List<Referable> getParents() {
		return parents;
	}
	
	@Override 
	 public void setParents (List<Referable> parents) {
		this.parents = parents;
	}

	@Override 
	public List<String> getCategories() {
		return categories;
	}
	
	@Override 
	 public void setCategories (List<String> categories) {
		this.categories = categories;
	}

	@Override 
	public List<String> getDescriptions() {
		return descriptions;
	}
	
	@Override 
	 public void setDescriptions (List<String> descriptions) {
		this.descriptions = descriptions;
	}

	@Override 
	public List<String> getIdShorts() {
		return idShorts;
	}
	
	@Override 
	 public void setIdShorts (List<String> idShorts) {
		this.idShorts = idShorts;
	}

	@Override 
	public List<Constraint> getQualifiers() {
		return qualifiers;
	}
	
	@Override 
	 public void setQualifiers (List<Constraint> qualifiers) {
		this.qualifiers = qualifiers;
	}
	
	@Override
    public void setSemanticId(Reference semanticId) {
        this.semanticIds = semanticId;
    }

/**
	* This builder class can be used to construct a DefaultAnnotatedRelationshipElement bean.
*/
	public static class Builder extends AnnotatedRelationshipElementBuilder<DefaultAnnotatedRelationshipElement, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultAnnotatedRelationshipElement newBuildingInstance() {
			return new DefaultAnnotatedRelationshipElement();
		}
	}

}
