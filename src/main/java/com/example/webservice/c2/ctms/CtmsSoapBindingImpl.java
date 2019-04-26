/**
 * CtmsSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.webservice.c2.ctms;

import org.apache.logging.log4j.LogManager;

public class CtmsSoapBindingImpl implements CSPRequest {

	private org.apache.logging.log4j.Logger log = LogManager.getLogger(this.getClass());


	/** 工单入库并放入消息队列中 */
	public CSPResult execCmd(String CSPID, String LSPID, String correlateID,
			String cmdFileURL) throws java.rmi.RemoteException {
		CSPResult cspResult = new CSPResult();
		try {
			StringBuilder tmpsb = new StringBuilder();
			tmpsb.append("<------CtmsSoapBindingImpl.contentMngResult--->");
			tmpsb.append(" CSPID:").append(CSPID);
			tmpsb.append(" LSPID:").append(LSPID);
			tmpsb.append(" correlateID:").append(correlateID);
			tmpsb.append(" cmdFileURL:").append(cmdFileURL);

			log.info(tmpsb.toString());
		} catch (Exception e) {
			// 未知异常
			cspResult.setResult(-1);
			cspResult.setErrorDescription("Exception Fail");
			log.error(e.getMessage(), e);
		}
		return cspResult;
	}
}