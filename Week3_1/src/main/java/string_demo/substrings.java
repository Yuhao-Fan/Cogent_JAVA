package string_demo;

public class substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbc";
		  System.out.println("All substring of abbc are:");
		   for (int i = 0; i < str.length(); i++) {
		   for (int j = i+1; j <= str.length(); j++) {
		         System.out.println(str.substring(i,j));
		 
		   }
		   }
		   
		  String inputString = "Hello World!";
		  StringBuilder reversedString = new StringBuilder(inputString);
		  reversedString = reversedString.reverse();
		  System.out.println("Reversed string: " + reversedString);
		  
		  
		  int num = 12412512;
	      String originalString = Integer.toString(num); // Convert the number to a string
	      String reversedString2 = new StringBuilder(originalString).reverse().toString(); // Reverse the string
	      boolean is = originalString.equals(reversedString2); // Return true if the original and reversed strings are the same
	      System.out.println(is);
	      
	      
	      int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	      int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
	      int[][] sum = new int[3][3]; // Declare a new matrix to store the sum

	      // Add corresponding elements of matrix1 and matrix2 and store the result in sum
	      for (int i = 0; i < matrix1.length; i++) {
	         for (int j = 0; j < matrix1[0].length; j++) {
	            sum[i][j] = matrix1[i][j] + matrix2[i][j];
	         }
	      }

	      // Print the sum matrix
	      for (int i = 0; i < sum.length; i++) {
	         for (int j = 0; j < sum[0].length; j++) {
	            System.out.print(sum[i][j] + " ");
	         }
	         System.out.println();
	      }
	      multiply();
	      replace_string();
	      generate_random();
	      test_bisearch();
	
	
	
	}
	public static void multiply() {
		int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	      int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
	      int[][] product = new int[3][3]; // Declare a new matrix to store the product

	      // Multiply the two matrices and store the result in product
	      for (int i = 0; i < matrix1.length; i++) {
	         for (int j = 0; j < matrix2[0].length; j++) {
	            for (int k = 0; k < matrix1[0].length; k++) {
	               product[i][j] += matrix1[i][k] * matrix2[k][j];
	            }
	         }
	      }

	      // Print the product matrix
	      for (int i = 0; i < product.length; i++) {
	         for (int j = 0; j < product[0].length; j++) {
	            System.out.print(product[i][j] + " ");
	         }
	         System.out.println();
	      }
	}
	public static void replace_string() {
		String originalString = "Hello, World!";
		System.out.println(originalString);
		String newString = originalString.replace("World", "Java");
		System.out.println(newString);

	}
	public static void generate_random() {
		double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber);
	}
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void test_bisearch() {
        int[] arr = { 2, 4, 6, 8, 10 };
        int x = 6;
        int index = binarySearch(arr, x);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

}

