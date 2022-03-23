public class CramersRule{
    public static void main(String[] args){
        /*
        3.4x + 50.2y = 44.5
        2.1x + .55y = 5.9

        ax + by = e
        cx + dy = f

        x = (ed - bf) / (ad - bc)
        y = (af - ec) / (ad - bc)
        */
        System.out.print("x = ");
        System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1));
        System.out.print("y = ");
        System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1));
    }
}