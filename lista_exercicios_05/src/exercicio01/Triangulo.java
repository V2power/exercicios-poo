package exercicio01;
public class Triangulo {

    private double base;
    private double altura;

    public double areaTriangulo() {
        return (base * altura) / 2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
