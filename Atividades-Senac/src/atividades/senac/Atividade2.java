/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades.senac;

/**
 *
 * @author sala302b
 */
public class Atividade2 {
    public static void main(String[] args) {
        double lado1 = 5;
        double lado2 = 15;
        
        double mariola = misturaGoiaba(lado1, lado2);
        
    }
            private static double misturaGoiaba (double l1, double l2){
                double area = l1 * l2;
                double perimetro = (l1*2)+(l2*2);
                double total = area + perimetro;
        return total;
            }

}

