package parque_de_estacionamento;

public class ListaDuplamenteLigada {

    private No primeiro;
    private No ultimo;
    public int tamanho;

    public ListaDuplamenteLigada() {
        tamanho = 0;
    }

    public boolean estaVazio() {
        return this.primeiro == null;
    }

    public void AdicionarNoInicio(Carro carro) {
        No novoNo = new No(carro);
        novoNo.carro = carro;
        novoNo.anterior = null;
        novoNo.proximo = primeiro;

        if (estaVazio()) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.proximo = this.primeiro;
            this.primeiro.anterior = novoNo;
            this.primeiro = novoNo;
        }
        tamanho++;
    }

    public void AdicionarNoFim(Carro carro) {
        No novoNo = new No(carro);
        novoNo.carro = carro;
        novoNo.anterior = ultimo;
        novoNo.proximo = null;

        if (estaVazio()) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            this.ultimo = novoNo;
        }
        this.tamanho++;
    }

    public void AdicionarNoMeio(int index, Carro carro) {
        if (index <= 0) {
            this.AdicionarNoInicio(carro);
        }
        if (index > tamanho) {
            this.AdicionarNoFim(carro);
        } else {
            No local = primeiro;
            for (int i = 0; i < index - 1; i++) {
                local = local.proximo;
            }
            No node = new No(carro);
            node.carro = carro;
            node.anterior = local;
            node.proximo = local.proximo;
            local.proximo = node;
            node.proximo.anterior = node;
            tamanho++;
        }
    }

    public Carro RemoverNoInicio() {
        if (estaVazio()) {
            System.out.println("Impossível remover, a lista está vazia!");
        }
        Carro carro = this.primeiro.carro;

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;
        }
        tamanho--;
        return carro;
    }

    public Carro RemoverNoFim() {
        if (estaVazio()) {
            System.out.println("Impossível remover, a lista está vazia!");
        }
        Carro carro = this.ultimo.carro;

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {

            this.ultimo = ultimo.proximo;
            ultimo.anterior = ultimo;
            this.ultimo = null;

        }
        tamanho--;
        return carro;
    }

    public Carro RemoverIndex(int index) {
        if (index < 0 || index >= tamanho || primeiro == null) {
            return null;
        } else if (index == 0) {
            return RemoverNoInicio();
        } else if (index == tamanho - 1) {
            return RemoverNoFim();
        }
        No local = primeiro;
        for (int i = 0; i < tamanho; i++) {
            local = local.proximo;
        }
        if (local.anterior != null) {
            local.anterior.proximo = local.proximo;
        }
        if (local.proximo != null) {
            local.proximo.anterior = local.anterior;
        }
        tamanho--;

        return local.carro;
    }

    public String Listar() {

        String str = "(" + "Tamanho da Lista: " + tamanho + "):    \n\n";
        No local = primeiro;

        for (int i = 0; i < tamanho; i++) {

            str += " \n | NOME DO PROPRIETÁRIO DO CARRO:" + local.carro.nome_do_proprietário + "";
            str += " \n | A COR DO CARRO:" + local.carro.cor + "";
            str += " \n | A MATRÍCULA DO CARRO:" + local.carro.matricula + "";
            local = local.proximo;

            System.out.println("\n");
        }
        return str;
    }

    public void Menu() {
        System.out.println("(1) - ADICIONAR CARRO NO INÍCIO.");
        System.out.println("(2) - ADICIONAR CARRO NO FIM.");
        System.out.println("(3) - ADICIONAR CARRO NA POSIÇÃO DESEJADA.");
        System.out.println("(4) - REMOVER NO INÍCIO.");
        System.out.println("(5) - REMOVER NO FIM.");
        System.out.println("(6) - REMOVER EM POSIÇÃO DESEJADA.");
        System.out.println("(7) - LISTAR.");

    }

}
