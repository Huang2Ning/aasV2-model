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
 * Access Control defines the local access control policy administration point. Access Control has
 * the major task to define the access permission rules.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControl.class)
})
public interface AccessControl {

    /**
     * Reference to a submodel defining default environment attributes, i.e. attributes that are not
     * describing the asset itself. The submodel is of kind=Type. At the same type the values of these
     * environment attributes need to be accessible when evaluating the access permission rules. This is
     * realized as a policy information point.
     *
     * More information under http://admin-shell.io/aas/2/0#defaultEnvironmentAttributes
     *
     * @return Returns the List of Submodels for the property defaultEnvironmentAttributes.
     */
    @IRI("http://admin-shell.io/aas/2/0#defaultEnvironmentAttributes")
    List<Submodel> getDefaultEnvironmentAttributes();

    /**
     * Reference to a submodel defining default environment attributes, i.e. attributes that are not
     * describing the asset itself. The submodel is of kind=Type. At the same type the values of these
     * environment attributes need to be accessible when evaluating the access permission rules. This is
     * realized as a policy information point.
     *
     * More information under http://admin-shell.io/aas/2/0#defaultEnvironmentAttributes
     *
     * @param defaultEnvironmentAttributes desired value for the property defaultEnvironmentAttributes.
     */
    void setDefaultEnvironmentAttributes(List<Submodel> defaultEnvironmentAttributes);

    /**
     * Reference to a submodel defining the default permissions for the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#defaultPermissions
     *
     * @return Returns the List of Submodels for the property defaultPermissions.
     */
    @IRI("http://admin-shell.io/aas/2/0#defaultPermissions")
    List<Submodel> getDefaultPermissions();

    /**
     * Reference to a submodel defining the default permissions for the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#defaultPermissions
     *
     * @param defaultPermissions desired value for the property defaultPermissions.
     */
    void setDefaultPermissions(List<Submodel> defaultPermissions);

    /**
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules. The submodel is of kind=Type.
     *
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules.
     *
     * The submodel is of kind=Type.
     *
     * More information under http://admin-shell.io/aas/2/0#defaultSubjectAttributes
     *
     * @return Returns the List of Submodels for the property defaultSubjectAttributes.
     */
    @IRI("http://admin-shell.io/aas/2/0#defaultSubjectAttributes")
    List<Submodel> getDefaultSubjectAttributes();

    /**
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules. The submodel is of kind=Type.
     *
     * Reference to a submodel defining the default subjects attributes for the AAS that can be used to
     * describe access permission rules.
     *
     * The submodel is of kind=Type.
     *
     * More information under http://admin-shell.io/aas/2/0#defaultSubjectAttributes
     *
     * @param defaultSubjectAttributes desired value for the property defaultSubjectAttributes.
     */
    void setDefaultSubjectAttributes(List<Submodel> defaultSubjectAttributes);

    /**
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules defined for the AAS, i.e. attributes that are not describing the asset itself. Default:
     * reference to the submodel referenced via defaultEnvironmentAttributes
     *
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules.
     *
     * More information under http://admin-shell.io/aas/2/0#selectableEnvironmentAttributes
     *
     * @return Returns the List of Submodels for the property selectableEnvironmentAttributes.
     */
    @IRI("http://admin-shell.io/aas/2/0#selectableEnvironmentAttributes")
    List<Submodel> getSelectableEnvironmentAttributes();

    /**
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules defined for the AAS, i.e. attributes that are not describing the asset itself. Default:
     * reference to the submodel referenced via defaultEnvironmentAttributes
     *
     * Reference to a submodel defining which environment attributes can be accessed via the permission
     * rules.
     *
     * More information under http://admin-shell.io/aas/2/0#selectableEnvironmentAttributes
     *
     * @param selectableEnvironmentAttributes desired value for the property
     *        selectableEnvironmentAttributes.
     */
    void setSelectableEnvironmentAttributes(List<Submodel> selectableEnvironmentAttributes);

    /**
     * Access permission rules of the AAS describing the rights assigned to (already authenticated)
     * subjects to access elements of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#accessPermissionRule
     *
     * @return Returns the List of AccessPermissionRules for the property accessPermissionRules.
     */
    @IRI("http://admin-shell.io/aas/2/0#accessPermissionRule")
    List<AccessPermissionRule> getAccessPermissionRules();

    /**
     * Access permission rules of the AAS describing the rights assigned to (already authenticated)
     * subjects to access elements of the AAS.
     *
     * More information under http://admin-shell.io/aas/2/0#accessPermissionRule
     *
     * @param accessPermissionRules desired value for the property accessPermissionRules.
     */
    void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules);

    /**
     * Reference to a submodel defining the authenticated subjects that are configured for the AAS. They
     * are selectable by the access permission rules to assign permissions to the subjects.
     *
     * Default: reference to the submodel referenced via defaultSubjectAttributes.
     *
     * More information under http://admin-shell.io/aas/2/0#selectableSubjectAttributes
     *
     * @return Returns the List of Submodels for the property selectableSubjectAttributes.
     */
    @IRI("http://admin-shell.io/aas/2/0#selectableSubjectAttributes")
    List<Submodel> getSelectableSubjectAttributes();

    /**
     * Reference to a submodel defining the authenticated subjects that are configured for the AAS. They
     * are selectable by the access permission rules to assign permissions to the subjects.
     *
     * Default: reference to the submodel referenced via defaultSubjectAttributes.
     *
     * More information under http://admin-shell.io/aas/2/0#selectableSubjectAttributes
     *
     * @param selectableSubjectAttributes desired value for the property selectableSubjectAttributes.
     */
    void setSelectableSubjectAttributes(List<Submodel> selectableSubjectAttributes);

    /**
     * Reference to a submodel defining which permissions can be assigned to the subjects.
     *
     * Default: reference to the submodel referenced via defaultPermissions
     *
     * More information under http://admin-shell.io/aas/2/0#selectablePermissions
     *
     * @return Returns the List of Submodels for the property selectablePermissions.
     */
    @IRI("http://admin-shell.io/aas/2/0#selectablePermissions")
    List<Submodel> getSelectablePermissions();

    /**
     * Reference to a submodel defining which permissions can be assigned to the subjects.
     *
     * Default: reference to the submodel referenced via defaultPermissions
     *
     * More information under http://admin-shell.io/aas/2/0#selectablePermissions
     *
     * @param selectablePermissions desired value for the property selectablePermissions.
     */
    void setSelectablePermissions(List<Submodel> selectablePermissions);

}
