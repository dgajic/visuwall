/**
 * Copyright (C) 2010 Julien SMADJA <julien.smadja@gmail.com> - Arnaud LEMAIRE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.02.17 at 05:40:44 PM CET
//


package com.jsmadja.wall.projectwall.generated.hudson;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hudson.maven.MavenModule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hudson.maven.MavenModule">
 *   &lt;complexContent>
 *     &lt;extension base="{}hudson.maven.AbstractMavenProject">
 *       &lt;sequence>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hudson.maven.MavenModule", propOrder = {
        "rest"
})
public class HudsonMavenMavenModule
extends HudsonMavenAbstractMavenProject
{

    @XmlElementRef(name = "displayName", type = JAXBElement.class)
    protected List<JAXBElement<String>> rest;

    /**
     * Gets the rest of the content model.
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason:
     * The field name "DisplayName" is used by two different parts of a schema. See:
     * line 17 of http://integration.wormee.orange-vallee.net:8080/hudson/job/synthesis/api/schema
     * line 383 of http://integration.wormee.orange-vallee.net:8080/hudson/job/synthesis/api/schema
     * <p>
     * To get rid of this property, apply a property customization to one
     * of both of the following declarations to change their names:
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<String>>();
        }
        return this.rest;
    }

}
