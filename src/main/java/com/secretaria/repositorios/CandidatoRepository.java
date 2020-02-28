package com.secretaria.repositorios;

import com.secretaria.dominios.Candidato;
import com.secretaria.dominios.PreMatricula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidatoRepository {

    private List<Candidato> candidatos = new ArrayList<Candidato>();

    public Candidato save(Candidato candidato) {
        candidatos.add(candidato);
        return candidato;
    }

    public  List<Candidato>   getAll(){

        return this.candidatos;
    }

}
