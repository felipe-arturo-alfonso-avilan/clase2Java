package Ejercitacion;

public class CuentaCorriente {
    private double ingreso;
    private double egreso;
    private double reintegro;
    private double transferencia;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double ingreso, double egreso, double reintegro, double transferencia) {
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.reintegro = reintegro;
        this.transferencia = transferencia;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.ingreso = cc.ingreso;
        this.egreso = cc.egreso;
        this.reintegro = cc.reintegro;
        this.transferencia = cc.transferencia;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getEgreso() {
        return egreso;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
    }

    public double getReintegro() {
        return reintegro;
    }

    public void setReintegro(double reintegro) {
        this.reintegro = reintegro;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }
}
