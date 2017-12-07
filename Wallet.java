/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogram.pkg007;

/**
 *
 * @author personhubfab
 */
class Wallet {
    
    private float money;
    
    public void setMoney(float money){
        this.money = money;
    }
    
    public boolean pullOutMoney(float amount){
        
        if (money >= amount){
            money -=amount;
            return true;
        }
        return false;
    }
    
}
