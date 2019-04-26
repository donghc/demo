/**
 * CtmsSoapBindingImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctmsResp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CtmsSoapBindingImpl implements com.example.webservice.c2.ctmsResp.CSPResponse {

    private Logger log = LogManager.getLogger(this.getClass());

    public com.example.webservice.c2.ctmsResp.CSPResult resultNotify(String CSPID, String LSPID, String correlateID, int cmdResult, String resultFileURL) throws java.rmi.RemoteException {
        com.example.webservice.c2.ctmsResp.CSPResult tmpCSPResult = new CSPResult();
        try {
            StringBuilder tmpsb = new StringBuilder();
            tmpsb.append("<------CtmsSoapBindingImpl.contentMngResult--->");
            tmpsb.append(" CSPID:").append(CSPID);
            tmpsb.append(" LSPID:").append(LSPID);
            tmpsb.append(" correlateID:").append(correlateID);
            tmpsb.append(" cmdResult:").append(cmdResult);
            tmpsb.append(" resultFileURL:").append(resultFileURL);

            log.info(tmpsb.toString());

        } catch (Exception e) {
            log.error(e, e);
            tmpCSPResult.setResult(-1);
            tmpCSPResult.setErrorDescription(e.getMessage());
        }
        return tmpCSPResult;
    }

}
