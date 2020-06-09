package codigoproducao;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	public Map<Produto, Integer> hashSetProduto = new HashMap<Produto, Integer>();
	protected int total = 0;
	protected int quantidadeAtualizada = 0;
	protected double totalCarrinho = 0;
	
	
	public void adicionaProduto(Produto produto, int quantidade) throws NullPointerException {
		
		for (Map.Entry<Produto, Integer> entry : hashSetProduto.entrySet()) {
		
			if (hashSetProduto.containsKey(produto) && hashSetProduto.size()>=1 && entry.getKey().equals(produto)) {
				
				total = hashSetProduto.get(produto);
				quantidadeAtualizada = quantidade + total;
				
				hashSetProduto.put(entry.getKey(), quantidadeAtualizada);
			
			} else {
					
					if (!hashSetProduto.containsKey(produto))
						hashSetProduto.put(produto, quantidade);
						break;
			}
			
		}
		
		if (hashSetProduto.size()==0) {
			hashSetProduto.put(produto, quantidade);
		}

		
	}	
		
	public void removeProduto(Produto produto, int quantidade) throws NullPointerException {
			
		
		for (Map.Entry<Produto, Integer> entry : hashSetProduto.entrySet()) {
			
			
			if (produto.equals(entry.getKey()) && hashSetProduto.get(produto)>=quantidade) {
				quantidadeAtualizada = hashSetProduto.get(produto) - quantidade;
				
				if (quantidadeAtualizada == 0)
					hashSetProduto.remove(produto);
				else
					hashSetProduto.replace(entry.getKey(), quantidadeAtualizada);
				break;
			}
		}
		
		
			
			
			
		}
	
	
		public Double calculaTotal () {
			
			for (Map.Entry<Produto, Integer> entry : hashSetProduto.entrySet()) {
				totalCarrinho+= entry.getValue() * entry.getKey().getPreco();
			}
			return totalCarrinho;
		}

			
	}

	

