/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2aoperadores66228;

/**
 *
 * @author End User
 */
public class Ejercicio2AOperadores66228 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[3][3];
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 4;
        matriz[1][0] = 6;
        matriz[1][1] = 6;
        matriz[1][2] = 9;
        matriz[2][0] = 8;
        matriz[2][1] = 10;
        matriz[2][2] = 12;
 
        int determinante = (matriz [0][0] * matriz[1][1] *  matriz[2][2]) - (matriz [0][2] * matriz[1][1] *  matriz[2][0]);
        System.out.print(determinante + "\n");
    }
    
}
