/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablo;

/**
 *
 * @author pablo
 */
public class sucesionDeFibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Realiza un programa que imprima por consolar los 
        //35 primeros terminos de la siguiente serie:
        //F0=0 F1=1 Fn = fn-1 + fn-2 
        //Sucesion de Fibonnaci
        final int NUMERO_DE_IMPRICIONES = 35;
        int F0 = 0;
        int F1 = 1;

        int suma = 1;

        for (int i = 1; i < NUMERO_DE_IMPRICIONES; i++) {
            //1ºMostramos la suma

            System.out.println(suma);

            //2ºSumamos los numeros
            suma = F0 + F1;

            //3ºcambiar las 2º variable por la primera
            F0 = F1;

            //4º cambiamos la suma por la segunda variable
            F1 = suma;
        }

    }

}
