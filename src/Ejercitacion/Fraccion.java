package Ejercitacion;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(){

    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double resultado(){
        return this.getNumerador()/(double)this.getDenominador();
    }

    public static double sumar(int a, int b){
        return a+b;
    }

    public static double sumar(Fraccion f, int b){
        return f.resultado()+b;
    }

    public static double sumar(int a, Fraccion f){
        return a+f.resultado();
    }

    public static double sumar(Fraccion f1, Fraccion f2){
        return f1.resultado()+ f2.resultado();
    }

/*    public double sumar(double a){ // creo que esto no va
        return a + this.getValor();
    }*/

    public static double restar(int a, int b){
        return a-b;
    }

    public static double restar(Fraccion f, int b){
        return f.resultado()-b;
    }

    public static double restar(int a, Fraccion f){
        return a-f.resultado();
    }

    public static double restar(Fraccion f1, Fraccion f2){
        return f1.resultado()- f2.resultado();
    }

/*    public double restar(double a){ // creo que esto no va
        return a - this.getValor();
    }*/

    public static double dividir(int a, int b){
        return a/(double)b;
    }

    public static double dividir(Fraccion f, int b){
        return f.resultado()/b;
    }

    public static double dividir(int a, Fraccion f){
        return a/f.resultado();
    }

    public static double dividir(Fraccion f1, Fraccion f2){
        return f1.resultado()/f2.resultado();
    }

/*
    public double dividir(double a){ // creo que esto no va
        return a / this.getValor();
    }
*/

    public static double multiplicar(int a, int b){
        return a*b;
    }

    public static double multiplicar(Fraccion f, int b){
        return f.resultado()*b;
    }

    public static double multiplicar(int a, Fraccion f){
        return a*f.resultado();
    }

    public static double multiplicar(Fraccion f1, Fraccion f2){
        return f1.resultado()*f2.resultado();
    }

/*    public double multiplicar(double a){ // creo que esto no va
        return a * this.getValor();
    }*/

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion();
        f1.setNumerador(5);
        f1.setDenominador(2);
        f2.setNumerador(7);
        f2.setDenominador(3);

        System.out.println(Fraccion.sumar(1,2));
        System.out.println(Fraccion.sumar(f1,2));
        System.out.println(Fraccion.sumar(f1,f2));
        System.out.println(Fraccion.sumar(1,f2));

        System.out.println(Fraccion.restar(1,2));
        System.out.println(Fraccion.restar(f1,2));
        System.out.println(Fraccion.restar(f1,f2));
        System.out.println(Fraccion.restar(1,f2));

        System.out.println(Fraccion.multiplicar(1,2));
        System.out.println(Fraccion.multiplicar(f1,2));
        System.out.println(Fraccion.multiplicar(f1,f2));
        System.out.println(Fraccion.multiplicar(1,f2));

        System.out.println(Fraccion.dividir(1,2));
        System.out.println(Fraccion.dividir(f1,2));
        System.out.println(Fraccion.dividir(f1,f2));
        System.out.println(Fraccion.dividir(1,f2));

    }
}
