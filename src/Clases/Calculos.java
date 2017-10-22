/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Reny
 */
public class Calculos {
    String r[];

    public Calculos() {
    }
    
    
    public String [] Caracteres(String a){
     r=new String[a.length()];
        for (int i = 0; i <a.length(); i++) {
            r[i]=a.charAt(i)+"";
        }
        return r;
    }
    public String Transformacion(){
    String resp="";
        for (int i = 0; i <r.length; i++) {
            if (r[i].equals("a")) {
                resp="/images/a.png";
                break;
            }else if (r[i].equals("b")) {
                resp="/images/b.png";
                break;
            }else{
            resp="/images/Plantilla.png";
            break;
            }
        }
    return resp;
    }
}
