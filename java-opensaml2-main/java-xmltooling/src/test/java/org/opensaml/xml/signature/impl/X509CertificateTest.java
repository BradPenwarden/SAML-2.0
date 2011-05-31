/*
 * Copyright [2006] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.xml.signature.impl;


import org.opensaml.xml.XMLObjectProviderBaseTestCase;
import org.opensaml.xml.signature.X509Certificate;

/**
 *
 */
public class X509CertificateTest extends XMLObjectProviderBaseTestCase {
    
    private String expectedStringContent;

    /**
     * Constructor
     *
     */
    public X509CertificateTest() {
        singleElementFile = "/data/org/opensaml/xml/signature/impl/X509Certificate.xml";
        
    }

    /** {@inheritDoc} */
    protected void setUp() throws Exception {
        super.setUp();
        
        expectedStringContent = "someX509Certificate";
    }

    /** {@inheritDoc} */
    public void testSingleElementUnmarshall() {
        X509Certificate x509Element = (X509Certificate) unmarshallElement(singleElementFile);
        
        assertNotNull("X509Certificate", x509Element);
        assertEquals("X509Certificate value", x509Element.getValue(), expectedStringContent);
    }

    /** {@inheritDoc} */
    public void testSingleElementMarshall() {
        X509Certificate x509Element = (X509Certificate) buildXMLObject(X509Certificate.DEFAULT_ELEMENT_NAME);
        x509Element.setValue(expectedStringContent);
        
        assertEquals(expectedDOM, x509Element);
    }

}
