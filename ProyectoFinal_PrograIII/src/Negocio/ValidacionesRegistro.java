/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.regex.Pattern;

/**
 *
 * @author Arell
 */
public class ValidacionesRegistro {
    
  
  public static String validarLongitud(String input, int longitudEsperada) {
        if (input.length() == longitudEsperada) {
            return input;
        } else {
            return null;
        }
    }
  public static String validarCaracter(String input) {
        String regex = "^[a-zA-Z]$";
        if (Pattern.matches(regex, input)) {
            return input;
        } else {
            return null;
        }
    }
}