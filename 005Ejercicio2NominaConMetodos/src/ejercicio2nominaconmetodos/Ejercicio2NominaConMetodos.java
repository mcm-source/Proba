/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2nominaconmetodos;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio2NominaConMetodos {

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

        calcularNomina(nombreEmpleado, mesActual, numHorasExtra,
                precioHora, porcentajeDescuento, salarioBase);

    }

    public static void calcularNomina(String nombreEmpleado, String mesActual, byte numHorasExtra, float precioHora, float porcentajeDescuento, float salarioBase) {

        float pagoHorasExtra = numHorasExtra * precioHora;
        float descuentosNomina = ((porcentajeDescuento * (salarioBase + pagoHorasExtra)) / 100);
        float nominaConDeducciones = salarioBase - descuentosNomina;
        float salarioNeto = nominaConDeducciones + pagoHorasExtra;
        System.out.printf("\n\n*******Nómina con información*******");
        System.out.printf("\nMes: %s", mesActual);
        System.out.printf("\nNómina del empleado: %s", nombreEmpleado);
        System.out.printf("\nPorcentaje de descuento: %.2f %%", porcentajeDescuento);
        System.out.printf("\nHoras extra : %d", numHorasExtra);
        System.out.printf("\nDescuentos: %.2f", descuentosNomina);
        System.out.printf("\nDiferencia: %.2f", nominaConDeducciones);
        System.out.printf("\nSalario neto: %.2f", salarioNeto);

        
    }
}
