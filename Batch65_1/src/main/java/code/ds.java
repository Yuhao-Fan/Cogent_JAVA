package code;

public class ds {

	public boolean bigger(int t1,int t2) {
		return t1>t2;
		
		
	}
	void swap(int a, int b)
    {
        System.out.println(a);
        System.out.println(b);
        int c = a;
        a = b;
        b = c;
		
        System.out.println(a);
        System.out.println(b);
    }
	void swap2(int a, int b)
    {
        System.out.println(a);
        System.out.println(b);
        // a^b^b = a
        a = a ^ b; // 
        b = a ^ b; // b = a^b^b=a
        a = a ^ b; // a = a^b^a^b^b=b
 
        System.out.println("After swap: a = "
                           + a + ", b = " + b);

    }
	boolean odd(int num)
    {
		return num%2==1?true:false;

    }
    public void largest(double n1,double n2,double n3) {


        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
    public void isvowel(char ch) {


        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
    void print2Smallest(int arr[])
    {
        int arr_size = arr.length;

        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
 
        int first=Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] < second)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                               "smallest element");
        else
            System.out.println("The smallest element is " +
                               first + " and second Smallest" +
                               " element is " + second);
    }
    boolean areAnagram(String string1,String string2)
	{
    	char[] str1 =  string1.toCharArray();
    	char[] str2 =  string2.toCharArray();
	    int NO_OF_CHARS = 128;
		int[] count = new int[NO_OF_CHARS];
	
		if (str1.length != str2.length)
			return false;
	
		for(int i = 0; i < str1.length; i++)
		{
			count[str1[i]]++;
			count[str2[i]]--;
		}
	
		for(int i = 0; i < NO_OF_CHARS; i++) {
			if (count[i] != 0)
			{
			return false;
			}
		}
			
		return true;
	}
	
	
}
