

/**
 *上下左右に飾り枠をつける
 * @author c16318
 */
public class FullBorder extends Border{
    
    public FullBorder(Display display){
        super(display);
    }
    
    public int getColumns(){
        return display.getColumns() + 2;
    }
    public int getRows(){
        return display.getRows() + 2;
    }
    public String getRowText(int row){
        StringBuffer buf = new StringBuffer().append('+');
        
        if(row == 0){
            return "+" +  makeLine('-',display.getColumns()) + "+";
        }
        else if(row == display.getRows() + 1){
            return "+" + makeLine('-',display.getColumns()) + "+";
        }
        else{
            return "|" + display.getRowText(row - 1) + "|";
        }

    }
   public String makeLine(char ch,int count){
       StringBuffer buf = new StringBuffer();
       for(int i = 0;i < count;i++){
           buf.append(ch);
       }
       return buf.toString();
   }
            
}
