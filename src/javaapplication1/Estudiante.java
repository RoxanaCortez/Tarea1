/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Roxana
 */
public class Estudiante {
    String nombre;
    String apellido;
    String correo;
    String carné;
    int teléfono;
     
    public Estudiante(String nomb, String apell, String corr, String carnet, int telef) {
        this.nombre = nomb;
        this.apellido = apell;
        this.correo = corr;
        this.carné = carnet;
        this.teléfono = telef;
    }
    public void registrar(){
        System.out.println("Nombre: " + nombre);  
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Carné: " + carné);
        System.out.println("Teléfono: " + teléfono);
    }
}
