//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.13 at 11:27:13 AM IST 
//


package com.mkyong;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrikbordItemData" type="{}PrikbordItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prikbordItemData"
})
@XmlRootElement(name = "PrikbordGetTreeResponse")
public class PrikbordGetTreeResponse {

    @XmlElement(name = "PrikbordItemData", required = true)
    protected List<PrikbordItem> prikbordItemData;

    /**
	 * @param prikbordItemData
	 *            the prikbordItemData to set
	 */
	public void setPrikbordItemData(List<PrikbordItem> prikbordItemData) {
		this.prikbordItemData = prikbordItemData;
	}

	/**
	 * Gets the value of the prikbordItemData property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the prikbordItemData property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPrikbordItemData().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PrikbordItem }
	 */
    public List<PrikbordItem> getPrikbordItemData() {
        if (prikbordItemData == null) {
            prikbordItemData = new ArrayList<PrikbordItem>();
        }
        return prikbordItemData;
    }

}
