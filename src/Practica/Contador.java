package Practica;

public class Contador {
    private int valor;

    // region constructores
    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador c) {
        this.valor = c.valor;
    }

    // endregion

    // region getters & setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // endregion

    // region public functions
    public static int incremento(int v) {
        return v++;
    }

    public static int decremento(int v) {
        return v--;
    }
    // endregion
}
