package rmuti.lab3_1;

public class ArrayListUtil {

	public int sumFive(ArrayList lst) {
		int sum = 0;
		for (int i = 0; i < lst.size(); i++) {
			int data = (Integer) lst.get(i);
			if (data == 5) {
				sum += (Integer) lst.get(i);
			}
		}
		return sum;
	}

	public int countFive(ArrayList lst) {
		int count = 0;
		for (int i = 0; i < lst.size(); i++) {
			int data = (Integer) lst.get(i);
			if (data == 5) {
				count++;
			}
		}
		return count;
	}
}
