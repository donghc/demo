/**
 * CtmsSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctms;
@SuppressWarnings("all")
public class CtmsSoapBindingSkeleton implements CSPRequest, org.apache.axis.wsdl.Skeleton {
    private CSPRequest impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CSPID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LSPID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CorrelateID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CmdFileURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("execCmd", _params, new javax.xml.namespace.QName("", "ExecCmdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("iptv", "CSPResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("iptv", "ExecCmd"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("execCmd") == null) {
            _myOperations.put("execCmd", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("execCmd")).add(_oper);
    }

    public CtmsSoapBindingSkeleton() {
        this.impl = new CtmsSoapBindingImpl();
    }

    public CtmsSoapBindingSkeleton(CSPRequest impl) {
        this.impl = impl;
    }
    public CSPResult execCmd(String CSPID, String LSPID, String correlateID, String cmdFileURL) throws java.rmi.RemoteException
    {
        CSPResult ret = impl.execCmd(CSPID, LSPID, correlateID, cmdFileURL);
        return ret;
    }

}
