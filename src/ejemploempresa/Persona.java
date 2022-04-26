/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploempresa;

/**
 *
 * @author estrella
 */
public class Persona {
    /**
     * Nombre y apellidos de la persona
     */
    private String nombre;

    /**
     * Edad de la persona en años. Si es una persona jurídca se refiere a los años
     * desde que se constituyó.
     */
    private int edad;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Muestra en pantalla los datos de la persona
     */
    public void mostrar() {
    System.out.println("nombre "+ this.nombre+ " edad "+this.edad);
    }
}
