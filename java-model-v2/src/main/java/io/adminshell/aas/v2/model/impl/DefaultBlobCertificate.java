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
	* Default implementation of package io.adminshell.aas.v2.model.BlobCertificate
	
* Certificate provided as BLOB. 
*/

@IRI("http://admin-shell.io/aas/2/0#BlobCertificate")
public class DefaultBlobCertificate implements BlobCertificate {

	
	@IRI("http://admin-shell.io/aas/2/0#blobCertificate")
	protected List<Blob> blobCertificates = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#containedExtension")
	protected List<Reference> containedExtensions = new ArrayList<>();


	
	@IRI("http://admin-shell.io/aas/2/0#lastCertificate")
	protected List<Boolean> lastCertificates = new ArrayList<>();


	public DefaultBlobCertificate() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.blobCertificates,
			this.containedExtensions,
			this.lastCertificates);
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
			DefaultBlobCertificate other = (DefaultBlobCertificate) obj;
			return Objects.equals(this.blobCertificates, other.blobCertificates) &&
				Objects.equals(this.containedExtensions, other.containedExtensions) &&
				Objects.equals(this.lastCertificates, other.lastCertificates);
		}
	}


	
	@Override 
	public List<Blob> getBlobCertificates() {
		return blobCertificates;
	}
	
	@Override 
	 public void setBlobCertificates (List<Blob> blobCertificates) {
		this.blobCertificates = blobCertificates;
	}

	@Override 
	public List<Reference> getContainedExtensions() {
		return containedExtensions;
	}
	
	@Override 
	 public void setContainedExtensions (List<Reference> containedExtensions) {
		this.containedExtensions = containedExtensions;
	}

	@Override 
	public List<Boolean> getLastCertificates() {
		return lastCertificates;
	}
	
	@Override 
	 public void setLastCertificates (List<Boolean> lastCertificates) {
		this.lastCertificates = lastCertificates;
	}
/**
	* This builder class can be used to construct a DefaultBlobCertificate bean.
*/
	public static class Builder extends BlobCertificateBuilder<DefaultBlobCertificate, Builder> {

		@Override
		protected Builder getSelf() {
			return this;
	}

		@Override
		protected DefaultBlobCertificate newBuildingInstance() {
			return new DefaultBlobCertificate();
		}
	}
}
