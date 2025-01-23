// (A)SINGLE LOOP
public class EnglandFlag {
    public static void main(String[] args) {
//        String Ast = "****======";
//        String equal_to = "==========";
//
//        for (int i = 0; i < 6; i++) {
//            if (i < 3) {
//                System.out.println(Ast);
//            } else {
//                System.out.println(equal_to);
//            }
//        }

    // (B) USING A NESTED LOOP
        int row = 6, col = 11;
        for (int a = 0; a < row; a++){
            for (int b = 0; b < col; b++) {
                if (a < 3 && b < 4){
                    System.out.print("* ");
                }else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}
