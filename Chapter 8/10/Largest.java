import java.util.Random;

public class Largest {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        Random r = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matrix[i][j] = r.nextInt(2);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        int maxRow = 0, maxCol = 0;
        int countRow, countCol;
        int row = 0, col = 0;

        for (int i = 0; i < 5; i++) {
            countRow = 0;
            countCol = 0;

            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1)
                    countRow++;
                if (matrix[j][i] == 1)
                    countCol++;
            }

            if (countRow > maxRow) {
                maxRow = countRow;
                row = i;
            }

            if (countCol > maxCol) {
                maxCol = countCol;
                col = i;
            }
        }

        System.out.println("The largest row index: " + row);
        System.out.println("The largest column index: " + col);
    }
}
