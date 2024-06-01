
import java.util.ArrayList;

/**
 *
 * Nombre: Cesar Sanchez
 * Deber: Taller Ejercicio Parqueadero
 */

public class main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        
        // Ejemplo de uso de métodos
        System.out.println("Puestos Libres: " + parqueadero.calcularPuestosLibres());
        
        parqueadero.entrarCarro("PDO-001");
        parqueadero.entrarCarro("PDO-002");
        parqueadero.entrarCarro("PBX-003");
        parqueadero.entrarCarro("PDO-004");

        System.out.println("Puestos Libres: " + parqueadero.calcularPuestosLibres());
        System.out.println("Promedio Horas: " + parqueadero.darTiempoPromedio());
        System.out.println("Carro con más horas: " + parqueadero.devuelveCarroMayorTiempo().darPlaca());
        System.out.println("Existe carro con más de ocho horas: " + parqueadero.hayCarroMasDeOchoHoras());

        System.out.println(parqueadero.metodo1());

        System.out.println(parqueadero.metodo2());

        System.out.println("¿Hay carros con la misma placa? " + parqueadero.hayCarrosPlacaIgual());

        ArrayList<Carro> carrosMasDeTresHoras = parqueadero.carrosMasDeTresHoras();
        System.out.println("Carros con más de tres horas en el parqueadero:");
        for (Carro carro : carrosMasDeTresHoras) {
            System.out.println(carro.darPlaca() + " - " + carro.darTiempoEnParqueadero(20) + " horas");
        }
    }
}
