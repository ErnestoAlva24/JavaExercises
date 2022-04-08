public class MyString2 {
    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public MyString2 substring(int begin) {
        String sub = this.s.substring(begin);

        return new MyString2(sub);
    }

    public MyString2 toUpperCase() {
        String upper = "";

        for (int i = 0; i < this.s.length(); i++)
            upper += Character.toUpperCase(this.s.charAt(i));

        return new MyString2(upper);
    }

    public char[] toChars() {
        char[] chars = new char[s.length()];

        for (int i = 0; i < this.s.length(); i++)
            chars[i] = s.charAt(i);

        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        if (b)
            return new MyString2("true");

        return new MyString2("false");
    }
}
