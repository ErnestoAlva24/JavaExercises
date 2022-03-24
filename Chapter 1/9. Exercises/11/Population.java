public class Population{
    public static void main(String[] args){
        float secondsByYear = 365 * 24 * 60 * 60;
        System.out.print("Year one: ");
        System.out.println(312032486 + secondsByYear / 7.0 - secondsByYear / 13.0 + secondsByYear / 45.0);
        System.out.print("Year two: ");
        System.out.println(312032486 + 2 * (secondsByYear / 7.0 - secondsByYear / 13.0 + secondsByYear / 45.0));
        System.out.print("Year three: ");
        System.out.println(312032486 + 3 * (secondsByYear / 7.0 - secondsByYear / 13.0 + secondsByYear / 45.0));
        System.out.print("Year four: ");
        System.out.println(312032486 + 4 * (secondsByYear / 7.0 - secondsByYear / 13.0 + secondsByYear / 45.0));
        System.out.print("Year five: ");
        System.out.println(312032486 + 5 * (secondsByYear / 7.0 - secondsByYear / 13.0 + secondsByYear / 45.0));
    }
}