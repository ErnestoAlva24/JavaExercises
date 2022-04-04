public class Craps {
    public static void main(String[] args) {
        boolean gameOver = false;
        int point = 0;
        int wins = 0;

        for (int i = 0; i < 15000; i++) {
            gameOver = false;

            while (!gameOver) {
                int result = roll();

                if (point == 0) {
                    if (result == 7 || result == 11) {
                        gameOver = true;
                        wins++;
                    } else
                        point = result;
                } else {
                    if (point == result) {
                        gameOver = true;
                        wins++;
                    } else if (result == 7)
                        gameOver = true;
                }
            }
        }

        System.out.println("Wins: " + wins);
    }

    public static int roll() {
        int dice1 = ((int) (Math.random() * (6 - 1))) + 1;
        int dice2 = ((int) (Math.random() * (6 - 1))) + 1;

        int sum = dice1 + dice2;

        return dice1 + dice2;
    }
}
