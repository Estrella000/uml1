/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploempresa;

import java.util.ArrayList;

/**
 *
 * @author estrella
 */
public class Directivo extends Empleado {
    /**
     * Categoría del directivo. Es un número del 1 al 3 siendo el 1 el de mayor nivel.
     */
    private int categoria;

    /**
     * Lista de empleados a su cargo
     */
    private ArrayList<Empleado> subordinados;

    /**
     * Constructor vacío
     */
    public Directivo() {
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param edad
     * @param sueldoBruto
     * @param empresa
     * @param superiores
     * @param categoria
     * @param subordinados
     */
    public Directivo(String nombre, int edad, float sueldoBruto, Empresa empresa,
            ArrayList<Directivo> superiores, int categoria, ArrayList<Empleado> subordinados) {
        super(nombre, edad, sueldoBruto, empresa, superiores);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    /**
     * Sobrescribe el método de la clase madre
     * @see Empleado#mostrar()
     */
   
    public void mostrar() {
        super.mostrar();
    }
}