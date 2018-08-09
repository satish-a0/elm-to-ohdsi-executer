//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/model_elm">http://java.sun.com/xml/model_elm</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 03:15:28 PM CDT 
//


package edu.phema.elm_to_omop.model_elm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Median operator returns the median of the elements in source.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the source is null, the result is null.
 * 
 * <p>Java class for Median complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Median">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}AggregateExpression">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Median")
public class Median
    extends AggregateExpression
{


}