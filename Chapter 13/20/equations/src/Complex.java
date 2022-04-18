public class Complex implements Cloneable, Comparable<Complex>{
    private double a;
    private double b;

    public Complex(){
        a = 0;
        b = 0;
    }

    public Complex(double a){
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double abs(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Complex add(Complex c){
        return new Complex(this.a + c.getRealPart(), this.b + c.getImaginaryPart());
    }

    public Complex substract(Complex c){
        return new Complex(this.a - c.getRealPart(), this.b - c.getImaginaryPart());
    }

    public Complex multiply(Complex c){
        return new Complex(this.a * c.getRealPart() - this.b * c.getImaginaryPart(),
                this.b * c.getRealPart() + this.a * c.getImaginaryPart());
    }

    public Complex divide(Complex c){
        return new Complex((this.a * c.getRealPart() + this.b * c.getImaginaryPart()) /
                (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2)),
                (this.b * c.getRealPart() - this.a * c.getImaginaryPart()) /
                        (Math.pow(c.getRealPart(),2) + Math.pow(c.getImaginaryPart(), 2)));
    }

    @Override
    public String toString() {
        return a + (b == 0?"":" + " + b + "i");
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(this.abs(), o.abs());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Complex(a, b);
    }

    public double getRealPart(){
        return a;
    }

    public double getImaginaryPart(){
        return b;
    }
}
