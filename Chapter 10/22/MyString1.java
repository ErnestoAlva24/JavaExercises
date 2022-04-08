public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];

        for (int i = 0; i < chars.length; i++)
            this.chars[i] = chars[i];
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] subString = new char[end - begin];

        for (int i = begin; i < end; i++)
            subString[begin - i] = chars[i];

        return new MyString1(subString);
    }

    public MyString1 toLowerCase() {
        char[] lowercase = new char[chars.length];

        for (int i = 0; i < chars.length; i++)
            lowercase[i] = Character.toLowerCase(chars[i]);

        return new MyString1(lowercase);
    }

    public boolean equals(MyString1 s) {
        if (s.length() != this.length())
            return false;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != this.charAt(i))
                return false;

        return true;
    }

    public static MyString1 valueOf(int i) {
        int length = 0;
        int n = i;

        while (n >= 1) {
            n /= 10;
            length++;
        }

        char[] chars = new char[length];

        for (int j = 0, k = (int) Math.pow(10, length - 1); j < length; j++, k /= 10) {
            chars[j] = Character.forDigit((i / k), 10);
            i %= k;
        }

        return new MyString1(chars);
    }
}
