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
        String invertida = "";
        do {
            palabra = JOptionPane.showInputDialog(null, "Introduce la palabra");

             if(palabra.equals("salir")) {
                 
             JOptionPane.showMessageDialog(null,
                     palabra);
                 
             }
             else{
            JOptionPane.showMessageDialog(null, "Tu palabra es : " + palabra);
              //la i es igual a la palabra la longitud, si i es mayor a 0(que es la palabra) resta 1
            for (int i = palabra.length() ; i > 0; i--) {
                  //declaramos la invertida es mas iugal a la palabra con el char y la i restando1
                invertida += palabra.charAt(i-1);

//               

            }
             }

            JOptionPane.showMessageDialog(null, "tomate al reves es " + invertida);

        } while (palabra.equals("salir") == true || palabra.equals(palabra));

    }

}
