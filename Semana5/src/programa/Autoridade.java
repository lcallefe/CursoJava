package programa;

public class Autoridade implements FormatadorNome{
	

	private boolean respeitoso;
	private boolean comTitulo;
	private boolean informal;
	private boolean masculino;
	private String nome;
	private String sobrenome;
	private String titulo;
	
	public Autoridade (String nome, String sobrenome, String titulo, boolean masculino, boolean informal, boolean respeitoso, boolean comTitulo) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.titulo = titulo;
		this.masculino = masculino;
		this.respeitoso = respeitoso;
		this.comTitulo = comTitulo;
		this.informal = informal;
		
		if (this.respeitoso) {
			this.comTitulo = false;
			this.informal = false;
		} else if (this.comTitulo) {
			this.respeitoso = false;
			this.informal = false;
			this.comTitulo = true;
		} else {
			this.respeitoso = false;
			this.comTitulo = false;
			this.informal = true;
		}

	}
	
	public String formatarNome (String nome, String sobrenome) {
		if (comTitulo) 
			return titulo + " " + nome + " " + sobrenome;
		else if (informal)
			return nome;
		else
			if (masculino)
				return "Sr." + " " + sobrenome;
			else
				return "Sra." + " " + sobrenome;
			
	}
	
	public String getTratamento () {
		return formatarNome(nome, sobrenome);
	
	}
		
	
}
