package com.secretaria.controladores;

import com.secretaria.dominios.Candidato;
import com.secretaria.servicos.MatriculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    private MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    public ResponseEntity receberMatricula(@RequestBody Candidato candidato) {
        matriculaService.cadastrarCandidato(candidato);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @GetMapping
    public  ResponseEntity retornarPreMatriculas() {
        return ResponseEntity.status(HttpStatus.OK).body(matriculaService.all());
    }



}
