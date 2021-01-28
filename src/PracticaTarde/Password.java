package PracticaTarde;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String value;
    private String validation;
    private int minLenght;
    private String description;

    public Password() {}

    public String getValidation() {
        return this.validation;
    }
    public void setValidation(String regex) {
        this.validation = regex;
    }
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }
    public int getMinLenght() { return this.minLenght; }
    public void setMinLenght(int lenght) { this.minLenght = lenght; }
    public String getValue() {
        return this.value;
    }
    public void setValue(String pass) {
        Pattern pattern = Pattern.compile(this.getValidation());
        Matcher matcher = pattern.matcher(pass);
        if(matcher.find() && pass.length()>=this.getMinLenght()) {
            this.value = pass;
            System.out.println("Se modificó la contraseña correctamente.");
            System.out.println("Su nueva contraseña es: " + this.getValue());
        } else {
            System.out.println("La contraseña no cumple con las condiciones de seguridad .\n" +
                    this.getDescription());
        }
    }
}
