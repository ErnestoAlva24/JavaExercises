public class Pair<E> {
    private E first;
    private E second;

    public Pair(){}

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public static <E extends Comparable> E smallest(Pair<E> pair){
        if(pair.getFirst().compareTo(pair.getSecond()) <= 0)
            return pair.getFirst();
        else
            return pair.getSecond();
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }
}
