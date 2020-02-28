package com.secretaria.servicos;

import com.secretaria.dominios.PreMatricula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PreMatriculaRepository {

    private List<PreMatricula> preMatriculas = new ArrayList<PreMatricula>();

    public PreMatricula save(PreMatricula preMatricula) {
        preMatriculas.add(preMatricula);
        return preMatricula;
    }

    public List<PreMatricula> getAll(){
        return this.preMatriculas;
    }

    public PreMatricula findByIdCandidato(Integer id) {
         PreMatricula preMatriculas = this.preMatriculas.get(id);
        return preMatriculas;
    }

    public void update(Integer id , PreMatricula preMatricula) {
        this.preMatriculas.get(id).setAvaliado(preMatricula.getAvaliado());
    }
}
