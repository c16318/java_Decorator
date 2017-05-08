
/**
 *「飾り枠」を表す抽象クラス
 * @author c16318
 */
public abstract class Border extends Display{
    Display display;
    
    protected Border(Display display){
        this.display = display;
    }
}
