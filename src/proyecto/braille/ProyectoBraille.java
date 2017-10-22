/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.braille;

import java.util.Scanner;

/**
 *
 * @author Reny
 */
public class ProyectoBraille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String a[],b[];
        String n;
        n=sc.next();
        a=new String[n.length()];
        for (int i = 0; i <a.length; i++) {
            a[i]=n.charAt(i)+"";
        }
        for (int i = 0; i <n.length(); i++) {
            System.out.println(""+a[i]);
        }
    }
    
}
