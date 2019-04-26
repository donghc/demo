/**
 * CSPRequestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctms;

public interface CSPRequestService extends javax.xml.rpc.Service {
    public String getctmsAddress();

    public CSPRequest getctms() throws javax.xml.rpc.ServiceException;

    public CSPRequest getctms(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
