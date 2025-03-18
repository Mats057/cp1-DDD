public class Veiculo {
	private String tipo;
	private String placa;
	private String modelo;

	public Veiculo(String tipo, String placa, String modelo) {
		this.tipo = tipo;
		this.placa = placa;
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}
}
