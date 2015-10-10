package com.wanyun.SampleSpiders;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

public class RetrivePage {

	private static HttpClient httpClient = new HttpClient();
	
	// Setting proxy
	public void setProxy(String ip, int port){
		
		httpClient.getHostConfiguration().setProxy(ip, port);
	}
	
	public String getPorxyHost(){
		return httpClient.getHostConfiguration().getProxyHost();
	}
	
	public int getPorxyPosrt(){
		return httpClient.getHostConfiguration().getProxyPort();
	}
	
	// Download Page
	public URL downloadPage(String path) throws HttpException, IOException	{
		
		URL retUrl = new URL();
				
		GetMethod getMethod = new GetMethod(path);
		
		// Connect and get response status
		int statusCode = httpClient.executeMethod(getMethod);
		
		// Get response body
		String respBody = getMethod.getResponseBodyAsString();
		
		// Save result
		retUrl.setStatusCode(statusCode);
		retUrl.setResponseBody(respBody);
		
		// Release connection
		getMethod.releaseConnection();
		
		return retUrl;
	}
}
