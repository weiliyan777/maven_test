package com.slc.test.maven_test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DowntoupTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void drivesort() {
		Apach test = new Apach();
		double [] a= {51.8,42.1,3.5,27.9,17.6};
		test.Indata(a, 5);
		test.Sort();
	}
	
	@Test
	public void drivevalue() {
		Apach test = new Apach();
		double [] a= {44.4,19.1,38.7,74.6,35.2};
		test.Indata(a, 5);
		assertEquals(19.1,test.Getmin());
		assertEquals(74.6,test.Getmax());
		assertEquals(42.4,test.Getmean());
		assertEquals(212.0,test.Getsum());
		test.Value();
	}
}
