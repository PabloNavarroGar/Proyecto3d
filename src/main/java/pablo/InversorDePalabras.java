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
public class InversorDePalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Leer una para palabra y mientraas no sea salir el programa se esta ejecutando,
        //Si le introduciomos la palabra tomate, la pone al reves etamot

        String palabra;
        int invertida = 0;
        do {
            palabra = JOptionPane.showInputDialog(null, "Introduce la palabra");

            JOptionPane.showMessageDialog(null, "Tu palabra es : " + palabra);

            for (int i = palabra.length() - 1; i < 10; i--) {

                invertida += palabra.charAt(i);

                if ("tomate".equals(palabra)) {

                    invertida--;

                }

            }

            JOptionPane.showMessageDialog(null, "tomate al reves es" + invertida);

        } while (palabra.equals("salir") == true || palabra.equals(palabra) == false);

    }

}
