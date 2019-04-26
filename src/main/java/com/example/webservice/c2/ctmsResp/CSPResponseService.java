/**
 * CSPResponseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctmsResp;

public interface CSPResponseService extends javax.xml.rpc.Service {
    public String getctmsAddress();

    public com.example.webservice.c2.ctmsResp.CSPResponse getctms() throws javax.xml.rpc.ServiceException;

    public com.example.webservice.c2.ctmsResp.CSPResponse getctms(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
