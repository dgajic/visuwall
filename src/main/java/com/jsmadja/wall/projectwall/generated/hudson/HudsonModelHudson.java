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
// Generated on: 2011.02.16 at 05:07:50 PM CET 
//


package com.jsmadja.wall.projectwall.generated.hudson;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hudson.model.Hudson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hudson.model.Hudson">
 *   &lt;complexContent>
 *     &lt;extension base="{}hudson.model.Node">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overallLoad" type="{}hudson.model.OverallLoadStatistics" minOccurs="0"/>
 *         &lt;element name="primaryView" type="{}hudson.model.View" minOccurs="0"/>
 *         &lt;element name="slaveAgentPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="useCrumbs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="useSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="view" type="{}hudson.model.View" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hudson.model.Hudson", propOrder = {
    "description",
    "job",
    "overallLoad",
    "primaryView",
    "slaveAgentPort",
    "useCrumbs",
    "useSecurity",
    "view"
})
public class HudsonModelHudson
    extends HudsonModelNode
{

    protected String description;
    protected List<Object> job;
    protected HudsonModelOverallLoadStatistics overallLoad;
    protected HudsonModelView primaryView;
    protected int slaveAgentPort;
    protected boolean useCrumbs;
    protected boolean useSecurity;
    protected List<HudsonModelView> view;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getJob() {
        if (job == null) {
            job = new ArrayList<Object>();
        }
        return this.job;
    }

    /**
     * Gets the value of the overallLoad property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelOverallLoadStatistics }
     *     
     */
    public HudsonModelOverallLoadStatistics getOverallLoad() {
        return overallLoad;
    }

    /**
     * Sets the value of the overallLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelOverallLoadStatistics }
     *     
     */
    public void setOverallLoad(HudsonModelOverallLoadStatistics value) {
        this.overallLoad = value;
    }

    /**
     * Gets the value of the primaryView property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelView }
     *     
     */
    public HudsonModelView getPrimaryView() {
        return primaryView;
    }

    /**
     * Sets the value of the primaryView property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelView }
     *     
     */
    public void setPrimaryView(HudsonModelView value) {
        this.primaryView = value;
    }

    /**
     * Gets the value of the slaveAgentPort property.
     * 
     */
    public int getSlaveAgentPort() {
        return slaveAgentPort;
    }

    /**
     * Sets the value of the slaveAgentPort property.
     * 
     */
    public void setSlaveAgentPort(int value) {
        this.slaveAgentPort = value;
    }

    /**
     * Gets the value of the useCrumbs property.
     * 
     */
    public boolean isUseCrumbs() {
        return useCrumbs;
    }

    /**
     * Sets the value of the useCrumbs property.
     * 
     */
    public void setUseCrumbs(boolean value) {
        this.useCrumbs = value;
    }

    /**
     * Gets the value of the useSecurity property.
     * 
     */
    public boolean isUseSecurity() {
        return useSecurity;
    }

    /**
     * Sets the value of the useSecurity property.
     * 
     */
    public void setUseSecurity(boolean value) {
        this.useSecurity = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the view property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HudsonModelView }
     * 
     * 
     */
    public List<HudsonModelView> getView() {
        if (view == null) {
            view = new ArrayList<HudsonModelView>();
        }
        return this.view;
    }

}
