import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class Main {
    public static void main(String[] args){
       

        List<Produtos> produtos = new ArrayList<>();
     
        Interface interfaceProd = new Interface(produtos); 

        System.out.println(produtos);   

    }
}
