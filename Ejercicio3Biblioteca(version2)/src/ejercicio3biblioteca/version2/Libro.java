/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3biblioteca.version2;

/**
 *
 * @author marti
 */
public class Libro {

    static String mesActual;
    static int cantidadLibrosPrestados;
    private String nombreLibro;
    private byte cantidadConsultasLibro;
    static int cantidadMensualPrestamos;

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setCantidadConsultasLibro(byte cantidadConsultasLibroB) {
        this.cantidadConsultasLibro = cantidadConsultasLibroB;
    }
    
    
    

    private  float calcularTasaConsultas () {
        float tasaConsultasMensual;
        tasaConsultasMensual = ( cantidadConsultasLibro * 100) / cantidadMensualPrestamos;
        return tasaConsultasMensual;
    }

    public void elaborarInforme() {

        if (cantidadConsultasLibro > cantidadMensualPrestamos) {
            System.out.printf("Datos no válidos: cantidad consultas libro mayor que la cantidad mensual de prestamos");
        } else {
            System.out.printf("\n************INFORME LIBROS PRESTADOS************");
            System.out.printf("\n\nEl libro %s se consultó %d veces.", nombreLibro, cantidadConsultasLibro);
            System.out.printf(" \nLa tasa de consultas en el mes de %s es del %.2f %%", mesActual, calcularTasaConsultas());

        }

    }

}
