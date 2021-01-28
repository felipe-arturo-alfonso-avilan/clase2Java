package PracticaTarde;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double height;

    public Rectangulo() {}
    public Rectangulo(double base, double height) {
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
        return this.getBase()*this.getHeight();
    }
}
