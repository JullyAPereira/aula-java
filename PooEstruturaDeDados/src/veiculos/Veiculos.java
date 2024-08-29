package veiculos;

public class Veiculos {
	private String marca;
	private String modelo;
	private int ano;
	private int potencia;
	private int eixos;
	private int carga;
	
	//constructor use fields
	
	public Veiculos(String marca, String modelo, int ano, int potencia, int eixos, int carga) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.potencia = potencia;
		this.eixos = eixos;
		this.carga = carga;
	}
	//generate toString
	@Override
	public String toString() {
		return "Veiculos [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", potencia=" + potencia
				+ ", eixos=" + eixos + ", carga=" + carga + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}

	
}
