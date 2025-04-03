import java.util.List;
import javax.security.auth.kerberos.DelegationPermission;

import javax.swing.*;
public class Interface {
    
    private int resultado;  
    private int i=0;
    private String[] opcoes = {"Criar","Comprar","Vender","Consultar","Sair"};
    public Interface (List<Produtos> produtos){
        
        while(resultado != 4){
            
            resultado = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Produtos", JOptionPane.YES_NO_OPTION , JOptionPane.PLAIN_MESSAGE, null, opcoes, "Botao 3");
            if(resultado == 0)
            {
                Produtos produto = new Produtos (i);
                
                
                String nome = JOptionPane.showInputDialog(null,"Digite o nome do produto: ");
                String type = JOptionPane.showInputDialog(null,"Digite o tipo do produto: ");
                String preco = JOptionPane.showInputDialog(null,"Digite o preco do produto: ");
                produto.inserir(nome, type , Double.parseDouble(preco));
                if(i!=0 && produto.igual(produtos, produto)){
                    
                   JOptionPane.showMessageDialog(null, "JÁ EXISTE UM PRODUTO COM ESSE NOME E TIPO");
                             
                }
                else{
                    produtos.add(produto);
                    
                }
                i++;
                
            }
            
            if(resultado == 1 ){
                Produtos produto = new Produtos (i);
                String nome = JOptionPane.showInputDialog(null,"Digite o nome do produto a ser vendido: ");     
                String tipo = JOptionPane.showInputDialog(null,"Digite o tipo do produto a ser vendido: ");
                String compra = JOptionPane.showInputDialog(null,"Digite a quantidade do produto a ser comprada: ");
                produto.inserir(nome, tipo,0);
                produto.comprar( Integer.parseInt(compra), nome, tipo, produtos);
                
                
                
            }
            if(resultado == 2 ){
                Produtos produto = new Produtos (i);
                String nome = JOptionPane.showInputDialog(null,"Digite o nome do produto a ser vendido: ");     
                String tipo = JOptionPane.showInputDialog(null,"Digite o tipo do produto a ser vendido: ");
                String venda = JOptionPane.showInputDialog(null,"Digite a quantidade do produto a ser vendida: ");
                
                produto.vender(nome, tipo, Integer.valueOf(venda), produtos);
                
                
                
            }
            
            if(resultado == 3 ){
                JOptionPane.showMessageDialog(null, produtos);             
                
            }
        }
    }


}