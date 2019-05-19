/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.composite;

/**
 *
 * Compor objetos em estruturas de árvore para representar hierarquia
 * partes-todo Composite permite aos clientes tratarem de maneira uniforme
 * objetos individuais e composições de objetos
 *
 * @author Bruno B
 */
public class mainComposite {

    public static void main(String[] args) {
        // O usuário do código não precisa saber detalhes das implementações dos
        // objetos. Consegue manipular os objetos a partir da interface comum:
        // EstruturaComponente.
        EstruturaComponente minhaPasta = new Pasta("Minha Pasta/");
        EstruturaComponente meuVideo = new Arquivo("meu video.avi");
        EstruturaComponente meuOutroVideo = new Arquivo("serieS01E01.mkv");

        try {
            // Como a interface define operações comuns a todos os arquivo é
            // possível tentar inserir um arquivo em um arquivo
            meuVideo.adicionar(meuOutroVideo);
        } catch (Exception e) {
            // No entanto você deve tratar este tipo de comportamento com
            // exceções ou outros métodos
            System.out.println(e.getMessage());
        }

        try {
            minhaPasta.adicionar(meuVideo);
            minhaPasta.adicionar(meuOutroVideo);
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            // Não será executado pois minha pasta é um Pasta e
            // possui todas as operações de gerenciamento dos arquivos
            // implementadas.
            System.out.println(e.getMessage());
        }

        try {
            // O problema dessa implementação é que o usuário do código precisa
            // sempre verificar se pode realizar as operações, pois não se tem
            // certeza sobre o tipo do objeto utilizado
            System.out.println("\nPesquisando arquivos:");
            minhaPasta.getArquivo(meuVideo.getNomeDoArquivo()).printNomeDoArquivo();
            System.out.println("\nRemover arquivos");
            minhaPasta.remover(meuVideo.getNomeDoArquivo());
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
