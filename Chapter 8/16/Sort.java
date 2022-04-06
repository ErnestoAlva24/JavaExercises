public class Sort {
    public static void main(String[] args) {
        int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

        sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public static void sort(int m[][]) {
        int[] temp;

        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {
                for (int k = 0; k < m[j].length; k++) {
                    if (m[j][k] <= m[j + 1][k]) {
                        temp = m[j];
                        m[j] = m[j + 1];
                        m[j + 1] = temp;
                        break;
                    }
                }
            }
        }
    }
}
