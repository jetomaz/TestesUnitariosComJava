package br.ce.wcaquino.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;

public class LocacaoServiceTest {
	
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
