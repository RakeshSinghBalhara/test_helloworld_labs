//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.17 at 05:48:08 PM IST 
//


package com.manu.demo.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.manu.demo.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.manu.demo.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationServiceResponse }
     * 
     */
    public NotificationServiceResponse createNotificationServiceResponse() {
        return new NotificationServiceResponse();
    }

    /**
     * Create an instance of {@link NotificationServiceResponse.NotificationList }
     * 
     */
    public NotificationServiceResponse.NotificationList createNotificationServiceResponseNotificationList() {
        return new NotificationServiceResponse.NotificationList();
    }

    /**
     * Create an instance of {@link NotificationServiceResponse.NotificationList.Notification }
     * 
     */
    public NotificationServiceResponse.NotificationList.Notification createNotificationServiceResponseNotificationListNotification() {
        return new NotificationServiceResponse.NotificationList.Notification();
    }

}
