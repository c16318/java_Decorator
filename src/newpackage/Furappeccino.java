
package newpackage;

/**
 *
 * @author matsu
 */
public class Furappeccino extends CondimentDecorator{
    
    public Furappeccino(Beverage beverage){
        super(beverage);
    }
    
    public String getDescription(){
        return  beverage.getDescription() + "+生クリーム";
    }
    
    public int getCost(){
        return beverage.getCost() + 30;
    }
}

