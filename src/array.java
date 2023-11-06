
	import java.util.Scanner;

	public class array {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to input the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Create an array of the specified size
	        int[] userArray = new int[size];

	        // Prompt the user to enter values for the array
	        System.out.println("Enter " + size + " values for the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter value " + (i + 1) + ": ");
	            userArray[i] = scanner.nextInt();
	        }

	        // Display the values of the array
	        System.out.println("Values in the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.println("Value " + (i + 1) + ": " + userArray[i]);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


