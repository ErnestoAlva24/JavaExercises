public class Test {
    public static void main(String[] args) {
        try {
            Loan loan = new Loan(0, 0, 0);
        }catch (IllegalArgumentException ex){
            System.out.println("Wrong arguments");
        }
    }
}
