package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabFourTests {

	@Test
	void calculateTest1() {	
		assertEquals(7, LabFour.calculate("3+2*2"));
	}
	
	@Test
	void calculateTest2() {
		assertEquals(1, LabFour.calculate(" 3/2 "));
	}
	
	@Test
	void deckRevealedIncreasingTest1() {
		int[] input = { 17, 13, 11, 2, 3, 5, 7 };
		int[] result = {2, 13, 3, 11, 5, 17, 7 };
		
		assertArrayEquals(result, LabFour.deckRevealedIncreasing(input));
		
	}
	
	@Test
	void deckRevealedIncreasingTest2() {
		int[] input = { 1, 1000 };
		int[] result = {1, 1000 };
		
		assertArrayEquals(result, LabFour.deckRevealedIncreasing(input));		
	}
}
