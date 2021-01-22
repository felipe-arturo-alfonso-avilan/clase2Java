package Ejercitacion;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador() {
    }

    public Contador(Contador c) {
        this.valor = c.valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public static int incremento(int v) {
        return v++;
    }

    public static int decremento(int v) {
        return v--;
    }
}
