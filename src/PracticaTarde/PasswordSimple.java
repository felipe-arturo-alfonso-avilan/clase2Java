package PracticaTarde;

public class PasswordSimple extends Password {

    public PasswordSimple(String pass) {
        this.setValidation("^(?!\\s*$).+");
        this.setMinLenght(6);
        this.setDescription("La contraseña debe tener un mínimo de 6 caracteres.");
        this.setValue(pass);
    }
}
