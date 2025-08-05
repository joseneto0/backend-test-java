package br.com.joseneto.treino.domain.entity;

import jakarta.persistence.*;

@Entity(name = "empresa")
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private long quantidadeVagasMotos;
    private long quantidadeVagasCarros;

    public Empresa(int id, String nome, String cnpj, String endereco, String telefone, long quantidadeVagasMotos, long quantidadeVagasCarros) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.quantidadeVagasMotos = quantidadeVagasMotos;
        this.quantidadeVagasCarros = quantidadeVagasCarros;
    }

    public Empresa() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getQuantidadeVagasMotos() {
        return quantidadeVagasMotos;
    }

    public void setQuantidadeVagasMotos(long quantidadeVagasMotos) {
        this.quantidadeVagasMotos = quantidadeVagasMotos;
    }

    public long getQuantidadeVagasCarros() {
        return quantidadeVagasCarros;
    }

    public void setQuantidadeVagasCarros(long quantidadeVagasCarros) {
        this.quantidadeVagasCarros = quantidadeVagasCarros;
    }
}
