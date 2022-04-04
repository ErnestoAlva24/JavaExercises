public class Craps {
    public static void main(String[] args) {
        boolean gameOver = false;
        int point = 0;

        while (!gameOver) {
            int result = roll();

            if (point == 0) {
                if (result == 7 || result == 11) {
                    gameOver = true;
                    System.out.println("You win");
                } else {
                    point = result;
                    System.out.println("Point is " + point);
                }
            } else {
                if (point == result) {
                    System.out.println("You win");
                    gameOver = true;
                } else if (result == 7) {
                    System.out.println("You lose");
                    gameOver = true;
                }
            }
        }
    }

    public static int roll() {
        int dice1 = ((int) (Math.random() * (6 - 1))) + 1;
        int dice2 = ((int) (Math.random() * (6 - 1))) + 1;

        int sum = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return dice1 + dice2;
    }
}
