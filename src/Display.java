/**
 *文字列表示用の抽象クラス
 * @author c16318
 */
public abstract class Display {
    
    public abstract int  getColumns();          //1行文字列の文字数
    public abstract int getRows();              //行数
    public abstract String getRowText(int row); //１行の文字列の取得
    
    public void show(){
        for(int i=0;i < getRows();i++){   //getRows():行数文繰り返し
            System.out.println(getRowText(i));
        }
    }
    
    
            
}
