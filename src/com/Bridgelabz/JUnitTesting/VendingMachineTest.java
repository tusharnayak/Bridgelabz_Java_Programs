package com.Bridgelabz.JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VendingMachineTest {

	@Test
	void vendingtest() {
		VendingMachine vm = new VendingMachine();
		int result = vm.countNotes(4, 7000);
		assertEquals(4, result);
	}
}
//	@Test
//	void vendingTest2()
//	{
//		VendingMachine vm=new VendingMachine();
//		int res=vm.listRupeesNotes(,3500);
//		assertEquals(notes[i],res);
//	}
//
//}
