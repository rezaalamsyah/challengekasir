/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;


/**
 *
 * @author santuy
 */
public class Challenge {
   private int harga;
   private int diskon;
   private int total;
   public Challenge (int harga,int diskon,int total ){
       this.harga = harga;
       this.diskon = diskon;
       this.total = total;
   }
       public void info (){
           System.out.println("harga :  "+harga);           
           System.out.println("diskon :  "+diskon);          
           System.out.println("total : "+total);    
       }
    
    
}
