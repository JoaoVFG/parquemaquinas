package joaovfg.com.github.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import joaovfg.com.github.entity.Computador;
import joaovfg.com.github.service.ComputadorService;

@RestController
@RequestMapping(value="/computador")
public class ComputadorResource {
	
	@Autowired
	ComputadorService computadorService;
	
	@RequestMapping(value = "/busca", method = RequestMethod.GET)
	public ResponseEntity<List<Computador>> findAll(){
		List<Computador> computadores = computadorService.findAll();
		return ResponseEntity.ok(computadores);
	}
	
	@RequestMapping(value = "/busca/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Computador> FindById(@PathVariable String id){
		Computador computador = computadorService.findById(Integer.parseInt(id));
		return ResponseEntity.ok(computador);
	}
	
	@RequestMapping(value = "/busca/ativo/{ativo}", method = RequestMethod.GET)
	public ResponseEntity<Computador> FindByAtivo(@PathVariable String ativo){
		Computador computador = computadorService.findByAtivo(Integer.parseInt(ativo));
		return ResponseEntity.ok(computador);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletaComputador(@PathVariable String id){
		
		System.out.println("Teste problema Id" + id);
		
		computadorService.deletarComputador(Integer.parseInt(id));
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/insere",method = RequestMethod.POST)
	public ResponseEntity<Computador> createComputador(@RequestBody Computador insereComputador){
		Computador computador = computadorService.createComputador(insereComputador);
		URI uri = URI.create("/computador" + "/busca/id/" + computador.getId());
		
		return ResponseEntity.created(uri).body(computador);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public ResponseEntity<Computador> updatePessoa(@RequestBody Computador updateComputador){
		Computador computador = computadorService.updatePessoa(updateComputador);
		return ResponseEntity.ok(computador);
	}
}
