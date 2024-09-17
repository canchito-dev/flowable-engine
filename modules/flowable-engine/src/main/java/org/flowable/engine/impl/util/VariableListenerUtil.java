/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.engine.impl.util;

import org.flowable.bpmn.model.BpmnModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariableListenerUtil {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(VariableListenerUtil.class);

    public static boolean hasVariableListenerEventDefinitions(String processDefinitionId) {
        BpmnModel bpmnModel = ProcessDefinitionUtil.getBpmnModel(processDefinitionId);
        return bpmnModel.hasVariableListeners();
    }

    public static boolean containsVariableListenerForVariableName(String processDefinitionId, String variableName) {
        BpmnModel bpmnModel = ProcessDefinitionUtil.getBpmnModel(processDefinitionId);
        return bpmnModel.containsVariableListenerForVariableName(variableName);
    }
}
