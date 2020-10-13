/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2calculonominabuzzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marti
 */
public class Ejercicio2CalculoNominaBuzzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        String nombreEmpleado, mesActual;
        Float salarioBase, porcentajeDescuento, precioHora;
        Byte numHorasExtra;

        Float pagoHorasExtra, descuentoNomina, nominaConDeducciones, salarioNeto;

        try {
            System.out.printf("Introduce el nombre del empleado:");
            nombreEmpleado = leer.readLine();
            System.out.printf("Introduce el salario base:");
            salarioBase = Float.parseFloat(leer.readLine());
            System.out.printf("Introduce el porcentaje de descuento:");
            porcentajeDescuento = Float.parseFloat(leer.readLine());
            System.out.printf("Introduce el número de horas extra:");
            numHorasExtra = Byte.parseByte(leer.readLine());
            System.out.printf("Introduce el precio de las horas :");
            precioHora = Float.parseFloat(leer.readLine());
            System.out.printf("Introduce el mes actual:");
            mesActual = leer.readLine();

            pagoHorasExtra = numHorasExtra * precioHora;
            descuentoNomina = ((porcentajeDescuento * (salarioBase + pagoHorasExtra)) / 100);
            nominaConDeducciones = salarioBase - descuentoNomina;
            salarioNeto = nominaConDeducciones + pagoHorasExtra;

            System.out.printf("Mes: %s", mesActual);
            System.out.printf("\nNómina del empleado: %s", nombreEmpleado);
            System.out.printf("\nPorcentaje de descuento: %.2f %%", porcentajeDescuento);
            System.out.printf("\nHoras extra : %d", numHorasExtra);
            System.out.printf("\nDescuentos: %.2f", descuentoNomina);
            System.out.printf("\nDiferencia: %.2f", nominaConDeducciones);
            System.out.printf("\nSalario neto: %.2f", salarioNeto);
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException x) {
            System.out.println("Valor introducido no válido");
        }
    }
    
}
