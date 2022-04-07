public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven(){
        return value % 2 == 0;
    }

    public boolean isOdd(){
        return value % 2 == 1;
    }

    public boolean isPrime(){
        for(int i = 2; i< value / 2 + 1; i++)
            if(value % i == 0)
                return false;

        return  true;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 == 1;
    }

    public static boolean isPrime(int value){
        for(int i = 2; i< value / 2 + 1; i++)
            if(value % i == 0)
                return false;

        return  true;
    }

    public static boolean isEven(MyInteger value){
        return value.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger value){
        return value.value % 2 == 1;
    }

    public static boolean isPrime(MyInteger value){
        for(int i = 2; i< value.value / 2 + 1; i++)
            if(value.value % i == 0)
                return false;

        return  true;
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger value){
        return this.value == value.value;
    }

    public static int parseInt(char[] chars){
        int value = 0;

        for(int i = 0 ; i <chars.length; i++)
            value += (chars[i] - 48) * Math.pow(10, chars.length - i - 1);

        return value;
    }

    public int getValue() {
        return value;
    }
}
