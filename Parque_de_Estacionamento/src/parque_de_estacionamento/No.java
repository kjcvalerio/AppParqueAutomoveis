package parque_de_estacionamento;

public class No {

    Carro carro;
    No proximo;
    No anterior;

    public No(Carro carro) {
        this.carro = carro;
        this.proximo = null;
        this.anterior = null;
    }
}
