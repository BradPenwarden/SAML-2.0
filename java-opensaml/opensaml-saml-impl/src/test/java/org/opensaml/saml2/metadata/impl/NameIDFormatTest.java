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

/**
 * 
 */
package org.opensaml.saml2.metadata.impl;

import javax.xml.namespace.QName;

import org.opensaml.common.BaseSAMLObjectProviderTestCase;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.metadata.NameIDFormat;

/**
 * Test case for creating, marshalling, and unmarshalling
 * {@link org.opensaml.saml2.metadata.NameIDFormat}.
 */
public class NameIDFormatTest extends BaseSAMLObjectProviderTestCase {
    
    /** Expected format */
    protected String expectFormat;
    
    /**
     * Constructor
     */
    public NameIDFormatTest() {
        singleElementFile = "/data/org/opensaml/saml2/metadata/impl/NameIDFormat.xml";
    }
    
    /** {@inheritDoc} */
    protected void setUp() throws Exception {
        super.setUp();
        
        expectFormat = "urn:name:format";
    }

    /** {@inheritDoc} */
    public void testSingleElementUnmarshall() {
        NameIDFormat format = (NameIDFormat) unmarshallElement(singleElementFile);
        
        assertEquals("Format was not expected value", expectFormat, format.getFormat());
    }

    /** {@inheritDoc} */
    public void testSingleElementMarshall() {
        NameIDFormat format = (NameIDFormat) buildXMLObject(NameIDFormat.DEFAULT_ELEMENT_NAME);
        
        format.setFormat(expectFormat);

        assertEquals(expectedDOM, format);
    }

}