package br.com.joseneto.treino.domain.repository;

import br.com.joseneto.treino.domain.entity.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculosRepository extends JpaRepository<Veiculos, Long> {
}
