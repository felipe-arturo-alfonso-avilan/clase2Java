package Practica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TreeMap;

public class Fecha {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar gc = new GregorianCalendar();
    // region constructores
    public Fecha(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
        if(fechaCorrecta()){
            this.gc.set(getYear(), getMonth(), getDay());
        }else {
            System.out.println("fecha invalida");
        }
    }

   // endregion

    // region getters & setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public GregorianCalendar getGc() {
        return gc;
    }

    // endregion

    public boolean fechaCorrecta(){
        boolean esCorrecta = true;

        if (this.month<1 || this.month>12){
            esCorrecta = false;
        }
        if (this.day<1 || this.day>31){
            esCorrecta = false;
        }
        if (this.day>28 && this.month == 2){
            esCorrecta = false;
        }

        return esCorrecta;
    }
    public void plusOneDay() {
        if(fechaCorrecta()){
            gc.add(Calendar.DAY_OF_MONTH, 1);
            setDay(this.day +1);
        }
    }

    @Override
    public String toString() {
        return "Fecha: " + year +
                "/" + month +
                "/" + day;
    }

    public static void main(String[] args) {

        Fecha fecha = new Fecha(2021,13,34);
        fecha.getGc();
        fecha.plusOneDay();
        fecha.getDay();
    }
}
