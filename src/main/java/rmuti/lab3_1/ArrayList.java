package rmuti.lab3_1;

import java.util.Arrays;

public class ArrayList {
	private Object[] elementData = new Object[1];
	private int size = 0;

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		for (int j = size - 1; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}
	
	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = 2 * elementData.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}

	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
		size--;
	}
	public Object get(int index) {
		return elementData[index];
	}
	public boolean contains(Object o) {
		if(indexOf(o) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int indexOf(Object o) {
		for(int i = 0; i< size; i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void addFirst(Object e) {
		add(0, e);
	}

	
	public void add(Object e) {
		add(size, e);
	}
	
	public int size() {
		return size;
		
	}
}
