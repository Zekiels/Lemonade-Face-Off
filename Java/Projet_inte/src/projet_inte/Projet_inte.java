/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_inte;

import java.util.Random;

/**
 *
 * @author Théo
 */
public class Projet_inte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingredient ing = new Ingredient("citron", (float) 0.5);
        System.out.println(ing.getPrix());
        ing.fluctuation();
        System.out.println(ing.getPrix());
        ing.fluctuation();
        System.out.println(ing.getPrix());
        ing.fluctuation();
        System.out.println(ing.getPrix());
    }
    
}
