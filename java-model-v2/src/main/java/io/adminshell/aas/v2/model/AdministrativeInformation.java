/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.adminshell.aas.v2.model;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import io.adminshell.aas.v2.model.annotations.IRI;
import io.adminshell.aas.v2.model.annotations.KnownSubtypes;
import io.adminshell.aas.v2.model.builder.*;
import io.adminshell.aas.v2.model.impl.*;

/**
 * Every Identifiable may have administrative information. Administrative information includes for
 * example Information about the version of the element Information about who created or who made
 * the last change to the element Information about the languages available in case the element
 * contains text, for translating purposed also themmaster or default language may be definedIn the
 * first version of the AAS metamodel only version information as defined by IEC 61360 is defined.
 * In later versions additional attributes may be added.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)
})
public interface AdministrativeInformation {

    /**
     * Revision of the element. Constraint AASd-005: A revision requires a version. This means, if there
     * is no version there is no revision neither.
     *
     * More information under http://admin-shell.io/aas/2/0#revision
     *
     * @return Returns the List of Strings for the property revisions.
     */
    @IRI("http://admin-shell.io/aas/2/0#revision")
    List<String> getRevisions();

    /**
     * Revision of the element. Constraint AASd-005: A revision requires a version. This means, if there
     * is no version there is no revision neither.
     *
     * More information under http://admin-shell.io/aas/2/0#revision
     *
     * @param revisions desired value for the property revisions.
     */
    void setRevisions(List<String> revisions);

    /**
     * Version of the element.
     *
     * More information under http://admin-shell.io/aas/2/0#version
     *
     * @return Returns the List of Strings for the property versions.
     */
    @IRI("http://admin-shell.io/aas/2/0#version")
    List<String> getVersions();

    /**
     * Version of the element.
     *
     * More information under http://admin-shell.io/aas/2/0#version
     *
     * @param versions desired value for the property versions.
     */
    void setVersions(List<String> versions);

	void setDataSpecifications(List<Reference> dataSpecifications);

	List<Reference> getDataSpecifications();

	void add(AdministrativeInformation administration);

}
