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
public class Punto {
    public static final double PI = 3.1415;
    public static int numeroInstancias;
    private int x,y;
    static{
        Punto.numeroInstancias = 0;
    }
    //Constructores. deben incrementar el atributo 
    //numeroInstancias
    public static int instanciasCreadas(){
        return Punto.numeroInstancias;
    }
}
