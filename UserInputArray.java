import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Create a scanner to collect input from the user
        Scanner input = new Scanner(System.in);

        // Declare an array of 10 Length
        int [] array = new int[10];

        // Using a for loop Collect input from the user and assign element to the array
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the values of index " + i + " :");
            array[i] = input.nextInt();
        }

        // Using for each loop print the values assigned to the array
        System.out.println("\n The Values entered by the users are : ");
        for (int value : array) {
            System.out.println(value); // Print each value in the array
        }

    }
}
