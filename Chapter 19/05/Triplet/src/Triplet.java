public class Triplet<E> extends Pair<E>{
    private E third;

    public Triplet(){};

    public Triplet(E first, E second, E third) {
        super(first, second);
        this.third = third;
    }

    public E getThird() {
        return third;
    }

    public void setThird(E third) {
        this.third = third;
    }
}
