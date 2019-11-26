package com.slc.test.maven_test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;
@RunWith(Suite.class)
@SuiteClasses({ ApachTest1.class , DowntoupTest.class , UptodownTest.class })
public class AllTests1 {
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(ApachTest1.class));
		suite.addTest(new JUnit4TestAdapter(DowntoupTest.class));
		suite.addTest(new JUnit4TestAdapter(UptodownTest.class));
		return suite;
	}
}
