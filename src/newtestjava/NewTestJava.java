/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtestjava;

/**
 *
 * @author roman.silhan
 */
public class NewTestJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 9;
        int p = 1;
        int o = 9;
        int max = 0;
        for (int i = 0; i < 11; i++) {
            System.out.println(c + (p++) +"xp");
            max = c + p;
        }
        if (max > 18) {
            System.out.println("LvL UP");
        }

    }
}
