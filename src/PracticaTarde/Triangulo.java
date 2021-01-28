package PracticaTarde;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double height;

    public Triangulo() {}
    public Triangulo(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    public double getBase() {
        return this.base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (this.getBase()*this.getHeight())/2;
    }
}
