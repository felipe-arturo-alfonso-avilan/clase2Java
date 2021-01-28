package PracticaTarde;

public class Circulo extends FiguraGeometrica{
    private double radius;

    public Circulo() {}
    public Circulo(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*this.getRadius()*this.getRadius();
    }
}
