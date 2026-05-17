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
    JOptionPane.showMessageDialog(null,"Nombre: "+nombre,"Nombre del vendedor", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Apellido: "+apellidos,"Apellido del vendedor", JOptionPane.INFORMATION_MESSAGE);
    if(edad >= 18 && edad < 120){
        JOptionPane.showMessageDialog(null,
                "Edad: " + edad,
                "Edad del vendedor",
                JOptionPane.INFORMATION_MESSAGE);
    }
    else{
        JOptionPane.showMessageDialog(null,
                "Edad inválida: " + edad,
                "Edad del vendedor",
                JOptionPane.WARNING_MESSAGE);
    }
}
    public int verificarEdad(int edad){
        if(edad<18){
            this.edad = edad;
            JOptionPane.showMessageDialog(null, "El vendedor debe ser mayor de 18 años.", "Error de validación de edad", JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        else if(edad>=18 && edad<120){
            this.edad = edad;
            JOptionPane.showMessageDialog(null, "Edad registrada con éxito: " + edad);
            return edad;   
        }
        else{
            this.edad = edad;
            JOptionPane.showMessageDialog(null, "La edad no puede ser negativa ni mayor a 120", "Error de rango", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
}
