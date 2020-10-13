/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3biblioteca;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejercicio3Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        informacionLibro(leer);
    }

    public static void informacionLibro(Scanner leer) {
        String mesActual; 
        int cantidadLibrosPrestados;
        String nombreLibro;
        byte cantidadConsultasLibro;
        int cantidadMensualPrestamos;

        System.out.printf("Introduzca mes actual: ");
        mesActual = leer.nextLine();
        System.out.printf("Introduzca cantidad de libros  prestados: ");
        cantidadLibrosPrestados = leer.nextInt();
        leer.nextLine();
        System.out.printf("Introduzca título del libro: ");
        nombreLibro = leer.nextLine();
        System.out.printf("Introduzca la cantidad de consultas  mensual del libro: ");
        cantidadConsultasLibro = leer.nextByte();
        System.out.printf("Introduzca la cantidad mensual de préstamos: ");
        cantidadMensualPrestamos = leer.nextInt();

        elaborarInforme(mesActual, cantidadConsultasLibro, nombreLibro, cantidadConsultasLibro, cantidadMensualPrestamos);

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
      // test
    }

}
