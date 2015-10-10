package com.wanyun.SampleSpiders;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class SampleTestSuite extends TestSuite {

	public static Test suite(){
		TestSuite suite = new TestSuite("RetrivePageTestSuite");
		suite.addTestSuite(RetrivePageTest.class);
		return suite;		
	}
	
	public static void main(String args[]){
		TestRunner.run(suite());
	}
}
