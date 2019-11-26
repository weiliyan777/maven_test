package com.slc.test.maven_test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UptodownTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void upsort() {
		Apachone test =new Apachone();
		test.Intdata();
		test.Sort();
	}
	
	@Test
	public void upvalue() {
		Apachone test =new Apachone();
		test.Intdata();
		assertEquals(test.Getmin(),test.Getmin_t());
		assertEquals(test.Getmax(),test.Getmax_t());
		assertEquals(test.Getmean(),test.Getmean_t());
		assertEquals(test.Getsum(),test.Getsum_t());
		test.Value();
	}
}
