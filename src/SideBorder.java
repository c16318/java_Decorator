

/**
 *左右のみ飾り枠をつけるクラス
 * @author c16318
 */
public class SideBorder extends Border{
    
    private char borderChar;
    
    //コンストラクタ
    public SideBorder(Display display,char c){
        super(display);
        this.borderChar = c;
    }
            
    public int getColumns(){
        return display.getColumns() + 2;
    }
    public int getRows(){
        return display.getRows();
    }
    public String getRowText(int row){
        return borderChar + display.getRowText(row) + borderChar;
    }
            
}
