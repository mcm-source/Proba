/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3biblioteca.version2;

import java.util.Scanner;
import ejercicio3biblioteca.version2.Libro;

/**
 *
 * @author marti
 */
public class Ejercicio3BibliotecaVersion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro libroConsulta = new Libro();

        System.out.printf("Introduzca mes actual: ");
        Libro.mesActual = leer.nextLine();
        System.out.printf("Introduzca cantidad de libros  prestados: ");
        Libro.cantidadLibrosPrestados = leer.nextInt();
        leer.nextLine();
        System.out.printf("Introduzca título del libro: ");
        libroConsulta.setNombreLibro(leer.nextLine());
        System.out.printf("Introduzca la cantidad de consultas  mensual del libro: ");
        libroConsulta.setCantidadConsultasLibro(leer.nextByte()); 
        System.out.printf("Introduzca la cantidad mensual de préstamos: ");
        Libro.cantidadMensualPrestamos = leer.nextInt();

        libroConsulta.elaborarInforme();

    }
}
