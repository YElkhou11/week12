package com.promineotech;

import java.util.Random;
import java.util.function.IntPredicate;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return a + b;
		}
		else {
	throw new IllegalArgumentException("Both parameters must be positive!");
	}
	}

	public int subtractPositive(int a, int b) {
		
		if(a > 0 && b > 0) {
			return a - b;
		}
		else {
	throw new IllegalArgumentException("Both parameters must be positive!");
	}
	}

	int randomNumberSquared() {
		int sqNum = getRandomInt();
		return sqNum * sqNum;
	}
	
	int getRandomInt() {
	    Random random = new Random();
	    return random.nextInt(10) + 1;
	}
	
	
	
	
	
	
	
	


}

