package com.demo.Student2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.demo.Student2.Service.PathService;

public class PathServiceTest {
	
	PathService cal=new PathService();
	
	@Test
	public void testadd() {
		assertEquals(30,cal.add(10,20));
	}
	@Test
	public void testisodd() {
		assertTrue(cal.isodd(3));
	}
	@Test
	public void testiseven() {
		assertTrue(cal.iseven(4));
	}
}
