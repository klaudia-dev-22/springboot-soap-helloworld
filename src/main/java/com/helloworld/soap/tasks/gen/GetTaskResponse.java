//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.31 at 11:38:17 AM CEST 
//


package com.helloworld.soap.tasks.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taskDetails" type="{http://soap.helloworld.com/tasks/gen}TaskDetailsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taskDetails"
})
@XmlRootElement(name = "GetTaskResponse")
public class GetTaskResponse {

    @XmlElement(required = true)
    protected TaskDetailsList taskDetails;

    /**
     * Gets the value of the taskDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDetailsList }
     *     
     */
    public TaskDetailsList getTaskDetails() {
        return taskDetails;
    }

    /**
     * Sets the value of the taskDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDetailsList }
     *     
     */
    public void setTaskDetails(TaskDetailsList value) {
        this.taskDetails = value;
    }

}