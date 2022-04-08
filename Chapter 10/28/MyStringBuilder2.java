public class MyStringBuilder2 {
    private String str;

    public MyStringBuilder2() {
        str = "";
    }

    public MyStringBuilder2(char[] chars) {
        str += chars;
    }

    public MyStringBuilder2(String s) {
        str += s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String str2 = "";

        for (int i = 0; i < offset; i++)
            str2 += this.str.charAt(i);

        str2 += s + str.substring(offset);

        return new MyStringBuilder2(str2);
    }

    public MyStringBuilder2 reverse() {
        String reverse = "";

        for (int i = this.str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);

        return new MyStringBuilder2(reverse);
    }

    public MyStringBuilder2 substring(int begin) {
        String substring = "";

        for (int i = begin; i < str.length(); i++)
            substring += str.charAt(i);

        return new MyStringBuilder2(substring);
    }

    public MyStringBuilder2 toUpperCase() {
        String upper = "";

        for (char c : str.toCharArray())
            upper += Character.toUpperCase(c);

        return new MyStringBuilder2(upper);
    }
}
