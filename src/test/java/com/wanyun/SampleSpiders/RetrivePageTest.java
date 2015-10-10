package com.wanyun.SampleSpiders;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import junit.framework.TestCase;

public class RetrivePageTest extends TestCase {

	public void testDownloadPage(){
		String proxyhost = "150.236.32.9";
		int porxyport = 8080;
		String path = "http://www.baidu.com";
		
		// try to download page
		try {
			
			RetrivePage page = new RetrivePage();
//			page.setProxy(proxyhost, porxyport);
			URL retUrl =  page.downloadPage(path);
			assertEquals(200,retUrl.getStatusCode(),0);
			System.out.print(retUrl.getResponseBody());
			
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
