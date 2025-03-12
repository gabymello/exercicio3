
package projetocriativo;


public class ProjetoCriativo {

    public static void main(String[] args) {
    
        Filme filme = new Filme("4 vidas de um cachorro", "10/006/2021", 500000.00, 120);
        System.out.println("Projeto: " + filme.getTitulo());
        System.out.println("Data Início: " + filme.getDataInicio());
        System.out.println("Orçamento: R$" + filme.getOrcamento());
        System.out.println("Prazo estimado para o filme: " + filme.calcularPrazo() + " dias");

        // Criando uma música
        Musica musica = new Musica("Rei leao", "15/07/2020", 10000.00, 300);
        System.out.println("\nProjeto: " + musica.getTitulo());
        System.out.println("Data Início: " + musica.getDataInicio());
        System.out.println("Orçamento: R$" + musica.getOrcamento());
        System.out.println("Prazo estimado para a música: " + musica.calcularPrazo() + " dias");
    }
}
  
   