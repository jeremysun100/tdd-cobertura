package com.demo.tddcobertura.services;

public class CustomServiceImpl implements CustomService {
	@Override
	public int abs(int num) {
		if (num >= 0) {
			return num;
		} else {
			return -num;
		}
	}
}
