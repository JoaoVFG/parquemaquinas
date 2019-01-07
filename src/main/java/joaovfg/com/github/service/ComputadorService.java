package joaovfg.com.github.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import joaovfg.com.github.entity.Computador;
import joaovfg.com.github.repositories.ComputadorRepository;

@Service
public class ComputadorService {
	
	@Autowired
	ComputadorRepository computadorRepository;
	
	public Computador findById(Integer id) {
		return computadorRepository.buscaPorId(id);
	}
	
	public List<Computador> findAll() {
		return computadorRepository.findAll();
	}
	
	public Computador findByAtivo(Integer ativo) {
		return computadorRepository.findByativo(ativo);
	}
	
	public Computador createComputador(Computador computador) {
		computador.setId(null);
		computador = computadorRepository.save(computador);
		return computador;
	}
	
	public void deletarPessoa(Integer id) throws Exception {
		findById(id);
		try {
			computadorRepository.deleteById(id);
		} catch (Exception e) {
			throw new Exception("NAO E POSSIVEL EXCLUIR ESSA PESSOA.");
		}
	}
}
