/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_calculonominascanner;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio2_CalculoNominaScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        String nombreEmpleado, mesActual;
        Float salarioBase, porcentajeDescuento, precioHora;
        Byte numHorasExtra;

        Float pagoHorasExtra, descuentosNomina, nominaConDeducciones, salarioNeto;

        System.out.printf("Introduce el nombre del empleado:");
        nombreEmpleado = leer.nextLine();
        System.out.printf("Introduce el salario base:");
        salarioBase = leer.nextFloat();
        System.out.printf("Introduce el porcentaje de descuento:");
        porcentajeDescuento = leer.nextFloat();
        System.out.printf("Introduce el número de horas extra:");
        numHorasExtra = leer.nextByte();
        System.out.printf("Introduce el precio de las horas :");
        precioHora = leer.nextFloat();
        System.out.printf("Introduce el mes actual:");
        leer.nextLine();
        mesActual = leer.nextLine();

        pagoHorasExtra = numHorasExtra * precioHora;
        descuentosNomina = ((porcentajeDescuento * (salarioBase + pagoHorasExtra)) / 100);
        nominaConDeducciones = salarioBase - descuentosNomina;
        salarioNeto =  nominaConDeducciones + pagoHorasExtra;

        System.out.printf("Mes: %s", mesActual);
        System.out.printf("\nNómina del empleado: %s", nombreEmpleado);
        System.out.printf("\nPorcentaje de descuento: %.2f %%", porcentajeDescuento);
        System.out.printf("\nHoras extra : %d", numHorasExtra);
        System.out.printf("\nDescuentos: %.2f", descuentosNomina);
        System.out.printf("\nDiferencia: %.2f", nominaConDeducciones);
        System.out.printf("\nSalario neto: %.2f", salarioNeto);
        

    }

}
