/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopag406;

import javax.swing.JOptionPane;

/**
 *
 * @author Catalina
 */
public class Vendedor {
    public String nombre; // Atributo que identifica el nombre de un vendedor
    public String apellidos; // Atributo que identifica los apellidos de un vendedor
    public int edad; // Atributo que identifica la edad de un vendedor
    /**
    * Constructor de la clase Vendedor
    * @param nombre Parámetro que define el nombre de un vendedor
    * @param nombre Parámetro que define la edad de un vendedor
    */
    Vendedor(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
}
    
    void imprimir() {
    JOptionPane.showMessageDialog(null,"Nombre","Nombre del vendedor", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Apellido","Apellido del vendedor", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Edad","Edad del vendedor", JOptionPane.INFORMATION_MESSAGE);
}
    void verificarEdad(int edad) {
    if (edad < 18) { 
    throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
    } if (edad >= 0 && edad < 120) { 
    this.edad = edad;
    } else throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
}
}
