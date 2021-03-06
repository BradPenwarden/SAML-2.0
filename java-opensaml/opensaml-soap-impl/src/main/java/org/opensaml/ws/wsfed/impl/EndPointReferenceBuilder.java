/*
 * Copyright 2008 University Corporation for Advanced Internet Development, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.ws.wsfed.impl;

import org.opensaml.ws.wsfed.EndPointReference;
import org.opensaml.ws.wsfed.WSFedConstants;
import org.opensaml.ws.wsfed.WSFedObjectBuilder;
import org.opensaml.xml.AbstractXMLObjectBuilder;

/** Builder of {@link EndPointReferenceImpl} objects. */
public class EndPointReferenceBuilder extends AbstractXMLObjectBuilder<EndPointReference> implements
        WSFedObjectBuilder<EndPointReference> {

    /** Constructor. */
    public EndPointReferenceBuilder() {

    }

    /** {@inheritDoc} */
    public EndPointReference buildObject() {
        return buildObject(WSFedConstants.WSADDRESS_NS, EndPointReference.DEFAULT_ELEMENT_LOCAL_NAME,
                WSFedConstants.WSADDRESS_PREFIX);
    }

    /** {@inheritDoc} */
    public EndPointReference buildObject(String namespaceURI, String localName, String namespacePrefix) {
        return new EndPointReferenceImpl(namespaceURI, localName, namespacePrefix);
    }
}