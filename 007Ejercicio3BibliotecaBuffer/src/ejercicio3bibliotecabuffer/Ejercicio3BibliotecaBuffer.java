/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3bibliotecabuffer;

import java.io.*;

/**
 *
 * @author marti
 */
public class Ejercicio3BibliotecaBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

       informacionLibro(leer);
     
    }
    
     public static void informacionLibro( BufferedReader leer){
          try {
            String mesActual;
            int cantidadLibrosPrestados; 
            String nombreLibro;
            byte cantidadConsultasLibro;
            int cantidadMensualPrestamos;

            System.out.printf("Introduzca mes actual: ");
            mesActual = leer.readLine();
            System.out.printf("Introduzca cantidad de libros  prestados: ");
            cantidadLibrosPrestados = Integer.parseInt(leer.readLine());
            System.out.printf("Introduzca título del libro: ");
            nombreLibro = leer.readLine();
            System.out.printf("Introduzca la cantidad de consultas  mensual del libro: ");
            cantidadConsultasLibro = Byte.parseByte(leer.readLine());
            System.out.printf("Introduzca la cantidad mensual de préstamos: ");
            cantidadMensualPrestamos = Integer.parseInt(leer.readLine());

            elaborarInforme(mesActual, cantidadConsultasLibro, nombreLibro, cantidadConsultasLibro, cantidadMensualPrestamos);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException x) {
            System.out.println("Valor introducido no válido");
        }
     }
          
    public static float calcularTasaConsultas(byte numeroConsultas, int cantidadMensualPrestamos) {
        float tasaConsultasMensual;
        tasaConsultasMensual = (numeroConsultas * 100) / cantidadMensualPrestamos;
        return tasaConsultasMensual;
    }

    public static void elaborarInforme(String mesAcutal, int cantidadConsultasLibro, String nombreLibro,
            byte numeroConsultas, int cantidadMensualPrestamos) {

        System.out.printf("\n************INFORME LIBROS PRESTADOS************");
        System.out.printf("\n\nEl libro %s se consultó %d veces.", nombreLibro, cantidadConsultasLibro);
        System.out.printf(" \nLa tasa de consultas en el mes de %s es del %.2f %%", mesAcutal, calcularTasaConsultas(numeroConsultas, cantidadMensualPrestamos));

        
        
    }
}
