import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();

        int computer = ((int) ((Math.random() * (9 - 1)) + 1)) % 3;
        String resultComputer, resultGuess;

        if (computer == 0)
            resultComputer = "scissor";
        else if (computer == 1)
            resultComputer = "rock";
        else
            resultComputer = "paper";

        if (guess == 0)
            resultGuess = "scissor";
        else if (guess == 1)
            resultGuess = "rock";
        else
            resultGuess = "paper";

        System.out.print("The computer is " + resultComputer + ". You are " + resultGuess + ". ");

        if (computer == guess)
            System.out.println("It is a draw");
        else if ((computer == 0 && guess == 2) || (computer == 1 && guess == 0) || (computer == 2 && guess == 1))
            System.out.println("Computer won");
        else
            System.out.println("You won");
    }
}
