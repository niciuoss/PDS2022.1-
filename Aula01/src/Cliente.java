
public class Cliente {
	String nome;
	String senha;
	String numeroCart;
	String cpf;
	float limiteCreditoMax;
	float limiteCreditoAtual;
	
	public Cliente(String nome, String numeroCart, String senha, String cpf, float limite,
			 float limiteCreditoMax, float limiteCreditoAtual) {
		this.nome = nome;
		this.numeroCart = numeroCart;
		this.senha = senha;
		this.cpf = cpf;
		this.limiteCreditoMax = limiteCreditoMax;
		this.limiteCreditoAtual = limiteCreditoAtual;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCart() {
		return numeroCart;
	}

	public void setNumeroCart(String numeroCart) {
		this.numeroCart = numeroCart;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getLimiteCreditoMax() {
		return limiteCreditoMax;
	}

	public void setLimiteCreditoMax(float limiteCreditoMax) {
		this.limiteCreditoMax = limiteCreditoMax;
	}
	
	public float getLimiteCreditoAtual() {
		return limiteCreditoAtual;
	}
	
	public void setLimiteCreditoAtual(float limiteCreditoAtual) {
		this.limiteCreditoAtual = limiteCreditoAtual;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", numeroCart=" + numeroCart + ", senha=" + senha + ", cpf=" + cpf
				+ ", limite de credito atual=" + limiteCreditoAtual + "," + "limite de credito Maximo" + limiteCreditoMax + "]";
	}	
	
}
