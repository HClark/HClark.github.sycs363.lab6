package howard.edu.sycs363.lab5;


/**
 * Integer Array List Class 
 * @author Hannah M. Clark 
 */
public class IntegerArrayList {
	
	int[] arrayList;
	int index;
	int removedNum;
	IntegerArrayList() {
		arrayList = new int[8];
		index = 0;
	}
	/**
	 *  Initialize IntegerArrayList to size user enters
	 * @param integer value that will determine array/list size 
	 */
	IntegerArrayList(int size) {
		arrayList = new int[size];
		index = 0;
	}
	void add(int value) {
		arrayList[index] = value;
		index++;
	}
	/**
	 * Insert an integer value at the specified index
	 * @param index desired array index of value
 	 * @param value value to be added to array
	 */
	void add(int index, int value) {
		arrayList[index] = value;
	}
	/**
	 * Retrieve the integer value at the specified index number
	 * @param index of value to return		
	 * @return value at chosen index
	 */
	int get(int index) {
		if(arrayList[index] != 0) {
			return arrayList[index];
		}
		else
			return -1;
	}
	/**
	 *Retrieve index of the specified value in the list/array. 
	 * @param value in list/array
	 * @return index of value in list/array
	 */
	int indexOf(int value) {
		for(int i = 0; i < arrayList.length; i++) {
			if(value == arrayList[i])
				return i;
		}
		return -1;
	}
	
	boolean isEmpty() {
		if(arrayList.length != 0)
			return false;
		else
			return true;
	}
	
	int remove(int index) {
		if(arrayList.length == 0)
			return 0;
		else
		{
		removedNum = arrayList[index];
		arrayList[index] = 0;
		return removedNum;
	}
	}
	public void testIsEmpty(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
