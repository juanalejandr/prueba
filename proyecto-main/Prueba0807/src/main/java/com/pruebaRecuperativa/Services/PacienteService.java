package com.pruebaRecuperativa.Services;

import com.pruebaRecuperativa.Models.Paciente;
import com.pruebaRecuperativa.Repositorys.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public void guardarRegistroPaciente(Paciente paciente) {pacienteRepository.save(paciente);
    }

    public List<Paciente> buscarDatosPacientes() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> conseguirDatosPaciente(Long idPaciente) { return pacienteRepository.findById(idPaciente); }
}
