import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] game = new int[3][3];
        String win = "";

        print(game);

        while (win.equals("")) {
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int x = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            int y = input.nextInt();

            game[x][y] = 1;
            print(game);

            if (check(game)) {
                win = "X";
                continue;
            }

            System.out.print("Enter a row (0, 1, or 2) for player O: ");
            x = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player O: ");
            y = input.nextInt();

            game[x][y] = 2;
            print(game);

            if (check(game))
                win = "O";
        }

        System.out.println(win + " player won");
    }

    public static boolean check(int[][] game) {
        for (int i = 0; i < game.length; i++) {
            if ((game[i][0] != 0 && game[i][0] == game[i][1] && game[i][1] == game[i][2]) ||
                    (game[0][i] != 0 && game[0][i] == game[1][i] && game[1][i] == game[2][i]))
                return true;
        }

        if ((game[0][0] != 0 && game[0][0] == game[1][1] && game[1][1] == game[2][2]) ||
                (game[0][2] != 0 && game[0][2] == game[1][1] && game[1][1] == game[2][0]))
            return true;

        return false;
    }

    public static void print(int[][] game) {
        for (int i = 0; i < game.length; i++) {
            System.out.println("-------------");
            for (int j = 0; j < game[i].length; j++) {
                System.out.print("|");
                if (game[i][j] == 0)
                    System.out.print("   ");
                else if (game[i][j] == 1)
                    System.out.print(" X ");
                else
                    System.out.print(" O ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}
