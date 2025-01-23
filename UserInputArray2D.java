import java.util.Scanner;
// THIS IS A 2 DIMENSION ARRAY
public class UserInputArray2D {
    public static void main(String[] args) {
        // Create a Scanner to collect input from the user
        Scanner input = new Scanner(System.in);

        // Declare a 2 dimension array
        int [][] array = new int[10][10];

        // Use a loop to accept user input for each element in the 2D array
        System.out.println("Enter the values of the 10x10 array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the values for index ["+ i +"]["+ j +"]");
                array[i][j] = input.nextInt();
            }
        }

        // Using a for each loop to print out the values entered by the user
        System.out.println("The values entered by user are: ");
        for (int [] row :array) { // Loop through each row
            for (int value: row) { // Loop through each element in a row
                System.out.print(value + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
