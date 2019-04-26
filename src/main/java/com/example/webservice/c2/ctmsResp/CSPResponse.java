/**
 * CSPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctmsResp;

public interface CSPResponse extends java.rmi.Remote {
    public com.example.webservice.c2.ctmsResp.CSPResult resultNotify(String CSPID, String LSPID, String correlateID, int cmdResult, String resultFileURL) throws java.rmi.RemoteException;
}
