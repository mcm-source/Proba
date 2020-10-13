/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2.pkg2;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String nombrePropietario;
       String matriculaVehiculo;
       float kmrecorridos;
       float totalKm;
       float litrosCombustible;
       float porcentajeConsumo;
       
       System.out.println("Introduce nombre del propietario ");
       nombrePropietario=sc.nextLine();
       System.out.println("Introduce  matrícula del vehículo ");
       matriculaVehiculo= sc.nextLine();
       System.out.println("Introduce los KM recorridos ");
       kmrecorridos= Float.parseFloat(sc.nextLine());
       System.out.println("Introduce los KM totales recorridos ");
       totalKm= Float.parseFloat(sc.nextLine());
       System.out.println("Introduce la cantidad de litros repostados ");
       litrosCombustible= Float.parseFloat(sc.nextLine());
       
       porcentajeConsumo= litrosCombustible/(totalKm-kmrecorridos) ;
       
       System.out.printf("Propietario:%s ",nombrePropietario);
       System.out.printf(" \n Matrícula camión:%s ",matriculaVehiculo);
       System.out.printf("º\n Porcentaje de consumo: %.2f %% ",porcentajeConsumo);
       
    }
    
}
