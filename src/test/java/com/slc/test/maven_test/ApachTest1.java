package com.slc.test.maven_test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math3.stat.descriptive.rank.Max;

public class ApachTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Apach test = new Apach();
		test.Random();
		test.Value();
		test.Sort();
	}
	
	@Test
	public void test1() {
		Apach test1 = new Apach();
		double [] a= {52.0,4.1,30.5,24.6,37.0};
		test1.Indata(a,5);
		test1.Value();
		test1.Sort();
		Max max = new Max();
		assertEquals(52.0,max.evaluate(a));
		}

	@Test
	public void test2() {
		Apach test2 = new Apach();
		double [] a= {52.0,4.1,30.5,24.6,37.0,61.5,15.9,69.9,11.4,27.6};
		test2.Indata(a,10);
		test2.Value();
		test2.Sort();
		Max max = new Max();
		assertEquals(69.9,max.evaluate(a));
		}
	@Test
	public void test3() {
		Apach test2 = new Apach();
		double [] a= {11.0,11.0,11.0,11.0,11.0,11.0,11.0,11.0};
		test2.Indata(a,8);
		test2.Value();
		test2.Sort();
		Max max = new Max();
		assertEquals(11.0,max.evaluate(a));
		}
}
