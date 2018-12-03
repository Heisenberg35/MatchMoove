package com.societe.project;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("setupClass");
	}
	
	@AfterClass
	public static void deferalClass() {
		System.out.println("deferalClass");
	}
	
	@Before
	public void setup() {
		System.out.println("setup");
	}
	@After
	public void deferal() {
		System.out.println("deferal");
	}
	
	@Test
	public void test1() {
		assertTrue(true);
		//throw new Exception("erreur");
		System.out.println("test1");
	}
	@Test
	public void test2() {
		assertTrue(true);
		System.out.println("test2");
	}
	
}
