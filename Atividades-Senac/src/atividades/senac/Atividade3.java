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
public class Atividade3 {

    public static void main(String[] args) {
        String string1 = "O rato roeu a roupa";
        String string2 = "do rei de roma";
        String result = substituiVogal(string1, string2);

        System.out.println(result);
    }

    private static String substituiVogal(String st1, String st2) {
        st1 = "o rato roeu a roupa";
        st2 = "Do rei de roma";
        String concat = (st1 + st2)
                .replace("a", "1")
                .replace("e", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("u", "5");
        return concat;
    }

}
