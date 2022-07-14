/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo6;

/**
 *
 * @author Miguel
 */
public class ValidarContraseña 
{
    public static boolean validar(String usuario, String contraseña )
    {
        if(usuario.equals("miguel") && contraseña.equals("clave.123") )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
