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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hudson.model.Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hudson.model.Job">
 *   &lt;complexContent>
 *     &lt;extension base="{}hudson.model.AbstractItem">
 *       &lt;sequence>
 *         &lt;element name="buildable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="build" type="{}hudson.model.Run" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="color" type="{}hudson.model.BallColor" minOccurs="0"/>
 *         &lt;element name="firstBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="healthReport" type="{}hudson.model.HealthReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inQueue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keepDependencies" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="lastCompletedBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="lastFailedBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="lastStableBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="lastSuccessfulBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="lastUnstableBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="lastUnsuccessfulBuild" type="{}hudson.model.Run" minOccurs="0"/>
 *         &lt;element name="nextBuildNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="property" type="{}hudson.model.JobProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="queueItem" type="{}hudson.model.Queue-Item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hudson.model.Job", propOrder = {
        "buildable",
        "build",
        "color",
        "firstBuild",
        "healthReport",
        "inQueue",
        "keepDependencies",
        "lastBuild",
        "lastCompletedBuild",
        "lastFailedBuild",
        "lastStableBuild",
        "lastSuccessfulBuild",
        "lastUnstableBuild",
        "lastUnsuccessfulBuild",
        "nextBuildNumber",
        "property",
        "queueItem"
})
@XmlSeeAlso({
    HudsonModelAbstractProject.class
})
public class HudsonModelJob
extends HudsonModelAbstractItem
{

    protected boolean buildable;
    protected List<HudsonModelRun> build;
    protected HudsonModelBallColor color;
    protected HudsonModelRun firstBuild;
    protected List<HudsonModelHealthReport> healthReport;
    protected boolean inQueue;
    protected boolean keepDependencies;
    protected HudsonModelRun lastBuild;
    protected HudsonModelRun lastCompletedBuild;
    protected HudsonModelRun lastFailedBuild;
    protected HudsonModelRun lastStableBuild;
    protected HudsonModelRun lastSuccessfulBuild;
    protected HudsonModelRun lastUnstableBuild;
    protected HudsonModelRun lastUnsuccessfulBuild;
    protected int nextBuildNumber;
    protected List<HudsonModelJobProperty> property;
    protected HudsonModelQueueItem queueItem;

    /**
     * Gets the value of the buildable property.
     * 
     */
    public boolean isBuildable() {
        return buildable;
    }

    /**
     * Sets the value of the buildable property.
     * 
     */
    public void setBuildable(boolean value) {
        this.buildable = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the build property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HudsonModelRun }
     * 
     * 
     */
    public List<HudsonModelRun> getBuild() {
        if (build == null) {
            build = new ArrayList<HudsonModelRun>();
        }
        return this.build;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelBallColor }
     * 
     */
    public HudsonModelBallColor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelBallColor }
     * 
     */
    public void setColor(HudsonModelBallColor value) {
        this.color = value;
    }

    /**
     * Gets the value of the firstBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getFirstBuild() {
        return firstBuild;
    }

    /**
     * Sets the value of the firstBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setFirstBuild(HudsonModelRun value) {
        this.firstBuild = value;
    }

    /**
     * Gets the value of the healthReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HudsonModelHealthReport }
     * 
     * 
     */
    public List<HudsonModelHealthReport> getHealthReport() {
        if (healthReport == null) {
            healthReport = new ArrayList<HudsonModelHealthReport>();
        }
        return this.healthReport;
    }

    /**
     * Gets the value of the inQueue property.
     * 
     */
    public boolean isInQueue() {
        return inQueue;
    }

    /**
     * Sets the value of the inQueue property.
     * 
     */
    public void setInQueue(boolean value) {
        this.inQueue = value;
    }

    /**
     * Gets the value of the keepDependencies property.
     * 
     */
    public boolean isKeepDependencies() {
        return keepDependencies;
    }

    /**
     * Sets the value of the keepDependencies property.
     * 
     */
    public void setKeepDependencies(boolean value) {
        this.keepDependencies = value;
    }

    /**
     * Gets the value of the lastBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastBuild() {
        return lastBuild;
    }

    /**
     * Sets the value of the lastBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastBuild(HudsonModelRun value) {
        this.lastBuild = value;
    }

    /**
     * Gets the value of the lastCompletedBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastCompletedBuild() {
        return lastCompletedBuild;
    }

    /**
     * Sets the value of the lastCompletedBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastCompletedBuild(HudsonModelRun value) {
        this.lastCompletedBuild = value;
    }

    /**
     * Gets the value of the lastFailedBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastFailedBuild() {
        return lastFailedBuild;
    }

    /**
     * Sets the value of the lastFailedBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastFailedBuild(HudsonModelRun value) {
        this.lastFailedBuild = value;
    }

    /**
     * Gets the value of the lastStableBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastStableBuild() {
        return lastStableBuild;
    }

    /**
     * Sets the value of the lastStableBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastStableBuild(HudsonModelRun value) {
        this.lastStableBuild = value;
    }

    /**
     * Gets the value of the lastSuccessfulBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastSuccessfulBuild() {
        return lastSuccessfulBuild;
    }

    /**
     * Sets the value of the lastSuccessfulBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastSuccessfulBuild(HudsonModelRun value) {
        this.lastSuccessfulBuild = value;
    }

    /**
     * Gets the value of the lastUnstableBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastUnstableBuild() {
        return lastUnstableBuild;
    }

    /**
     * Sets the value of the lastUnstableBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastUnstableBuild(HudsonModelRun value) {
        this.lastUnstableBuild = value;
    }

    /**
     * Gets the value of the lastUnsuccessfulBuild property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelRun }
     * 
     */
    public HudsonModelRun getLastUnsuccessfulBuild() {
        return lastUnsuccessfulBuild;
    }

    /**
     * Sets the value of the lastUnsuccessfulBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelRun }
     * 
     */
    public void setLastUnsuccessfulBuild(HudsonModelRun value) {
        this.lastUnsuccessfulBuild = value;
    }

    /**
     * Gets the value of the nextBuildNumber property.
     * 
     */
    public int getNextBuildNumber() {
        return nextBuildNumber;
    }

    /**
     * Sets the value of the nextBuildNumber property.
     * 
     */
    public void setNextBuildNumber(int value) {
        this.nextBuildNumber = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HudsonModelJobProperty }
     * 
     * 
     */
    public List<HudsonModelJobProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<HudsonModelJobProperty>();
        }
        return this.property;
    }

    /**
     * Gets the value of the queueItem property.
     * 
     * @return
     *     possible object is
     *     {@link HudsonModelQueueItem }
     * 
     */
    public HudsonModelQueueItem getQueueItem() {
        return queueItem;
    }

    /**
     * Sets the value of the queueItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link HudsonModelQueueItem }
     * 
     */
    public void setQueueItem(HudsonModelQueueItem value) {
        this.queueItem = value;
    }

}
