package PracticaTarde;

public class PasswordIntermedia extends Password{
    public PasswordIntermedia(String pass) {
        this.setValidation("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]");
        this.setMinLenght(8);
        this.setDescription("La contraseña debe tener letras y números y \n" +
                " un mínimo de 8 caracteres.");
        this.setValue(pass);
    }
}
