package com.pruebaRecuperativa.Controllers;


import com.pruebaRecuperativa.Models.CitaMedica;
import com.pruebaRecuperativa.Models.Paciente;
import com.pruebaRecuperativa.Services.CitaMedicaService;
import com.pruebaRecuperativa.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mostrar")
public class MostrarDatosController {

    @Autowired
    CitaMedicaService citaMedicaService;
    @Autowired
    PacienteService pacienteService;

    @RequestMapping("")
    public String mostrarRegistroPaciente(Model model){
        List<Paciente> listaRegistroPaciente = pacienteService.buscarDatosPacientes();
        model.addAttribute("pacientesCapturados", listaRegistroPaciente);
        List<CitaMedica> listaRegistroCitaMedica = citaMedicaService.buscarDatosCitaMedica();
        model.addAttribute("citasMedicasCapturadas", listaRegistroCitaMedica);

        return "mostrarRegistroPaciente.jsp";
    }

    @RequestMapping("/eliminarCita/{id}")
    public String eliminarCitaMedica(@PathVariable("id") Long idCitaMedica){
        citaMedicaService.eliminarCitaMedica(idCitaMedica);

        return "redirect:/mostrar";
    }



}
