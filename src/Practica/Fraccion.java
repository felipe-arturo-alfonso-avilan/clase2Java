package Practica;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(){ }

    public double fraccionario(){ return this.getNumerador()/(double)this.getDenominador(); }

    // region geters & setters
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

    // endregion

    // region public functions
    // region suma
    public static double sumar(int a, int b){
        return a+b;
    }

    public static double sumar(Fraccion f, int b){
        return f.fraccionario()+b;
    }

    public static double sumar(int a, Fraccion f){
        return a+f.fraccionario();
    }

    public static double sumar(Fraccion f1, Fraccion f2){
        return f1.fraccionario()+ f2.fraccionario();
    }

    // endregion

    // region resta
    public static double restar(int a, int b){
        return a-b;
    }

    public static double restar(Fraccion f, int b){
        return f.fraccionario()-b;
    }

    public static double restar(int a, Fraccion f){
        return a-f.fraccionario();
    }

    public static double restar(Fraccion f1, Fraccion f2){
        return f1.fraccionario()- f2.fraccionario();
    }

    // endregion

    // region division
    public static double dividir(int a, int b){
        return a/(double)b;
    }

    public static double dividir(Fraccion f, int b){
        return f.fraccionario()/b;
    }

    public static double dividir(int a, Fraccion f){
        return a/f.fraccionario();
    }

    public static double dividir(Fraccion f1, Fraccion f2){
        return f1.fraccionario()/f2.fraccionario();
    }

    //endregion

    //region multiplicacion
    public static double multiplicar(int a, int b){
        return a*b;
    }

    public static double multiplicar(Fraccion f, int b){
        return f.fraccionario()*b;
    }

    public static double multiplicar(int a, Fraccion f){
        return a*f.fraccionario();
    }

    public static double multiplicar(Fraccion f1, Fraccion f2){
        return f1.fraccionario()*f2.fraccionario();
    }
    //endregion

    //endregion


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
