package howard.edu.sycs363.lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerArrayListTest extends IntegerArrayList {

	@Test
	public void testIntegerArrayList() {
		//fail("Not yet implemented");
	}

	@Test
	public void testIntegerArrayListInt() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAddInt() {
		   //instantiate 
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(5);

		   // Tests
		   assertEquals("Should return 5", 5, tester.get(0));		
	}

	@Test
	public void testAddIntInt() {	
		   //instantiate 
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(7,30);

		   // Test
		   assertEquals("Should return 30", 30, tester.get(7));		
	}

	@Test
	public void testGet() {		
		   //instantiate 
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.get(3);

		   // Test
		   assertEquals("Should return value in index 3", -1, tester.get(3));		   
	}

	@Test
	public void testIndexOf() {		
		   //instantiate 
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.indexOf(4);

		   // Test
		   assertEquals("Should return the index of specifide value", -1, tester.indexOf(4));	
	}

	@Test
	public void testIsEmpty() {
		   //instantiate 
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.testIsEmpty(4);

		   // Test
		   assertEquals("Should return value index is full, otherise return -1", -1, tester.indexOf(4));
		
	}

	@Test
	public void testRemove() {
		  // IntegerArrayList is tested
		   IntegerArrayList tester = new IntegerArrayList();
		   tester.add(4);

		   // Test
		   assertEquals("Should remove 4", 4, tester.remove(0));	

	}

}
