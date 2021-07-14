package paquete04;

public class TransporteAereo extends Transporte{
    private String aerolinea;

    public TransporteAereo(String aerolinea) {
        this.aerolinea = aerolinea;
        establecerTarifa();
    }

    public void establecerCooperativaBus(String n) {
        aerolinea = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return aerolinea;
    }
}
