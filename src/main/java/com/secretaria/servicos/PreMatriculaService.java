package com.secretaria.servicos;

import com.secretaria.dominios.PreMatricula;
import org.springframework.stereotype.Service;
import sun.font.TrueTypeFont;

@Service
public class PreMatriculaService {

    private PreMatriculaRepository preMatriculaRepository;

    public PreMatriculaService(PreMatriculaRepository preMatriculaRepository) {
        this.preMatriculaRepository = preMatriculaRepository;
    }

    public Object all() {
        return this.preMatriculaRepository.getAll();
    }

    public PreMatricula alterStatus(Integer id) {
        PreMatricula preMatricula = this.preMatriculaRepository.findByIdCandidato(id);
        preMatricula.setAvaliado(Boolean.TRUE);
        preMatriculaRepository.update(id,preMatricula);

        return preMatricula;
    }
}
