package br.com.joseneto.treino.service;

import br.com.joseneto.treino.domain.entity.Veiculos;
import br.com.joseneto.treino.domain.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculosService {

    @Autowired
    private VeiculosRepository veiculosRepository;

    public Optional<Veiculos> getVeiculo(Long id) {
        return this.veiculosRepository.findById(id);
    }

    public List<Veiculos> findAllVeiculos() {
        return this.veiculosRepository.findAll();
    }

    public Long updateVeiculo(Long id, Veiculos veiculo) throws Exception {
        Veiculos veiculoExistente = this.veiculosRepository
                .findById(id).orElseThrow(() -> new Exception("Veículo não encontrado"));

        veiculoExistente.setMarca(veiculo.getMarca());
        veiculoExistente.setModelo(veiculo.getModelo());
        veiculoExistente.setCor(veiculo.getCor());
        veiculoExistente.setPlaca(veiculo.getPlaca());
        veiculoExistente.setTipoVeiculo(veiculo.getTipoVeiculo());

        this.veiculosRepository.save(veiculoExistente);
        return veiculoExistente.getId();
    }

    public long createVeiculo(Veiculos veiculo) {
        this.veiculosRepository.save(veiculo);
        long idVeiculo = veiculo.getId();
        return idVeiculo;
    }

    public void deleteVeiculo(Long id) {
        this.veiculosRepository.deleteById(id);
    }
}
