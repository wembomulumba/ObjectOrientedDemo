/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogram.pkg007;
import java.io.*;
import java.util.*;
/**
 *
 * @author personhubfab
 */

class Point{
    
    int x ;
    int y;
    
    double getDistance(){
        
        return (Math.sqrt(x * x + y * y));
    }
}

public class ObjectOrientedProgram007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Wallet wallet = new Wallet();
      System.out.println("Putting $500 in the wallet\n");
      wallet.setMoney(500);
      
      System.out.println("Pulling Out $100 ...");
      boolean isMoneyInWallet = wallet.pullOutMoney(100);
      
      if(isMoneyInWallet){
          
          System.out.println("Got it!");
      } else {
          System.out.println("Nope, not enough money");
      }
      System.out.println("\nPulling out $300...");
      isMoneyInWallet = wallet.pullOutMoney(300);
      
      if(isMoneyInWallet){
          System.out.println("Got it !");
      }
      System.out.println("\nPulling out $200...");
      isMoneyInWallet = wallet.pullOutMoney(200);
      
      if(isMoneyInWallet){
          System.out.println("Got it !");
      } else {
          
          System.out.println("Nope, not enough Money ");
      }
     
    }
}
