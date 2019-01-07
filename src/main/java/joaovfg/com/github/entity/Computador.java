package joaovfg.com.github.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Computador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer ativo;
	
	private String tipo;
	
	private String isRecepcao;
	
	private String unidade;
	
	private String setor;
	
	private String colaborador;
	
	private String usaAntiVirus;
	
	private String usaCardio;
	
	private String usaPiramide;
	
	private String usaQlikView;
	
	private String fabricante;
	
	private String modelo;
	
	private String processador;
	
	private String ram;
	
	private String hd;
	
	private String sistemaOperacional;
	
	private String office;

	public Computador(Integer id, Integer ativo, String tipo, String isRecepcao, String unidade, String setor,
			String colaborador, String usaAntiVirus, String usaCardio, String usaPiramide, String usaQlikView,
			String fabricante, String modelo, String processador, String ram, String hd, String sistemaOperacional,
			String office) {
		super();
		this.id = id;
		this.ativo = ativo;
		this.tipo = tipo;
		this.isRecepcao = isRecepcao;
		this.unidade = unidade;
		this.setor = setor;
		this.colaborador = colaborador;
		this.usaAntiVirus = usaAntiVirus;
		this.usaCardio = usaCardio;
		this.usaPiramide = usaPiramide;
		this.usaQlikView = usaQlikView;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.processador = processador;
		this.ram = ram;
		this.hd = hd;
		this.sistemaOperacional = sistemaOperacional;
		this.office = office;
	}
	
	

}
