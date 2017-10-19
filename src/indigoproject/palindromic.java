/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indigoproject;

import java.util.ArrayList;

/**
 *
 * @author HCProgrammer 06
 */
public class palindromic {
    int input ;
   
    
    public boolean Check (String in){
        //System.out.println("Entrada"+in);
        char[] charArray = in.toCharArray();
        String Poli= charArray[0]+"";
        for(int j=1 ; j<=charArray.length-1; j++){          
            Poli=charArray[j]+""+Poli;
           }
      // System.out.println("salida"+Poli);

       if(Integer.parseInt(Poli)==Integer.parseInt(in)){return true;}
       else {return false; }
       
    }
    
}
