/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.composite;

/**
 *
 * @author Bruno B
 */

// Classe componente
public abstract class EstruturaComponente {

	String nomeDoArquivo;

	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
	}

	public String getNomeDoArquivo() {
		return this.nomeDoArquivo;
	}

	public void adicionar(EstruturaComponente novoArquivo) throws Exception {
		throw new Exception("Não pode inserir arquivos em: "
				+ this.nomeDoArquivo + " - Não é uma pasta");
	}

	public void remover(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode remover arquivos em: "
				+ this.nomeDoArquivo + " -Não é uma pasta");
	}

	public EstruturaComponente getArquivo(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode pesquisar arquivos em: "
				+ this.nomeDoArquivo + " - Não é uma pasta");
	}
}