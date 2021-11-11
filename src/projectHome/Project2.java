package projectHome;

public class Project2 {
    public static void main(String[] args) {
        String [][] board = new String[8][8]; //создаем двумерный массив строк
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((i + j) % 2 == 0) board[i][j] = "W," + boardCoord(j,i);
                else board[i][j] = "B,"+ boardCoord(j,i);
            }
        }

        for (String[] strings : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + strings[j] + " ");
            }
            System.out.println();
        }
    }
    public static String boardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null;
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
    }
}
