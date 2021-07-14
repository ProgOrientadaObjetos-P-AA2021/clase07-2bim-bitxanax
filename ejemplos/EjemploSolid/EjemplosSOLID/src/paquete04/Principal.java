/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author reroes
 */public class Principal {
    public static void main(String[] args) {

        TransporteBus bus = new TransporteBus("Isidro Ayora");
        TransporteTaxi taxi = new TransporteTaxi("Marquito");
        TransporteTransvia transvia = new TransporteTransvia("Dos");
        TransporteAereo aereo = new TransporteAereo("Tres");
        TransporteMaritimo maritimo = new TransporteMaritimo("Cuatro");

        TiposTransporte tipos = new TiposTransporte();
        tipos.addTransportes(new ArrayList<Transporte>(List.of(bus, taxi, transvia, aereo, maritimo)));
        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}