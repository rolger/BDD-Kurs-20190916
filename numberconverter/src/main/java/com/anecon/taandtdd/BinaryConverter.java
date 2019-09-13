package com.anecon.taandtdd;

public class BinaryConverter implements NumberConverter {

	@Override
	public String convert(Integer integer) {
		return Integer.toBinaryString(integer);
	}

}
