import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0, computerwins = 0;

        while (Math.abs(userWins - computerwins) < 3) {
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = input.nextInt();

            int computer = ((int) ((Math.random() * (9 - 1)) + 1)) % 3;
            String resultComputer, resultUser;

            if (computer == 0)
                resultComputer = "scissor";
            else if (computer == 1)
                resultComputer = "rock";
            else
                resultComputer = "paper";

            if (user == 0)
                resultUser = "scissor";
            else if (user == 1)
                resultUser = "rock";
            else
                resultUser = "paper";

            System.out.print("The computer is " + resultComputer + ". You are " + resultUser + ". ");

            if (computer == user)
                System.out.println("It is a draw");
            else if ((computer == 0 && user == 2) || (computer == 1 && user == 0) || (computer == 2 && user == 1)) {
                System.out.println("Computer won");
                computerwins++;
            } else {
                System.out.println("You won");
                userWins++;
            }

            System.out.println("Computer " + computerwins + "-" + userWins + " You");
        }

    }
}
