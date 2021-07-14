package paquete04;

public class TransporteTransvia extends Transporte {

    private String tranvia;

    public TransporteTransvia(String tranvia) {
        this.tranvia = tranvia;
        establecerTarifa();
    }

    public void establecerTranvia(String n) {
        this.tranvia = n;
    }

    @Override
    public void establecerTarifa() {
        this.tarifa = 20;
    }

    public String obtenerTranvia() {
        return tranvia;
    }

}