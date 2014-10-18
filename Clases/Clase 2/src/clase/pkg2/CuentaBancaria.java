package clase.pkg2;

public class CuentaBancaria {

    private double saldoInicial;
    private boolean hayError;

    public CuentaBancaria() {
        saldoInicial = 0;
        hayError = false;

    }

    public double getSaldoInicial() {
        return saldoInicial;
    }
    

    public void Deposito(double monto) {
        setSaldoInicial(getSaldoInicial()+ monto);
    }
    
    public void Retiro (double monto)
    {
        if (getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else 
            setHayError(true);
    }
    public CuentaBancaria(double saldoInicial, boolean hayError) {
        this.saldoInicial = saldoInicial;
        this.hayError = hayError;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
}
