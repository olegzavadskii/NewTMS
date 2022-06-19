/*Шахматная доска*/

package homework5_Multidimensional_arrays.task1;

public class Chess {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        fillChess(chess);
        printChess(chess);
    }

    public static String[][] fillChess(String[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "W";
                } else {
                    chess[i][j] = "B";
                }
            }
        }
        return chess;
    }


    public static void printChess(String[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}