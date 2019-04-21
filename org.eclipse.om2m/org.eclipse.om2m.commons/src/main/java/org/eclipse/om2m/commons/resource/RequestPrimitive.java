/*******************************************************************************
 * Copyright (c) 2013-2016 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;

import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://www.onem2m.org/xml/protocols}operation"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="from" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="requestIdentifier" type="{http://www.onem2m.org/xml/protocols}requestID"/>
 *         &lt;element name="resourceType" type="{http://www.onem2m.org/xml/protocols}resourceType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.onem2m.org/xml/protocols}primitiveContent" minOccurs="0"/>
 *         &lt;element name="originatingTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="requestExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="resultExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="operationExecutionTime" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.onem2m.org/xml/protocols}resourceType" minOccurs="0"/>
 *         &lt;element name="resultPersistence" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="resultContent" type="{http://www.onem2m.org/xml/protocols}resultContent" minOccurs="0"/>
 *         &lt;element name="eventCategory" type="{http://www.onem2m.org/xml/protocols}eventCat" minOccurs="0"/>
 *         &lt;element name="deliveryAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterCriteria" type="{http://www.onem2m.org/xml/protocols}filterCriteria" minOccurs="0"/>
 *         &lt;element name="discoveryResultType" type="{http://www.onem2m.org/xml/protocols}discResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = ShortName.REQUEST_PRIMITIVE)
public class RequestPrimitive {

	@XmlElement(required = true, name = ShortName.OPERATION)
	protected BigInteger operation;
	@XmlElement(required = true, name = ShortName.TO)
	@XmlSchemaType(name = "anyURI")
	protected String to;
	@XmlElement(required = true, name = ShortName.FROM)
	protected String from;
	@XmlElement(required = true, name = ShortName.REQUEST_IDENTIFIER)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String requestIdentifier;
	@XmlElement(name = ShortName.RESOURCE_TYPE)
	protected BigInteger resourceType;
	@XmlElement(name = ShortName.NAME)
	protected String name;
	@XmlTransient
	protected Object content;
	@XmlElement(name = ShortName.PRIMITIVE_CONTENT)
	protected PrimitiveContent primitiveContent;
	@XmlElement(name = ShortName.ORIGINATING_TIMESTAMP)
	protected String originatingTimestamp;
	@XmlElement(name = ShortName.REQUEST_EXPIRATION_TIMESTAMP)
	protected String requestExpirationTimestamp;
	@XmlElement(name = ShortName.RESULT_EXPIRATION_TIMESTAMP)
	protected String resultExpirationTimestamp;
	@XmlElement(name = ShortName.OPERATION_EXECUTION_TIME)
	protected String operationExecutionTime;
	@XmlElement(name = ShortName.RESPONSE_TYPE)
	protected ResponseTypeInfo responseType;
	@XmlElement(name = ShortName.RESULT_PERSISTENCE)
	protected Duration resultPersistence;
	@XmlElement(name = ShortName.RESULT_CONTENT)
	protected BigInteger resultContent;
	@XmlElement(name = ShortName.EVENT_CATEGORY)
	protected String eventCategory;
	@XmlElement(name = ShortName.DELIVERY_AGGREGATION)
	protected Boolean deliveryAggregation;
	@XmlElement(name = ShortName.GROUP_REQUEST_IDENTIFIER)
	protected String groupRequestIdentifier;
	@XmlElement(name = ShortName.FILTER_CRITERIA)
	protected FilterCriteria filterCriteria;
	@XmlElement(name = ShortName.DISCOVERY_RESULT_TYPE)
	protected BigInteger discoveryResultType;
	@XmlTransient
	protected String returnContentType;
	@XmlTransient
	protected String requestContentType;
	@XmlTransient
	protected Map<String,List<String>> queryStrings;
	
	/**
	 * @return the queryStrings
	 */
	public Map<String, List<String>> getQueryStrings() {
		if(queryStrings == null){
			queryStrings = new HashMap<String, List<String>>();
		}
		return queryStrings;
	}

	/**
	 * Gets the value of the operation property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getOperation() {
		return operation;
	}

	/**
	 * Sets the value of the operation property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOperation(BigInteger value) {
		this.operation = value;
	}

	/**
	 * Gets the value of the to property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Sets the value of the to property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTo(String value) {
		this.to = value;
	}

	/**
	 * Gets the value of the from property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Sets the value of the from property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFrom(String value) {
		this.from = value;
	}

	/**
	 * Gets the value of the requestIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * Sets the value of the requestIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestIdentifier(String value) {
		this.requestIdentifier = value;
	}

	/**
	 * Gets the value of the resourceType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the value of the resourceType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResourceType(BigInteger value) {
		this.resourceType = value;
	}

	/**
	 * Sets the value of the resourceType property
	 * .
	 * @param value
	 */
	public void setResourceType(int value){
		this.resourceType = BigInteger.valueOf(value);
	}
	
	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the content property.
	 * 
	 * @return possible object is {@link PrimitiveContent }
	 * 
	 */
	public Object getContent() {
		return content;
	}

	/**
	 * Sets the value of the content property.
	 * 
	 * @param value
	 *            allowed object is {@link PrimitiveContent }
	 * 
	 */
	public void setContent(Object value) {
		this.content = value;
	}

	/**
	 * Gets the value of the originatingTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginatingTimestamp() {
		return originatingTimestamp;
	}

	/**
	 * Sets the value of the originatingTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginatingTimestamp(String value) {
		this.originatingTimestamp = value;
	}

	/**
	 * Gets the value of the requestExpirationTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestExpirationTimestamp() {
		return requestExpirationTimestamp;
	}

	/**
	 * Sets the value of the requestExpirationTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestExpirationTimestamp(String value) {
		this.requestExpirationTimestamp = value;
	}

	/**
	 * Gets the value of the resultExpirationTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResultExpirationTimestamp() {
		return resultExpirationTimestamp;
	}

	/**
	 * Sets the value of the resultExpirationTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResultExpirationTimestamp(String value) {
		this.resultExpirationTimestamp = value;
	}

	/**
	 * Gets the value of the operationExecutionTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperationExecutionTime() {
		return operationExecutionTime;
	}

	/**
	 * Sets the value of the operationExecutionTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperationExecutionTime(String value) {
		this.operationExecutionTime = value;
	}

	/**
	 * Gets the value of the responseType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public ResponseTypeInfo getResponseTypeInfo() {
		return responseType;
	}

	/**
	 * Sets the value of the responseType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResponseTypeInfo(ResponseTypeInfo value) {
		this.responseType = value;
	}

	/**
	 * Gets the value of the resultPersistence property.
	 * 
	 * @return possible object is {@link Duration }
	 * 
	 */
	public Duration getResultPersistence() {
		return resultPersistence;
	}

	/**
	 * Sets the value of the resultPersistence property.
	 * 
	 * @param value
	 *            allowed object is {@link Duration }
	 * 
	 */
	public void setResultPersistence(Duration value) {
		this.resultPersistence = value;
	}

	/**
	 * Gets the value of the resultContent property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getResultContent() {
		return resultContent;
	}

	/**
	 * Sets the value of the resultContent property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResultContent(BigInteger value) {
		this.resultContent = value;
	}

	/**
	 * Gets the value of the eventCategory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventCategory() {
		return eventCategory;
	}

	/**
	 * Sets the value of the eventCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventCategory(String value) {
		this.eventCategory = value;
	}

	/**
	 * Gets the value of the deliveryAggregation property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDeliveryAggregation() {
		return deliveryAggregation;
	}

	/**
	 * Sets the value of the deliveryAggregation property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDeliveryAggregation(Boolean value) {
		this.deliveryAggregation = value;
	}

	/**
	 * Gets the value of the groupRequestIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGroupRequestIdentifier() {
		return groupRequestIdentifier;
	}

	/**
	 * Sets the value of the groupRequestIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGroupRequestIdentifier(String value) {
		this.groupRequestIdentifier = value;
	}

	/**
	 * Gets the value of the filterCriteria property.
	 * 
	 * @return possible object is {@link FilterCriteria }
	 * 
	 */
	public FilterCriteria getFilterCriteria() {
		return filterCriteria;
	}

	/**
	 * Sets the value of the filterCriteria property.
	 * 
	 * @param value
	 *            allowed object is {@link FilterCriteria }
	 * 
	 */
	public void setFilterCriteria(FilterCriteria value) {
		this.filterCriteria = value;
	}

	/**
	 * Gets the value of the discoveryResultType property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDiscoveryResultType() {
		return discoveryResultType;
	}

	/**
	 * Sets the value of the discoveryResultType property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDiscoveryResultType(BigInteger value) {
		this.discoveryResultType = value;
	}

	/**
	 * @return the targetId
	 */
	public String getTargetId() {
		return this.getTo();
	}

	/**
	 * @param targetId
	 *            the targetId to set
	 */
	public void setTargetId(String targetId) {
		this.setTo(targetId);
	}

	/**
	 * @return the returnContentType
	 */
	public String getReturnContentType() {
		return returnContentType;
	}

	/**
	 * @param returnContentType the returnContentType to set
	 */
	public void setReturnContentType(String returnContentType) {
		this.returnContentType = returnContentType;
	}

	/**
	 * @return the requestContentType
	 */
	public String getRequestContentType() {
		return requestContentType;
	}

	/**
	 * @param requestContentType the requestContentType to set
	 */
	public void setRequestContentType(String requestContentType) {
		this.requestContentType = requestContentType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RequestPrimitive ["
				+ (operation != null ? "operation=" + operation + ",\n " : "")
				+ (to != null ? "to=" + to + ",\n " : "")
				+ (from != null ? "from=" + from + ",\n " : "")
				+ (requestIdentifier != null ? "requestIdentifier="
						+ requestIdentifier + ",\n " : "")
				+ (resourceType != null ? "resourceType=" + resourceType
						+ ",\n " : "")
				+ (name != null ? "name=" + name + ",\n " : "")
				+ (content != null ? "content=" + content + ",\n " : "")
				+ (originatingTimestamp != null ? "originatingTimestamp="
						+ originatingTimestamp + ",\n " : "")
				+ (requestExpirationTimestamp != null ? "requestExpirationTimestamp="
						+ requestExpirationTimestamp + ",\n "
						: "")
				+ (resultExpirationTimestamp != null ? "resultExpirationTimestamp="
						+ resultExpirationTimestamp + ",\n "
						: "")
				+ (operationExecutionTime != null ? "operationExecutionTime="
						+ operationExecutionTime + ",\n " : "")
				+ (responseType != null ? "responseType=" + responseType
						+ ",\n " : "")
				+ (resultPersistence != null ? "resultPersistence="
						+ resultPersistence + ",\n " : "")
				+ (resultContent != null ? "resultContent=" + resultContent
						+ ",\n " : "")
				+ (eventCategory != null ? "eventCategory=" + eventCategory
						+ ",\n " : "")
				+ (deliveryAggregation != null ? "deliveryAggregation="
						+ deliveryAggregation + ",\n " : "")
				+ (groupRequestIdentifier != null ? "groupRequestIdentifier="
						+ groupRequestIdentifier + ",\n " : "")
				+ (filterCriteria != null ? "filterCriteria=" + filterCriteria
						+ ",\n " : "")
				+ (discoveryResultType != null ? "discoveryResultType="
						+ discoveryResultType + ",\n " : "")
				+ (returnContentType != null ? "returnContentType="
						+ returnContentType + ",\n " : "")
				+ (requestContentType != null ? "requestContentType="
				+ requestContentType + ",\n ": "") 
				+ (queryStrings != null ? "queryStrings=" + queryStrings : "")
				+ "]";
	}
	
	/**
	 * Clone the current request primitive in a new object
	 * @return cloned request primitive
	 */
	public RequestPrimitive cloneParameters() {
		RequestPrimitive result = new RequestPrimitive();
		result.content = this.content;
		result.deliveryAggregation = this.deliveryAggregation;
		result.discoveryResultType = this.discoveryResultType;
		result.eventCategory = this.eventCategory;
		result.filterCriteria = this.filterCriteria;
		result.from = this.from;
		result.groupRequestIdentifier = this.groupRequestIdentifier;
		result.name = this.name;
		result.operation = this.operation;
		result.operationExecutionTime = this.operationExecutionTime;
		result.originatingTimestamp = this.originatingTimestamp;
		result.requestContentType = this.requestContentType;
		result.requestExpirationTimestamp = this.requestExpirationTimestamp;
		result.requestIdentifier = this.requestIdentifier;
		result.resourceType = this.resourceType;
		result.responseType = this.responseType;
		result.resultContent = this.resultContent;
		result.resultExpirationTimestamp = this.resultExpirationTimestamp;
		result.resultPersistence = this.resultPersistence;
		result.returnContentType = this.returnContentType;
		result.to = this.to;
		return result;
	}
	
}
