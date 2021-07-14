package paquete04;


public class TransporteMaritimo extends Transporte {

    private String barco;

    public TransporteMaritimo(String barco) {
        this.barco = barco;
        establecerTarifa();
    }

    public void establecerTranvia(String n) {
        this.barco = n;
    }

    @Override
    public void establecerTarifa() {
        this.tarifa = 20;
    }

    public String obtenerTranvia() {
        return barco;
    }
}