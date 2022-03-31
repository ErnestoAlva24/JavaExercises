import java.util.Scanner;

public class Plate {
    public static void main(String[] args) {
        String plate = "";

        plate += ((char) ((Math.random() * (90 - 65)) + 65));
        plate += ((char) ((Math.random() * (90 - 65)) + 65));
        plate += ((char) ((Math.random() * (90 - 65)) + 65));

        plate += ((char) ((Math.random() * (57 - 48)) + 48));
        plate += ((char) ((Math.random() * (57 - 48)) + 48));
        plate += ((char) ((Math.random() * (57 - 48)) + 48));
        plate += ((char) ((Math.random() * (57 - 48)) + 48));

        System.out.println(plate);
    }
}
