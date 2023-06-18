package projeto_veiculos;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "amarok", "Preto", "Diesel", 2023, 40);
        Moto moto = new Moto("Kawasaki", "BEE4R22", "vermelho", "Gasolina", 2021, 80);
        Caminhao caminhao = new Caminhao("Scania", "MF62", "Branco", "Etanol", 2022, 35);

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Gasolina: " + (carro).getTipocomb());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Potencia: " + ((Veiculo) carro).gettipotencia());
        carro.ligar();
        carro.acelerar();
        carro.frear();
        
        System.out.println();

        System.out.println("Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Gasolina: " + moto.getTipocomb());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Potencia: " + moto.gettipotencia());
        moto.acelerar();
        moto.frear();
        System.out.println();

        System.out.println("Caminhão:");
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Gasolina: " + caminhao.getTipocomb());
        System.out.println("Ano: " + caminhao.getAno());
        System.out.println("Potencia: " + caminhao.gettipotencia());
        caminhao.acelerar();
        
    }
}