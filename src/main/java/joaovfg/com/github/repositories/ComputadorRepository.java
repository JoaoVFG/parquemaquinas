package joaovfg.com.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import joaovfg.com.github.entity.Computador;

public interface ComputadorRepository extends JpaRepository<Computador, Integer>{
	
	@Transactional(readOnly = true)
	@Query("SELECT computador FROM Computador computador WHERE computador.id = :id")
	public Computador buscaPorId(@Param("id") Integer id);
	
	@Transactional(readOnly = true)
	@Query("SELECT computador FROM Computador computador WHERE computador.ativo = :ativo")
	public Computador buscaPorAtivo(@Param("ativo") Integer ativo);
	

}
