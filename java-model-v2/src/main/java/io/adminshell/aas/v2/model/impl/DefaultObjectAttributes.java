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
	* Default implementation of package io.adminshell.aas.v2.model.ObjectAttributes
	
* A set of data elements that describe object attributes. These attributes need to refer to a data element within an existing submodel. 
*/

@IRI("http://admin-shell.io/aas/2/0#ObjectAttributes")
public class DefaultObjectAttributes implements ObjectAttributes {

	
	@IRI("http://admin-shell.io/aas/2/0#objectAttribute")
	protected List<DataElement> objectAttributes = new ArrayList<>();


	public DefaultObjectAttributes() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.objectAttributes);
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
			DefaultObjectAttributes other = (DefaultObjectAttributes) obj;
			return Objects.equals(this.objectAttributes, other.objectAttributes);
		}
	}


	
	@Override 
	public List<DataElement> getObjectAttributes() {
		return objectAttributes;
	}
	
	@Override 
	 public void setObjectAttributes (List<DataElement> objectAttributes) {
		this.objectAttributes = objectAttributes;
	}
/**
	* This builder class can be used to construct a DefaultObjectAttributes bean.
*/
	public static class Builder extends ObjectAttributesBuilder<DefaultObjectAttributes, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultObjectAttributes newBuildingInstance() {
			return new DefaultObjectAttributes();
		}
	}
}
