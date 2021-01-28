package PracticaTarde;

public class PasswordFuerte extends Password{
    public PasswordFuerte(String pass) {
        this.setValidation("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]");
        this.setMinLenght(10);
        this.setDescription("La contraseña debe tener letras, números, símbolos y \n " +
                "un mínimo de 10 caracteres.");
        this.setValue(pass);
    }
}
