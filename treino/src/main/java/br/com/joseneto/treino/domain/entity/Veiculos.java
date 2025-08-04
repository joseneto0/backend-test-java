package br.com.joseneto.treino.domain.entity;

import jakarta.persistence.*;

@Entity(name = "veiculos")
@Table(name = "veiculos")
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int tipoVeiculo;

    public Veiculos(long id, String marca, String modelo, String cor, String placa, int tipoVeiculo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
    }

    public Veiculos() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(int tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                '}';
    }
}

