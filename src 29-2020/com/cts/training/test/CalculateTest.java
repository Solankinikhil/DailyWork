package com.cts.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.calculater.Calculater;

public class CalculateTest {

	private static Calculater calculater;

	@BeforeClass
	public static void init() {
		calculater = new Calculater();
		System.out.println("Object created!!");
	}

	@AfterClass
	public static  void destroy() {
		calculater = null;
		System.out.println("Object destroyed");
	}
    @Ignore
	@Test
	public void test_add_success() {
		assertEquals(17, calculater.add(12, 5));
		System.out.println("Inside add test");
	}
    @Ignore
	@Test
	public void test_sub_success() {
		assertEquals(7, calculater.sub(12, 5));
		System.out.println("Inside sub test");
	}
    @Ignore
	@Test
	public void test_mul_success() {
		assertEquals(180, calculater.mul(30, 6));
		System.out.println("Inside mul test");

	}
    @Ignore
	@Test
	public void test_div_success() {
		assertEquals(8, calculater.div(40, 5));
		System.out.println("Inside div test");
	}
	@Test
	public void test_tocheck_prime_number() {
		assertEquals(true, calculater.isPrime(5));
		
	}
	@Test
	public void test_tocheck_prime_false() {
		assertEquals(false, calculater.isPrime(4));
		
		
	}
	
	
	
	
}
