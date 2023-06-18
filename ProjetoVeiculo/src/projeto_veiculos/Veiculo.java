package projeto_veiculos;

public class Veiculo {

		private String marca, modelo, cor, tipocomb;
		private double potencia;
		private int ano;


		public Veiculo(String marca, String modelo, String cor, String tipocomb, double potencia, int ano) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
			this.setTipocomb(tipocomb);
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

		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}

		public void settipocomb(String tipocomb) {
			this.setTipocomb(tipocomb);
		}
		

		public void settipotencia(double potencia) {
			this.potencia = potencia;
		}
		
		public double gettipotencia() {
			return potencia;
		}

		public String getTipocomb() {
			return tipocomb;
		}

		public void setTipocomb(String tipocomb) {
			this.tipocomb = tipocomb;
		}
	}

	
