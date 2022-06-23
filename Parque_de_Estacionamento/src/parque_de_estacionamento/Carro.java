
package parque_de_estacionamento;

public class Carro {
    
    
    String nome_do_proprietário;
    String cor;
    String matricula;

    public String getNome_do_proprietário() {
        return nome_do_proprietário;
    }

    public void setNome_do_proprietário(String nome_do_proprietário) {
        this.nome_do_proprietário = nome_do_proprietário;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Carro(String nome_do_proprietário, String cor, String matricula) {
        this.nome_do_proprietário = nome_do_proprietário;
        this.cor = cor;
        this.matricula = matricula;
    }

   

}
