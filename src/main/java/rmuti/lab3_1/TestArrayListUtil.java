package rmuti.lab3_1;

public class TestArrayListUtil {

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		lst.add(1);
		lst.add(5);
		lst.add(5);
		lst.add(2);
		lst.add(65);
		System.out.println(lst);

		ArrayListUtil obj = new ArrayListUtil();
		int five = obj.sumFive(lst);
		System.out.println(five);

		int count = obj.countFive(lst);
		System.out.println(count);

	}

}
