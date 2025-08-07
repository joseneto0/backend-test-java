package br.com.joseneto.treino.service;

import br.com.joseneto.treino.domain.entity.Empresa;
import br.com.joseneto.treino.domain.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Optional<Empresa> getEmpresa(Long id) {
        return this.empresaRepository.findById(id);
    }

    public List<Empresa> getAllEmpresas() {
        return this.empresaRepository.findAll();
    }

    public long addEmpresa(Empresa empresa) {
        return this.empresaRepository.save(empresa).getId();
    }

    public long updateEmpresa(Long id, Empresa empresa) throws Exception {
        Empresa empresaAtual = this.empresaRepository.findById(id).orElseThrow(() -> new Exception("Empresa não encontrada"));

        empresaAtual.setNome(empresa.getNome());
        empresaAtual.setCnpj(empresa.getCnpj());
        empresaAtual.setTelefone(empresa.getTelefone());
        empresaAtual.setEndereco(empresa.getEndereco());
        empresaAtual.setQuantidadeVagasCarros(empresa.getQuantidadeVagasCarros());
        empresaAtual.setQuantidadeVagasMotos(empresa.getQuantidadeVagasMotos());
        this.empresaRepository.save(empresaAtual);

        return empresaAtual.getId();
    }

    public long deleteEmpresa(Long id) {
        this.empresaRepository.deleteById(id);
        return id;
    }
}
