public class MyStringBuilder1 {
    private String str;

    public MyStringBuilder1(String s) {
        str = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        return new MyStringBuilder1(this.str + s);
    }

    public MyStringBuilder1 append(int i) {
        return new MyStringBuilder1(this.str + i);
    }

    public int length() {
        return str.length();
    }

    public char charAt(int index) {
        return str.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String lower = "";

        for (char c : str.toCharArray())
            lower += Character.toLowerCase(c);

        return new MyStringBuilder1(lower);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String sub = "";

        for (int i = begin; i < end; i++)
            sub += str.charAt(i);

        return new MyStringBuilder1(sub);
    }

    public String toString() {
        return str;
    }
}
