package com.demo.tddcobertura.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomServiceImplTest {

	private CustomService customService = new CustomServiceImpl();

	@Test
	void testPositive() {
		assertEquals(1, customService.abs(1));
	}
}