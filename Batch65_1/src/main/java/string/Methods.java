package string;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Yuhao";
//		System.out.println(str);
//		System.out.println(str.charAt(3));
//		System.out.println(str.length());
//		System.out.println(str.substring(1, 3));
//		System.out.println(str.intern());
//		System.out.println(str.toUpperCase());
//		System.out.println(str);
//		String a =String.valueOf(2124);
//		System.out.println(a);
		
//		Constructs a string buffer that contains the same characters as the specified CharSequence. The initial capacity of the string buffer is 16 plus the length of the CharSequence argument.
//		If the length of the specified CharSequence is less than or equal to zero, then an empty buffer of capacity 16 is returned.
		StringBuffer sbf= new StringBuffer("Yuhao");
		
		System.out.println(sbf.capacity());
		System.out.println(sbf.charAt(3));
		sbf.setCharAt(0,'F');
		System.out.println(sbf);
		sbf.append(false);
		System.out.println(sbf);
		sbf.deleteCharAt(sbf.length()-1);
		System.out.println(sbf);
		sbf.delete(6,sbf.length()-1);
		System.out.println(sbf);
		
		StringBuilder sbd= new StringBuilder("Yuhao");
		sbd.insert(1, "w");
		System.out.println(sbd);
		System.out.println(sbd.indexOf("w"));
		String string = sbd.toString();
		System.out.println(string);
		sbd.reverse();
		System.out.println(sbd);
		sbd.replace(0,4, "123");
		System.out.println(sbd);
		System.out.println(sbd.indexOf("w"));
		System.out.println(sbd.codePointAt(3));
		
		
		
		
	}

}
