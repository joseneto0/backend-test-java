package br.com.joseneto.treino.controller;

import br.com.joseneto.treino.domain.entity.Veiculos;
import br.com.joseneto.treino.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosService veiculosService;

    @GetMapping(path = "/list", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Veiculos>> findAll() {
        List<Veiculos> veiculos = veiculosService.findAllVeiculos();
        return ResponseEntity.status(HttpStatus.OK).body(veiculos);
    }

    @GetMapping(path = "/get/{id}", produces =  {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Optional<Veiculos>> findById(@PathVariable Long id) {
        Optional<Veiculos> veiculo = this.veiculosService.getVeiculo(id);
        return ResponseEntity.status(HttpStatus.OK).body(veiculo);
    }

    @PostMapping(path = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> save(@RequestBody Veiculos veiculo) {
        long idVeiculo = this.veiculosService.createVeiculo(veiculo);
        return ResponseEntity.status(HttpStatus.OK).body(idVeiculo);
    }

    @PutMapping(path = "/update/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> update(@PathVariable Long id, @RequestBody Veiculos veiculo) throws Exception {
        long newId = this.veiculosService.updateVeiculo(id, veiculo);
        return ResponseEntity.status(HttpStatus.OK).body(newId);
    }

    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        this.veiculosService.deleteVeiculo(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }
}
