package projectHome;

public class Project1 {
        public static void main(String[] args) {
            String[][] intArray = new String[20][20];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    intArray[i][j] = "  + ";
                    System.out.print(intArray[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 4; i < 10; i++) {
                for (int j = 4; j < 10; j++) {
                    intArray[i][j] = "  - ";
                    System.out.print(intArray[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(intArray[i][j]);
                }
                System.out.println();
            }
        }
}
