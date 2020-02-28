package com.secretaria.controladores;

import com.secretaria.dominios.Candidato;
import com.secretaria.dominios.PreMatricula;
import com.secretaria.servicos.MatriculaService;
import com.secretaria.servicos.PreMatriculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pre-matricula")
public class PreMatriculaController {

    private PreMatriculaService preMatriculaService;

    public PreMatriculaController(PreMatriculaService preMatriculaService) {
        this.preMatriculaService = preMatriculaService;
    }

    @GetMapping
    public  ResponseEntity retornarPreMatriculas(){
        return ResponseEntity.status(HttpStatus.OK).body(preMatriculaService.all());
    }

  @PostMapping
   public ResponseEntity receberPreMatricula(@RequestParam Integer id) {
       PreMatricula preMatricula =  this.preMatriculaService.alterStatus(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(preMatricula);
    }

}
