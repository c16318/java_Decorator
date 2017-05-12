
package newpackage;

/**
 *
 * @author matsu
 */
public class Main {
    public static void main(String[] args){
        Beverage b1 = new HouseBlend();
        Beverage b2 = new Furappeccino(b1);
        Beverage b3 = new CafeMocha(b2);
      
      System.out.println(b1.getDescription() + ":"+ b1.getCost()+"円");
      System.out.println(b2.getDescription() + ":"+ b2.getCost()+"円");
      System.out.println(b3.getDescription() + ":"+ b3.getCost()+"円");
      
 
      
      
      
    }

}
