/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo6;

/**
 *
 * @author Miguel
 */
public class POO6 {

    public static void main(String[] args) {
        
        boolean validar = ValidarContraseña.validar("miguel", "clave.123");
        
        if(validar==true)
        {
            System.out.println("Credenciales correctas...");
        }
        else
        {
            System.out.println("Usuario o contraseña incorrecto...");
        }
        
    }
}
