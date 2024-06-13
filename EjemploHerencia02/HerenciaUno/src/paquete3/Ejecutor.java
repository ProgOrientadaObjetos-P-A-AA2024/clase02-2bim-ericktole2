/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "Erick";
        String apellido = "Toledo";
        String identificacion = "1150579686";
        int edad = 20;

        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);

        estDistancia.establecerCostoAsignatura(100);
        estDistancia.establecerNumeroAsginaturas(5);
        estDistancia.calcularMatriculaDistancia();

        EstudiantePresencial estPresencial
                = new EstudiantePresencial(nombre, apellido, identificacion, edad);
        estPresencial.establecerNumeroCreditos(15);
        estPresencial.establecerCostoCredito(20);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estDistancia);

    }
}
