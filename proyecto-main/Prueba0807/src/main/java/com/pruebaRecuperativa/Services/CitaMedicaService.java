package com.pruebaRecuperativa.Services;

import com.pruebaRecuperativa.Models.CitaMedica;
import com.pruebaRecuperativa.Repositorys.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaService {

    @Autowired
    CitaMedicaRepository citaMedicaRepository;

    public void guardarRegistroCitaMedica(CitaMedica citaMedica) {citaMedicaRepository.save(citaMedica);
    }

    public void eliminarCitaMedica(Long idCitaMedica) {
        citaMedicaRepository.deleteById(idCitaMedica);
    }

    public List<CitaMedica> buscarDatosCitaMedica() {
        return citaMedicaRepository.findAll();
    }

    public CitaMedica editarCitaMedica(Long idCitaMedica) {
        return citaMedicaRepository.findById(idCitaMedica).get();
    }

}
