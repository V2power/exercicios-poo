package exercicio02;

public class Equacao {

    private double a;
    private double b;
    private double c;

    public double delta() {
        return Math.pow(b,2) + (-4 * (a * c));
    }

    public double R1() {
        return ((b * -1) + Math.sqrt(delta())) / (2*a);
    }

    public double R2() {
        return ((b * -1) - Math.sqrt(delta())) / (2*a);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
