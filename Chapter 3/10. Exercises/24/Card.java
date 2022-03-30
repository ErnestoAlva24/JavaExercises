public class Card {
    public static void main(String[] args) {
        int rank = (int) (Math.random() * (13 - 1) + 1);
        int suit = (int) (Math.random() * (4 - 1) + 1);

        System.out.print("The card you picked is ");

        switch (rank) {
            case 1:
                System.out.print("Ace");
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            default:
                System.out.print(rank);
        }

        System.out.print(" of ");

        switch (suit) {
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Hearts");
                break;
            case 4:
                System.out.println("Spades");
                break;
        }
    }
}
