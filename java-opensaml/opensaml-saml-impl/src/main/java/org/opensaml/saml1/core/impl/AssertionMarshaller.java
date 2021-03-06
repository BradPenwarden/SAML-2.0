/*
 * Copyright [2005] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.saml1.core.impl;

import org.joda.time.format.ISODateTimeFormat;
import org.opensaml.common.impl.AbstractSAMLObjectMarshaller;
import org.opensaml.saml1.core.Assertion;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.MarshallingException;
import org.w3c.dom.Element;

/**
 * A thread safe Marshaller for {@link org.opensaml.saml1.core.Assertion} objects.
 */
public class AssertionMarshaller extends AbstractSAMLObjectMarshaller {

    /** {@inheritDoc} */
    protected void marshallAttributes(XMLObject samlElement, Element domElement) throws MarshallingException {

        Assertion assertion = (Assertion) samlElement;

        if (assertion.getID() != null) {
            domElement.setAttributeNS(null, Assertion.ID_ATTRIB_NAME, assertion.getID());
            if (assertion.getMinorVersion() != 0) {
                domElement.setIdAttributeNS(null, Assertion.ID_ATTRIB_NAME, true);
            }
        }

        if (assertion.getIssuer() != null) {
            domElement.setAttributeNS(null, Assertion.ISSUER_ATTRIB_NAME, assertion.getIssuer());
        }

        if (assertion.getIssueInstant() != null) {
            String date = ISODateTimeFormat.dateTime().print(assertion.getIssueInstant());
            domElement.setAttributeNS(null, Assertion.ISSUEINSTANT_ATTRIB_NAME, date);
        }

        domElement.setAttributeNS(null, Assertion.MAJORVERSION_ATTRIB_NAME, "1");
        if (assertion.getMinorVersion() == 0) {
            domElement.setAttributeNS(null, Assertion.MINORVERSION_ATTRIB_NAME, "0");
        } else {
            domElement.setAttributeNS(null, Assertion.MINORVERSION_ATTRIB_NAME, "1");
        }
    }
}