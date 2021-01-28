package PracticaTarde;

public abstract class FiguraGeometrica {
    public abstract double area();
    public static double areaPromedio(FiguraGeometrica[] arr) {
        double acumulatedArea = 0;
        for(FiguraGeometrica f:arr) {
            acumulatedArea += f.area();
        }
        return (double) Math.round(acumulatedArea/arr.length * 100) / 100;
    }
}
