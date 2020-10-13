/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2.consumocamion;

/**
 *
 * @author martin
 */
public class Ejercicio2ConsumoCamion {

   
    public static void main(String[] args) {
       String nombrePropietario;
       String matriculaVehiculo;
       float kmRecorridos;
       float totalKm;
       float litrosCombustible;
       double  porcentajeConsumo;
       
       nombrePropietario= "Manuel";
       matriculaVehiculo= "6578BM";
       kmRecorridos= 205;
       totalKm= 3000;
       litrosCombustible= 60;
       
       porcentajeConsumo= litrosCombustible/(totalKm-kmRecorridos) ;
       
       System.out.printf("Propietario: %s ",nombrePropietario);
       System.out.printf("\nMatrícula camión: %s",matriculaVehiculo);
       System.out.printf("\nPorcentaje de consumo: %.2f%% ",porcentajeConsumo);

    }
    
}
