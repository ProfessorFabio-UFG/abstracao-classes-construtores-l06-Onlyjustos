import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Produtos {

	private int cod;
	private String nomeProd;
	private int qnt;
	private String type;
	private double preco;
    	

	public Produtos(int cod)
	{
		this.cod = cod; 

	}

	public Produtos(int cod,String nomeProd)

	{

		this.cod = cod; 

		this.nomeProd = nomeProd;


	}



	public Produtos(int cod,String nomeProd,int qnt)

	{

		this.cod = cod; 

		this.nomeProd = nomeProd;

		this.qnt = qnt;
		

	}

	public Produtos(int cod,String nomeProd,int qnt,String type)

	{

		this.cod = cod; 

		this.nomeProd = nomeProd;

		this.qnt = qnt;

		this.type = type;


	}

	public Produtos(int cod,String nomeProd,int qnt,String type, float preco)

	{

		this.cod = cod; 

		this.nomeProd = nomeProd;

		this.qnt = qnt;

		this.type = type;

		this.preco = preco;

	}

	

	public int getCod() {

		return this.cod;

	}



	public void setCod(int cod) {

		this.cod = cod;

	}



	public String getNomeProd() {

		return this.nomeProd;

	}



	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}


	public int getQnt() {

		return this.qnt;

	}



	public void setQnt(int qnt) {

		this.qnt = qnt;

	}



	public String getType() {

		return this.type;

	}



	public void setType(String type) {

		this.type = type;

	}



	public double getPreco() {

		return this.preco;

	}



	public void setPreco(double preco) {

		this.preco = preco;

	}

	
    
    public void vender(String nome, String tipo, Integer venda, List<Produtos> produtos ) {
        for(Produtos p : produtos){
            if(p.getNomeProd().equals(nome) && p.getType().equals(tipo)) {     
                if(p.getQnt() - venda < 0)  {
                    JOptionPane.showMessageDialog(null, "SEM ESTOQUE");
                }
                else {
                    p.setQnt(p.getQnt()-venda);
                    JOptionPane.showMessageDialog(null, "Venda realizada de R$"+getPreco()*venda);
                }
                
            }
        }
        
    
		
	}


	public void comprar(int qnt, double valor) {

		setQnt(getQnt()+qnt);

		setPreco(valor);

	}

	
	public void comprar(int qnt, String nome, String tipo, List<Produtos> produtos) {
        for(Produtos p : produtos){
              
            if(p.getNomeProd().equals(nome) && p.getType().equals(tipo)) {   
                
                p.setQnt(getQnt()+qnt);
                
            }
        }
		

	}




	public void inserir(String nome, String type, double preco ) {
		setNomeProd(nome);
		setType(type);
		setPreco(preco);
	}



	public boolean  igual( List<Produtos> produtos, Produtos produto) {
        for(Produtos p : produtos){
        
            if(p.getNomeProd().equals(produto.getNomeProd()) && p.getType().equals(produto.getType())) {
                    return true ;
            }
            
            
        }
        
        return false;        
                
	}
    


	@Override
	public String toString() {
		return "Codigo: " + this.cod + ", Nome: " + this.nomeProd +
			   ", Quantidade: " + this.qnt + ", Tipo: " + this.type +
			   ", Preco: " + this.preco+"\n";
	}

	

}