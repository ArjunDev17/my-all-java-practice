package customize.method.forcollection;

class OutOfRangeException extends RuntimeException {
	OutOfRangeException(String str){
		super(str);
	}
	private static final long serialVersionUID = 1L;
}

class MyArrayList {
	Object[] arr = new Object[5];
	int index = 0;
	
//1
	public void add(Object e) {
		if (index >= arr.length)
			increse();
		arr[index] = e;
		index++;
	}
	//2
	public void add(int index,Object e) {
		for(int i=size()-1;i>=index;i--) {
			arr[i+1]=arr[i];
		}
		if (index >= arr.length)
			increse();
		arr[index]=e;
		index++;
	}
	
	public void addAll(MyArrayList mo1) {
		for(int i=size()-1;i>=index;i--) {
			arr[i+1]=arr[i];
		}
		if (index >= arr.length)
			increse();
		arr[index]=mo1;
		index++;
	}
		
	private void increse() {
		int new_Length = (arr.length * 3) / 2 + 1;
		Object[] New_Array = new Object[new_Length];
		for (int i = 0; i < arr.length; i++) 
			New_Array[i] = arr[i];
		arr = New_Array;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new OutOfRangeException("ArrayIndexoutOfBoudSuggestedByBarbareek");
		return arr[index];
	}
	public int size() {
		return index;
	}
	public void set(int index,Object e) {
		arr[index]=e;
	}
	public void remove(int index) {
		for(int i=index;i<size()-1;i++) {
			arr[i]=arr[i+1];
		}
		index--;
	}
}

public class ArrayListOwnImplimentation {
	public static void main(String[] args) {
		MyArrayList mo = new MyArrayList();
		mo.add(12);
	
		for(int i=0;i<mo.size()-1;i++) {
			System.out.println(mo.arr[i]);
		}			
		MyArrayList mo1 = new MyArrayList();
		mo1.addAll(mo);
	}
}
/*
 * add(Object e)  add(int index,Object o) remove(int index)
 * 
 * get()---> done
 * removeall(
 */
