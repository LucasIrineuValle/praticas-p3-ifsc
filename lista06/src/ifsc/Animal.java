package ifsc;

public class Animal {

	
		private String Nome;
		private String Raca;
		
		
		private Float Comprimento;
		private Integer Nmdppat;
		private String Cor;
		private String Ecossistema;

	public void Caminha() {
		
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
	}

	public Float getComprimento() {
		return Comprimento;
	}

	public void setComprimento(Float comprimento) {
		Comprimento = comprimento;
	}

	public Integer getNmdppat() {
		return Nmdppat;
	}

	public void setNmdppat(Integer nmdppat) {
		Nmdppat = nmdppat;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getEcossistema() {
		return Ecossistema;
	}

	public void setEcossistema(String ecossistema) {
		Ecossistema = ecossistema;
	}
	
	public void caminha() {
		System.out.println("Ele caminha");
	}

}

