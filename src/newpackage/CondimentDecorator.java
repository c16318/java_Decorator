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
public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    
    protected CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    
    //public abstract String getDescription();
    
}
