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



import io.adminshell.aas.v2.model.annotations.IRI;
import io.adminshell.aas.v2.model.annotations.KnownSubtypes;
import io.adminshell.aas.v2.model.builder.*;
import io.adminshell.aas.v2.model.impl.*;

/**
 * Container for access control policy points.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControlPolicyPoints.class)
})
public interface AccessControlPolicyPoints {

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyAdministrationPoint
     *
     * @return Returns the List of PolicyAdministrationPoints for the property
     *         policyAdministrationPoints.
     */
    @IRI("http://admin-shell.io/aas/2/0#policyAdministrationPoint")
    List<PolicyAdministrationPoint> getPolicyAdministrationPoints();

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyAdministrationPoint
     *
     * @param policyAdministrationPoints desired value for the property policyAdministrationPoints.
     */
    void setPolicyAdministrationPoints(List<PolicyAdministrationPoint> policyAdministrationPoints);

    /**
     * The access control policy decision point of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyDecisionPoint
     *
     * @return Returns the List of PolicyDecisionPoints for the property policyDecisionPoints.
     */
    @IRI("http://admin-shell.io/aas/2/0#policyDecisionPoint")
    List<PolicyDecisionPoint> getPolicyDecisionPoints();

    /**
     * The access control policy decision point of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyDecisionPoint
     *
     * @param policyDecisionPoints desired value for the property policyDecisionPoints.
     */
    void setPolicyDecisionPoints(List<PolicyDecisionPoint> policyDecisionPoints);

    /**
     * The access control policy enforcement point of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyEnforcementPoint
     *
     * @return Returns the List of PolicyEnforcementPoints for the property policyEnforcementPoints.
     */
    @IRI("http://admin-shell.io/aas/2/0#policyEnforcementPoint")
    List<PolicyEnforcementPoint> getPolicyEnforcementPoints();

    /**
     * The access control policy enforcement point of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyEnforcementPoint
     *
     * @param policyEnforcementPoints desired value for the property policyEnforcementPoints.
     */
    void setPolicyEnforcementPoints(List<PolicyEnforcementPoint> policyEnforcementPoints);

    /**
     * The access control policy information points of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyInformationPoints
     *
     * @return Returns the List of PolicyInformationPointss for the property policyInformationPoints.
     */
    @IRI("http://admin-shell.io/aas/2/0#policyInformationPoints")
    List<PolicyInformationPoints> getPolicyInformationPoints();

    /**
     * The access control policy information points of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#policyInformationPoints
     *
     * @param policyInformationPoints desired value for the property policyInformationPoints.
     */
    void setPolicyInformationPoints(List<PolicyInformationPoints> policyInformationPoints);

}
