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
public class Cliente extends Persona {
    /**
     * Teléfono de contacto
     */
    private String telefono;

    /**
     * Lista de empresas contratadas
     */
    private ArrayList<Empresa> empresas;

    /**
     * Constructor vacío
     */
    public Cliente() {
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param edad
     * @param telefono
     * @param empresas
     */
    public Cliente(String nombre, int edad, String telefono, ArrayList<Empresa> empresas) {
        super(nombre, edad);
        this.telefono = telefono;
        this.empresas = empresas;
    }

    /**
     * Sobrescribe el método de la clase madre
     * @see Persona#mostrar()
     */
    @Override
    public void mostrar() {
        super.mostrar();
    }

    /**
     * Añade una empresa a la lista de empresas
     * @param empresa
     */
    public void addEmpresa(Empresa empresa) {
        if (this.empresas == null)
            this.empresas = new ArrayList<>();
        this.empresas.add(empresa);
    }

}