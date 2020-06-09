package codigoproducao;

public class ProdutoComTamanho extends Produto {
	
	private String tamanho;
	private boolean verificaTamanhoECodigo;
	
		public ProdutoComTamanho (String nomeProduto, Double precoProduto, int codigoProduto, String tamanho) {
		super(nomeProduto, precoProduto, codigoProduto);
		this.tamanho = tamanho;
	}
	
	public String getTamanho() {
			return tamanho;
		}

		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}

	public boolean equals (Object obj) throws ClassCastException {
		if (obj.getClass().toString().contentEquals("class codigoproducao.Produto")) {
			return super.equals(obj);
		}
		
		ProdutoComTamanho produtoTamanho = (ProdutoComTamanho) obj;
		
		if (this.tamanho == produtoTamanho.tamanho) 
		{
			verificaTamanhoECodigo = super.equals(obj);
			if (verificaTamanhoECodigo)
				return true;
		}	
		
		return false;
	}
	
	public int hashCode() {
		
		if (verificaTamanhoECodigo) {
			return super.hashCode();
		}
		
		return -1;

	}
	

}
