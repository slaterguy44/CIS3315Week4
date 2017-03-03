package c13n17;

/**
 *
 * @author 55slaterbc30
 */
public class C13N17 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Complex c1 = new Complex(3.4, 5.5);
        Complex c2 = (Complex) c1.clone();
        System.out.println("c1= " + c1);
        System.out.println("c2= " + c2);
        c2.setA(8.4);
        c2.setB(2.4);
        System.out.println("c1= " + c1);
        System.out.println("c2= " + c2);
        System.out.println("c2-c1 = " + c2.substract(c1));

    }
}

class Complex implements Cloneable {
    ///a+ bi

    private double a; //real
    private double b; //imaginary

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Complex add(Complex c) {
        return new Complex((a + c.getA()), (b + c.getB()));

    }

    public Complex substract(Complex c) {
        return new Complex((a - c.getA()), (b - c.getB()));
    }

     public Complex multiply (Complex c){
         return new Complex ((a*c.getA() - b*c.getB()),(b*c.getA() + a*c.getB()));
     }
      public Complex division (Complex c){
           return new Complex (((a*c.getA() + b*c.getB())*(c.getA()*c.getA() + c.getB()*c.getB()) ), ((b*c.getA() - a*c.getB()) * (c.getA()*c.getA()+c.getB()*c.getB())));
      }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Complex{" + "a=" + a + ", b=" + b + '}';
    }

}
