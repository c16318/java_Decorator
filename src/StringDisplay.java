/**
 *1行だけからなる文字列表示用のクラス
 * @author c16318
 */
public class StringDisplay extends Display{
    
    private String string;
      
    //コンストラクタ
    public StringDisplay(String string){
        this.string = string;
    }
    
    //文字列の文字数
    public int  getColumns(){
        return string.getBytes().length;
    }
    
    public int getRows(){
        return 1;
    }
    
    public String getRowText(int row){
        if(row == 0){
            return string ;
        }
        else{
            return null;
        }
        
    }
         
}
