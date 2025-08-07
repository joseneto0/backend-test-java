package br.com.joseneto.treino.controller;

import br.com.joseneto.treino.domain.entity.Empresa;
import br.com.joseneto.treino.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping(path = "/list", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Empresa>> findAllEmpresas() {
        List<Empresa> empresas = this.empresaService.getAllEmpresas();
        return ResponseEntity.status(HttpStatus.OK).body(empresas);
    }

    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Optional<Empresa>> findById(@PathVariable long id) {
        Optional<Empresa> empresa = this.empresaService.getEmpresa(id);
        return ResponseEntity.status(HttpStatus.OK).body(empresa);
    }

    @PostMapping(path = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> addEmpresa(@RequestBody Empresa empresa){
        long id = this.empresaService.addEmpresa(empresa);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    @PutMapping(path = "/update/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> updateEmpresa(@RequestBody Empresa empresa, @PathVariable long id) throws Exception {
        this.empresaService.updateEmpresa(id, empresa);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Long> deleteEmpresa(@PathVariable long id) throws Exception {
        this.empresaService.deleteEmpresa(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }
}
