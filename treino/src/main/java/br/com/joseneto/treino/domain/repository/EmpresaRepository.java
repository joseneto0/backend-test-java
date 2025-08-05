package br.com.joseneto.treino.domain.repository;

import br.com.joseneto.treino.domain.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
}
