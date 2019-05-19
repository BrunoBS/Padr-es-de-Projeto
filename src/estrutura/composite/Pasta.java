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

import java.util.ArrayList;

public class Pasta extends EstruturaComponente {

	ArrayList<EstruturaComponente> arquivos = new ArrayList<EstruturaComponente>();

	public Pasta(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
		for (EstruturaComponente arquivoTmp : arquivos) {
			arquivoTmp.printNomeDoArquivo();
		}
	}

	@Override
	public void adicionar(EstruturaComponente novoArquivo) {
		this.arquivos.add(novoArquivo);
	}

	@Override
	public void remover(String nomeDoArquivo) throws Exception {
		for (EstruturaComponente arquivoTmp : arquivos) {
			if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
				this.arquivos.remove(arquivoTmp);
				return;
			}
		}
		throw new Exception("Não existe este arquivo");
	}

	@Override
	public EstruturaComponente getArquivo(String nomeDoArquivo) throws Exception {
		for (EstruturaComponente arquivoTmp : arquivos) {
			if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
				return arquivoTmp;
			}
		}
		throw new Exception("Não existe este arquivo");
	}

}