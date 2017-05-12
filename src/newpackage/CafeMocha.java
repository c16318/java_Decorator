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
public class CafeMocha extends CondimentDecorator{
    
    public CafeMocha(Beverage beverage){
        super(beverage);
    }
    
    public String getDescription(){
        return  beverage.getDescription() + "+牛乳";
    }
    
    public int getCost(){
        return beverage.getCost() + 50;
    }
}
