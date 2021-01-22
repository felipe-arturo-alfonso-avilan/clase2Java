package Ejercitacion;

public class Fraccion {
    private double valor;

    public Fraccion(){

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static double sumar(int a, int b){
        return a+b;
    }

    public static double sumar(double a, int b){
        return a+b;
    }

    public static double sumar(int a, double b){
        return a+b;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public double sumar(double a){
        return a + this.getValor();
    }

    public static double restar(int a, int b){
        return a-b;
    }

    public static double restar(double a, int b){
        return a-b;
    }

    public static double restar(int a, double b){
        return a-b;
    }

    public static double restar(double a, double b){
        return a-b;
    }

    public double restar(double a){
        return a - this.getValor();
    }

    public static double dividir(int a, int b){
        return a/(double)b;
    }

    public static double dividir(double a, int b){
        return a/b;
    }

    public static double dividir(int a, double b){
        return a/b;
    }

    public static double dividir(double a, double b){
        return a/b;
    }

    public double dividir(double a){
        return a / this.getValor();
    }

    public static double multiplicar(int a, int b){
        return a*b;
    }

    public static double multiplicar(double a, int b){
        return a*b;
    }

    public static double multiplicar(int a, double b){
        return a*b;
    }

    public static double multiplicar(double a, double b){
        return a*b;
    }

    public double multiplicar(double a){
        return a * this.getValor();
    }

    public static void main(String[] args) {
        Fraccion f = new Fraccion();
        f.setValor(3);
        System.out.println(Fraccion.sumar(1,2));
        System.out.println(Fraccion.sumar(1.5,2));
        System.out.println(Fraccion.sumar(1.5,2.6));
        System.out.println(Fraccion.sumar(1,2.7));

        System.out.println(Fraccion.restar(1,2));
        System.out.println(Fraccion.restar(1.5,2));
        System.out.println(Fraccion.restar(1.5,2.6));
        System.out.println(Fraccion.restar(1,2.7));

        System.out.println(Fraccion.multiplicar(1,2));
        System.out.println(Fraccion.multiplicar(1.5,2));
        System.out.println(Fraccion.multiplicar(1.5,2.6));
        System.out.println(Fraccion.multiplicar(1,2.7));

        System.out.println(Fraccion.dividir(1,2));
        System.out.println(Fraccion.dividir(1.5,2));
        System.out.println(Fraccion.dividir(1.5,2.6));
        System.out.println(Fraccion.dividir(1,2.7));

    }
}
