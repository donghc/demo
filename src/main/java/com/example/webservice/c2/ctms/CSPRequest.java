/**
 * CSPRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctms;

public interface CSPRequest extends java.rmi.Remote {
    public CSPResult execCmd(String CSPID, String LSPID, String correlateID, String cmdFileURL) throws java.rmi.RemoteException;
}
