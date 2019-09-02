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
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cateto1 = 10;
        int cateto2 = 20;
        double hipotenusa = teoremaPitagoras(cateto1,cateto2);
    }

    private static double teoremaPitagoras(int ctt1, int ctt2) {
        return Math.sqrt((ctt1 * ctt1) + (ctt2 * ctt2));
    }

}
