/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatica;

/**
 *
 * @author Rafael
 */
public class Estatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        //pedir a al usuario y b
        double a = 5;
        double b = 7;
        double respuesta = calc.Sumar(a, b);
        System.out
                .println("la suma es : "
                        + String.valueOf(respuesta));
    }
}
