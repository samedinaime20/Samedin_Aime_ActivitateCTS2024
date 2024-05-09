import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Reteta implements IReteta{
private List<String> reteta;

    public void setReteta(List<String> reteta) {
        this.reteta = reteta;
    }
    public Reteta(){
        reteta=new ArrayList<String>();
    }

    public void incarcaReteta(){
        try{
            BufferedReader reader=new BufferedReader(new FileReader("reteta.txt"));
            String medicament=null;
            while ((medicament=reader.readLine())!=null){
                reteta.add(medicament);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public IReteta copiaza() throws CloneNotSupportedException{
        return (IReteta) super.clone();
    }

    @Override
    public String toString() {
        return "Reteta [medicamente= " + reteta + "]";
    }
}
