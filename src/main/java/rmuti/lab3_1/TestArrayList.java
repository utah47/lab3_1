package rmuti.lab3_1;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		lst.add(0, "10");
		lst.add(1, "11");
		lst.add(2, "13");
		lst.add(3, "15");
		lst.add(4, "20");
		lst.addFirst("9");
		lst.add("100");
		System.out.println(lst);
		lst.remove(0);
		System.out.println(lst);
		System.out.println(lst.get(1));
		System.out.println(lst.indexOf("11"));
		System.out.println(lst.contains("11"));
		System.out.println(lst.size());
	}
}
