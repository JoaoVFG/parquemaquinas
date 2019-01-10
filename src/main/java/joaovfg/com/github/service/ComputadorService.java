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
		return computadorRepository.buscaPorAtivo(ativo);
	}

	public Computador createComputador(Computador computador) {
		computador.setId(null);
		computador = computadorRepository.save(computador);
		return computador;
	}

	public void deletarComputador(Integer id) {
		findById(id);
		System.out.println("TESTE");
		computadorRepository.deleteById(id);

	}

	public Computador updatePessoa(Computador updateComputador) {
		Computador computador = findById(updateComputador.getId());
		
		computador.setAtivo(updateComputador.getAtivo());
		computador.setColaborador(updateComputador.getColaborador());
		computador.setFabricante(updateComputador.getFabricante());
		computador.setHd(updateComputador.getHd());
		computador.setIsRecepcao(updateComputador.getIsRecepcao());
		computador.setModelo(updateComputador.getModelo());
		computador.setOffice(updateComputador.getOffice());
		computador.setProcessador(updateComputador.getProcessador());
		computador.setRam(updateComputador.getRam());
		computador.setSetor(updateComputador.getSetor());
		computador.setSistemaOperacional(updateComputador.getSistemaOperacional());
		computador.setTipo(updateComputador.getTipo());
		computador.setUnidade(updateComputador.getUnidade());
		computador.setUsaAntiVirus(updateComputador.getUsaAntiVirus());
		computador.setUsaCardio(updateComputador.getUsaCardio());
		computador.setUsaPiramide(updateComputador.getUsaPiramide());
		computador.setUsaQlikView(updateComputador.getUsaQlikView());
		
		
		return computadorRepository.save(computador);
	}
}
