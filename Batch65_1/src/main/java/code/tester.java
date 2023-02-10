package code;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ds d = new ds();
		System.out.println(d.bigger(124, 123));
		d.swap(100, 0);
		d.swap2(100, 0);
		System.out.println(d.odd(79));
		d.largest(124.9, 23.5768, 5675.45);
		d.isvowel('o');
		d.isvowel('w');
		d.print2Smallest(new int[] {1234,124124,76,68,112,564,76,68});
		System.out.println(d.areAnagram("wadaf", "fadaw"));
	}

}
