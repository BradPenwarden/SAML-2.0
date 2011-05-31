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

import java.util.List;

import javax.xml.namespace.QName;

import org.opensaml.common.impl.AbstractSAMLObject;
import org.opensaml.saml1.core.AuthorityBinding;
import org.opensaml.xml.XMLObject;

/**
 * A concrete impementation of the {@link org.opensaml.saml1.core.SubjectLocality} interface
 */
public class AuthorityBindingImpl extends AbstractSAMLObject implements AuthorityBinding {

    /** The AuthorityKind */
    private QName authorityKind;

    /** The Location */
    private String location;

    /** The Binding */
    private String binding;

    /**
     * Constructor.
     * 
     * @param namespaceURI the namespace the element is in
     * @param elementLocalName the local name of the XML element this Object represents
     * @param namespacePrefix the prefix for the given namespace
     */
    protected AuthorityBindingImpl(String namespaceURI, String elementLocalName, String namespacePrefix) {
        super(namespaceURI, elementLocalName, namespacePrefix);
   }
    
    /** {@inheritDoc} */
    public QName getAuthorityKind() {
        return authorityKind;
    }

    /** {@inheritDoc} */
    public void setAuthorityKind(QName authorityKind) {
        this.authorityKind = prepareForAssignment(this.authorityKind, authorityKind);
    }

    /** {@inheritDoc} */
    public String getLocation() {
        return location;
    }

    /** {@inheritDoc} */
    public void setLocation(String location) {
        this.location = prepareForAssignment(this.location, location);
    }

    /** {@inheritDoc} */
    public String getBinding() {
        return binding;
    }

    /** {@inheritDoc} */
    public void setBinding(String binding) {
        this.binding = prepareForAssignment(this.binding, binding);
    }

    /** {@inheritDoc} */
    public List<XMLObject> getOrderedChildren() {
        // No children
        return null;
    }
}