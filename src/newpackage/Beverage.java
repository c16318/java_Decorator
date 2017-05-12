/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author matsu
 */
public abstract class Beverage {
    private int cost = 100;
   
   public abstract String getDescription();
   public int getCost(){
       return cost;
   }
   
   public void setCost(int cost){
       this.cost = cost;
   }
  
    
}
