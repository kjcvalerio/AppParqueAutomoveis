package parque_de_estacionamento;

import java.util.Scanner;

public class Parque_de_Estacionamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDuplamenteLigada listaCarros = new ListaDuplamenteLigada();

        int opcao = 0;

        do {
            listaCarros.Menu();
            System.out.println("Selecione umas das opções...");
            opcao = sc.nextInt();

            switch (opcao) {
                
                case 1: {
                    System.out.println("Introduza o nome do propreitário do carro:");
                    String nome_do_proprietário = sc.next();
                    System.out.println("Introduza a cor do carro:");
                    String cor = sc.next();
                    System.out.println("Introduza a matrícula do carro:");
                    String matricula = sc.next();

                    Carro obj = new Carro(nome_do_proprietário, cor, matricula);

                    listaCarros.AdicionarNoInicio(obj);
                    System.out.println("      Operação concluida com sucesso!       ");
                    break;
                }
                
                case 2: {
                    System.out.println("Introduza o nome do propreitário do carro:");
                    String nome_do_proprietário = sc.next();
                    System.out.println("Introduza a cor do carro:");
                    String cor = sc.next();
                    System.out.println("Introduza a matrícula do carro:");
                    String matricula = sc.next();

                    Carro obj = new Carro(nome_do_proprietário, cor, matricula);

                    listaCarros.AdicionarNoFim(obj);
                    System.out.println("      Operação concluida com sucesso!       ");
                    break;
                }
                
                case 3: {
                    System.out.println("Introduza o nome do propreitário do carro:");
                    String nome_do_proprietário = sc.next();
                    System.out.println("Introduza a cor do carro:");
                    String cor = sc.next();
                    System.out.println("Introduza a matrícula do carro:");
                    String matricula = sc.next();

                    Carro obj = new Carro(nome_do_proprietário, cor, matricula);

                    listaCarros.AdicionarNoMeio(1, obj);
                }
                
                case 4: {
                    listaCarros.RemoverNoInicio();
                    break;
                }

                case 5: {
                    listaCarros.RemoverNoFim();
                    break;
                }
                
                case 6: {
                    System.out.println("Introduza a posiçao que deseja eliminar, nota que a primeira posição é Zero");
                    int posicao = sc.nextInt();

                    listaCarros.RemoverIndex(posicao);
                    System.out.println("--------------------------         ATENÇÃO!       ----------------------------");
                    System.out.println(" 1) - O aluno foi removido com sucesso!");

                    if (listaCarros.tamanho == 0) {
                        System.out.println("2) - A sua lista agora encontrar-se vazia");
                    }
                    break;
                }

                case 7: {
                    if (listaCarros.tamanho == 0) {
                        System.out.println("--------------------------         ATENÇÃO!       ----------------------------");
                        System.out.println(" 1) - Atualmente a lista encontra-se vazia!");
                    } else {

                        System.out.println(listaCarros.Listar());

                    }

                    break;
                }

                default:
                    System.out.println("\n ***   Volte sempre!   ***");
            }

        } while (opcao != 8);

        sc.close();

    }

}
