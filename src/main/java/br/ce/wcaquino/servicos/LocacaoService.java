package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}

	@Test
	public void teste(){
		//cenario - Inicializamos os objetos e variaveis necessarios para criar o cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Eduardo");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		
		//acao - realizamos a acao - funcionalidade que queremos testar
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verificação - verificamos os resultados retornados
		Assert.assertTrue(locacao.getValor() == 5.0);
		
		
		
	}
}