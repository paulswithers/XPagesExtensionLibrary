/*
 * � Copyright IBM Corp. 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package com.ibm.xsp.extlib.actions.client.dojo.fx;

import javax.faces.context.FacesContext;

import com.ibm.xsp.extlib.actions.client.dojo.AbstractFadeEffect;
import com.ibm.xsp.extlib.resources.ExtLibResources;
import com.ibm.xsp.resource.DojoModuleResource;


/**
 * Dojo fx wipe out action. 
 * 
 * @author Philippe Riand
 * @designer.public
 */
public class WipeOutAction extends AbstractFadeEffect {

    @Override
	protected DojoModuleResource getDojoModuleResource(FacesContext context) {
    	return ExtLibResources.dojoFx;
    }
	
	@Override
	protected String getDojoFunction() {
		return "fx.wipeOut"; //$NON-NLS-1$
	}
}
