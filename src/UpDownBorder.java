/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class UpDownBorder extends Border{
    
    private char borderChar;
    
    public UpDownBorder(Display display,char c){
        super(display);
        this.borderChar = c;
    }
    
    public int getColumns(){
        return display.getColumns() + 2;
    }
    public int getRows(){
        return display.getRows() + 2;
    }
    public String getRowText(int row){
        StringBuffer buf = new StringBuffer().append('+');
        
        if(row == 0 || row == getRows() - 1){
            return makeLine(borderChar,display.getColumns());
        }
        else{
            return display.getRowText(row - 1);
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
