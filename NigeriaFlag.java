// (A) USING A SINGLE LOOP
public class NigeriaFlag {
    public static void main(String[] args) {
        int row = 6, column = 15; // Adjusted as needed

        // Using a for loop
        for (int i = 0; i < row * column; i++) {
            if (i % column < column/3) {
                System.out.print("G ");
            } else if (i % column < 2 * (column/3)) {
                System.out.print("W ");
            } else {
                System.out.print("G ");
            }
            if ((i + 1) % column == 0) System.out.println(); //New row
        }

        // (B) USING A NESTED LOOP
       for (int a = 0; a < row; a++) {
           for (int b = 0; b < column; b++){
               if (b < column / 3) {
                   System.out.print("G");
               } else if (b <  2 * column / 3) {
                   System.out.print("W");
               } else {
                   System.out.print("G");
               }
           }
           System.out.println();
       }
    }
}
