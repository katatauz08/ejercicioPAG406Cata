package com.mycompany.ejerciciopag406;

import java.util.Scanner;

/**
 *
 * @author Catalina
 */
public class EjercicioPag406 {

    public static void main(String[] args) {
        VentanaVendedor v = new VentanaVendedor();
        v.setVisible(true);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del vendedor = ");
        String n = teclado.next();
        System.out.println("Apellidos del vendedor = ");
        String a = teclado.next();
        Vendedor vendedor = new Vendedor(n, a);
        System.out.println("Edad del vendedor = ");
        int e = teclado.nextInt();
        vendedor.verificarEdad(e);
        vendedor.imprimir();
        }
}
