package projeto_veiculos;

public class Caminhao extends Veiculo {
    

	public Caminhao(String marca, String modelo, String cor, String tipoCombustivel, int ano, double potencia) {
        super(marca, modelo, cor, tipoCombustivel, ano, (int) potencia);
      
    }

  
	
	public void frear() {
		// TODO Auto-generated method stub
		
	}
	
	void ligar()
	{
	System.out.println("O carro está ligado!");
	}
	
	
	public void desligar()
	{
	System.out.println("O carro está desligado!");
	}



	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	
	
}

