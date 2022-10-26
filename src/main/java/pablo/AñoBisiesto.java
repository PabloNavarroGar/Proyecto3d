/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablo;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class AñoBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Vamos a hacer un bucle hasta que el usuario introduzca el 0, si introduce un año
        //negativo se pone positivo, si mayor que 0 y positivo, el programa tiene que decir
        //si es bisiesto o no, condicion para que sea bisiesto, 
        // tiene que ser divisible por 4 y no divisible por 100 o divisible por 400 ||
        //divisible por 4 Y (no divisible por 100  o divisible por 400  )
        int anio;

//        do {
//            String fechaString = JOptionPane.showInputDialog(null, "Introduce el "
//                    + "año para saber si es bisiesto o no");
//            anio = Integer.parseInt(fechaString);
//
//            JOptionPane.showMessageDialog(null, "Tu año es " + anio);
//
//            if ((anio % 4 == 0) && (anio % 100 != 0 || (anio % 400 == 0))) {
//                JOptionPane.showMessageDialog(null, +anio + " es bisiesto");
//
//            } else {
//                JOptionPane.showMessageDialog(null, +anio + " no es bisiesto");
//
//            }
//        } while (anio == 0 == false);
        do {
            String fechaString = JOptionPane.showInputDialog(null, "Introduce el "
                    + "año para saber si es bisiesto o no");
            anio = Integer.parseInt(fechaString);

            JOptionPane.showMessageDialog(null, "Tu año es " + anio);

            if (anio == 0) {

                JOptionPane.showMessageDialog(null, "Haz seleccionado 0, sales del pograma");
            } else {

                if ((anio % 4 == 0) && (anio % 100 != 0 || (anio % 400 == 0))) {
                    JOptionPane.showMessageDialog(null, +anio + " es bisiesto");

                } else {
                    JOptionPane.showMessageDialog(null, +anio + " no es bisiesto");

                }

            }

        } while (anio == 0 == false);

    }

}
