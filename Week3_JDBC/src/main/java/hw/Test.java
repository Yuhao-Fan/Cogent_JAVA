package hw;


import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Remove All occurrences of given character from String?(Assume Accordingly)
		String originalString = "Hello World!";
		char charToRemove = 'l';

		String newString = originalString.replaceAll(Character.toString(charToRemove), "");

		System.out.println(newString);
		
		//How to swap 2 numbers without using 3rd variable?
		int a = 10;
		int b = 20;

		a = a + b; // a =a+b
		b = a - b; // b = a+b-b
		a = a - b; //a = a+b-(a+b-b)

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//How to remove whitespaces from a string?
		String str = "  Hello,   World!  ";
		str = str.replace(" ", "");
//		str = str.trim();
		System.out.println(str); // Output: "Hello,World!" 

//		4. Check if two arrays contains same elements?
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean arraysEqual = Arrays.equals(array1, array2);

        if (arraysEqual) {
            System.out.println("The arrays contain the same elements.");
        } else {
            System.out.println("The arrays do not contain the same elements.");
        }
//        5. Find 3rd largest element in an integer array?
        int[] arr = { 1, 2, 3, 4, 5 };
        int thirdLargest = findThirdLargest(arr);
        System.out.println(thirdLargest);
        
//        6. How to sort HashMap by using values?
        
     // Creating a HashMap with random order
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 5);
        unsortedMap.put("banana", 2);
        unsortedMap.put("cherry", 8);
        unsortedMap.put("date", 4);
        unsortedMap.put("elderberry", 1);
        System.out.println("Unsorted HashMap: " + unsortedMap);

        // Creating a list of entries from the HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

        // Sorting the list using a Comparator that compares the values of the entries
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Creating a LinkedHashMap to store the sorted entries in order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        // Iterating over the sorted list and putting each entry in the LinkedHashMap
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Printing the sorted HashMap
        System.out.println("Sorted HashMap by values: " + sortedMap);
        
        // 7.Write a java code to check balanced parentheses in an expression using stack.
        String input1 = "{[]})";
        String input2 = "{()}[]";
        System.out.println(input1 + " is " + (checkBalancedParentheses(input1) ? "valid" : "invalid") + " parentheses");
        System.out.println(input2 + " is " + (checkBalancedParentheses(input2) ? "valid" : "invalid") + " parentheses");
	}
	public static int findThirdLargest(int[] arr) {
	    int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;
	    int third = Integer.MIN_VALUE;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > first) {
	            third = second;
	            second = first;
	            first = arr[i];
	        } else if (arr[i] > second && arr[i] <= first) {
	            third = second;
	            second = arr[i];
	        } else if (arr[i] > third && arr[i] <= second) {
	            third = arr[i];
	        }
	    }

	    return third;
	}
	public static boolean checkBalancedParentheses(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
