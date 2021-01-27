package Practica;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;

    // region constructores
    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor, boolean prestado) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = prestado;
    }

    // endregion

    // region getters & setters
    public Boolean getPrestado(){ return prestado; }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // endregion


    public void prestamo(){
        if (prestado == false) {
            this.setPrestado(true);
        }else {
            System.out.println("El libro se encuentra prestado");
        }
    }

    public void devolucion(){
        this.setPrestado(false);
    }

    @Override
    public String toString() { // si se le cambia el nombre por "tostring()"
        return "Libro" +        //no puede sobreescribir el metodo porque no existe
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor;
    }

}
