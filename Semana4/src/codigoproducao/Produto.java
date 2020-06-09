package codigoproducao;

public class Produto {

	private String nome;
	private Double preco;
	private int codigo;
	private boolean hash;
	private int hashCode;
	

	public Produto (String nomeProduto, Double precoProduto, int codigoProduto) {
		
		nome = nomeProduto;
		preco = precoProduto;
		codigo = codigoProduto;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}
	

	
	public boolean equals(Object obj) {
		 Produto produto = (Produto) obj;
		 hash = this.codigo == produto.codigo;
		 hashCode();
		 return hash;
	}
	
	public int hashCode() {
		if (hash) {
			return hashCode;
		}
		
		return -1;

	}
		
	
	
}
	

	
	

