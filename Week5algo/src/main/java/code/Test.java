package code;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//		1WAP to Print a 2D Array
        // Loop through the rows
        for (int i = 0; i < arr.length; i++) {
            // Loop through the columns
            for (int j = 0; j < arr[i].length; j++) {
                // Print the current element with a space separator
                System.out.print(arr[i][j] + " ");
            }
            // Move to a new line after each row
            System.out.println();
        }
        // 2.WAP to Add Two Matrices
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] result = new int[3][3];

        // Loop through the rows
        for (int i = 0; i < matrix1.length; i++) {
            // Loop through the columns
            for (int j = 0; j < matrix1[i].length; j++) {
                // Add the corresponding elements and store in the result matrix
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
//        3.WAP to Sort the 2D Array Across Columns
        
        int[][] arr1 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        // Loop through the columns
        for (int i = 0; i < arr1[0].length; i++) {
            // Extract the current column into a 1D array
            int[] column = new int[arr1.length];
            for (int j = 0; j < arr1.length; j++) {
                column[j] = arr1[j][i];
            }

            // Sort the 1D array
            Arrays.sort(column);

            // Copy the sorted elements back into the 2D array
            for (int j = 0; j < arr1.length; j++) {
                arr1[j][i] = column[j];
            }
        }

        // Print the sorted 2D array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
//        4.WAP to Check Whether Two Matrices Are Equal or Not
        int[][] matrix11 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix21 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        boolean isEqual = true;

        // Loop through the rows
        for (int i = 0; i < matrix11.length; i++) {
            // Loop through the columns
            for (int j = 0; j < matrix11[i].length; j++) {
                // Check if the corresponding elements are equal
                if (matrix11[i][j] != matrix21[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("The two matrices are equal");
        } else {
            System.out.println("The two matrices are not equal");
        }
//        5.WAP to Find the Transpose
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        int[][] transpose = new int[matrix[0].length][matrix.length];

        // Loop through the rows
        for (int i = 0; i < matrix.length; i++) {
            // Loop through the columns
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
//        6.WAP to Find the Determinant
        int[][] matrix6 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int determinant = (matrix6[0][0] * ((matrix6[1][1] * matrix6[2][2]) - (matrix6[2][1] * matrix6[1][2])))
                - (matrix6[0][1] * ((matrix6[1][0] * matrix6[2][2]) - (matrix6[2][0] * matrix6[1][2])))
                + (matrix6[0][2] * ((matrix6[1][0] * matrix6[2][1]) - (matrix6[2][0] * matrix6[1][1])));

        System.out.println("The determinant of the matrix is: " + determinant);
//        7.WAP to Find the Normal and Trace
		int[][] matrix7 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        int normal = 0;
        int trace = 0;

        // Calculate the normal and trace
        for (int i = 0; i < matrix7.length; i++) {
            for (int j = 0; j < matrix7[i].length; j++) {
                normal += matrix7[i][j] * matrix7[i][j];
                if (i == j) {
                    trace += matrix7[i][j];
                }
            }
        }

        normal = (int) Math.sqrt(normal); // Take square root of normal

        System.out.println("The normal of the matrix is: " + normal);
        System.out.println("The trace of the matrix is: " + trace);
//        8.WAP to Print Boundary Elements of a Matrix
        
        int[][] matrix8 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Print top row
        for (int i = 0; i < matrix8[0].length; i++) {
            System.out.print(matrix8[0][i] + " ");
        }

        // Print right column (excluding top and bottom elements)
        for (int i = 1; i < matrix8.length - 1; i++) {
            System.out.print(matrix8[i][matrix8[i].length - 1] + " ");
        }

        // Print bottom row (in reverse order)
        for (int i = matrix8[matrix8.length - 1].length - 1; i >= 0; i--) {
            System.out.print(matrix8[matrix8.length - 1][i] + " ");
        }

        // Print left column (excluding top and bottom elements)
        for (int i = matrix8.length - 2; i > 0; i--) {
            System.out.print(matrix8[i][0] + " ");
        }
//        9.WAP to Rotate Matrix Elements
        int[][] matrix9 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Create a new matrix to store the rotated elements
        int[][] rotated = new int[matrix9.length][matrix9[0].length];

        // Rotate the elements
        for (int i = 0; i < matrix9.length; i++) {
            for (int j = 0; j < matrix9[i].length; j++) {
                rotated[j][matrix9.length - 1 - i] = matrix9[i][j];
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
//        10.WAP to Compute the Sum of Diagonals of a Matrix
        
        int[][] matrix10 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        int sum = 0;

        // Compute the sum of the main diagonal
        for (int i = 0; i < matrix10.length; i++) {
            sum += matrix10[i][i];
        }

        // Compute the sum of the secondary diagonal
        for (int i = 0; i < matrix10.length; i++) {
            sum += matrix10[i][matrix10.length - 1 - i];
        }

        // Subtract the common element to avoid double counting
        sum -= matrix10[matrix10.length/2][matrix10.length/2];

        System.out.println("Sum of diagonals: " + sum);
//        11.WAP to Interchange Elements of First and Last in a Matrix Across Rows
        int[][] matrix111 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Interchange the first and last elements of each row
        for (int i = 0; i < matrix111.length; i++) {
            int temp = matrix111[i][0];
            matrix111[i][0] = matrix111[i][matrix111.length - 1];
            matrix111[i][matrix111.length - 1] = temp;
        }

        // Print the modified matrix
        for (int i = 0; i < matrix111.length; i++) {
            for (int j = 0; j < matrix111[i].length; j++) {
                System.out.print(matrix111[i][j] + " ");
            }
            System.out.println();
        }
//        12.WAP to Interchange Elements of First and Last in a Matrix Across Columns
        int[][] matrix12 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Interchange the first and last elements of each column
        for (int i = 0; i < matrix12.length; i++) {
            int temp = matrix12[0][i];
            matrix12[0][i] = matrix12[matrix12.length - 1][i];
            matrix12[matrix12.length - 1][i] = temp;
        }

        // Print the modified matrix
        for (int i = 0; i < matrix12.length; i++) {
            for (int j = 0; j < matrix12[i].length; j++) {
                System.out.print(matrix12[i][j] + " ");
            }
            System.out.println();
        }
	}

}
