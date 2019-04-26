/**
 * CSPResponseServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctmsResp;

public class CSPResponseServiceLocator extends org.apache.axis.client.Service implements com.example.webservice.c2.ctmsResp.CSPResponseService {

    public CSPResponseServiceLocator() {
    }


    public CSPResponseServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CSPResponseServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ctms
    private String ctms_address = "http://180.169.102.148:8080/fujian_cms_inter/services/ctmsResp";

    public String getctmsAddress() {
        return ctms_address;
    }

    // The WSDD service name defaults to the port name.
    private String ctmsWSDDServiceName = "ctms";

    public String getctmsWSDDServiceName() {
        return ctmsWSDDServiceName;
    }

    public void setctmsWSDDServiceName(String name) {
        ctmsWSDDServiceName = name;
    }

    public com.example.webservice.c2.ctmsResp.CSPResponse getctms() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ctms_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getctms(endpoint);
    }

    public com.example.webservice.c2.ctmsResp.CSPResponse getctms(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.webservice.c2.ctmsResp.CtmsSoapBindingStub _stub = new com.example.webservice.c2.ctmsResp.CtmsSoapBindingStub(portAddress, this);
            _stub.setPortName(getctmsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setctmsEndpointAddress(String address) {
        ctms_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.webservice.c2.ctmsResp.CSPResponse.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.webservice.c2.ctmsResp.CtmsSoapBindingStub _stub = new com.example.webservice.c2.ctmsResp.CtmsSoapBindingStub(new java.net.URL(ctms_address), this);
                _stub.setPortName(getctmsWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ctms".equals(inputPortName)) {
            return getctms();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("iptv", "CSPResponseService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("iptv", "ctms"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ctms".equals(portName)) {
            setctmsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
