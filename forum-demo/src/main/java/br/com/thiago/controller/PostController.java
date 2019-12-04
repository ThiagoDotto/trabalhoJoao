package br.com.thiago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiago.model.TipoVinho;
import br.com.thiago.model.Vinho;
import br.com.thiago.model.Vodcar;
import br.com.thiago.repository.BebidaRepository;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	private BebidaRepository bebidas;

	@GetMapping
	public Vodcar iniciar() {
		System.out.println("iniciando post");

		Vinho vinho = new Vinho();
		vinho.setNome("São Jorge");
		vinho.setId(1L);
		vinho.setIdade("10");
		vinho.setTipo(TipoVinho.BRANCO);
		
		Vodcar vodcar = new Vodcar();
		
		vodcar.setId(2L);
		vodcar.setQntDestilado(5);
		vodcar.setNome("Absolut");

		bebidas.save(vinho);
		

		return bebidas.save(vodcar);
	}
}
