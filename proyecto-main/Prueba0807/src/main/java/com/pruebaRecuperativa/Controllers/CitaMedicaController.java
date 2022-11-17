package com.pruebaRecuperativa.Controllers;


import com.pruebaRecuperativa.Models.CitaMedica;
import com.pruebaRecuperativa.Models.Paciente;
import com.pruebaRecuperativa.Services.CitaMedicaService;
import com.pruebaRecuperativa.Services.PacienteService;
import com.pruebaRecuperativa.exception.ResourceNotFoundException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/citaMedica")
public class CitaMedicaController {

    @Autowired
    CitaMedicaService citaMedicaService;
    @Autowired
    PacienteService pacienteService;

    //pestaña de ingreso de datos de la cita médica//

    @RequestMapping("")
    public String citaMedica(@ModelAttribute("citaMedica") CitaMedica citaMedica, Model model) {
        List<Paciente> listaRegistroPaciente = pacienteService.buscarDatosPacientes();
        model.addAttribute("pacientesCapturados", listaRegistroPaciente);
        return "citaMedica.jsp" ;
    }

    @RequestMapping("/guardarCitaMedica")
    public String guardarCitaMedica(@ModelAttribute("citaMedica") CitaMedica citaMedica) {
        citaMedicaService.guardarRegistroCitaMedica(citaMedica);
        return "redirect:/mostrar";
    }

    @RequestMapping("/editarCitaMedica/{id}")
    public String editarCitaMedica(@PathVariable("id") Long idCitaMedica, Model model) {
        CitaMedica citaMedica = citaMedicaService.editarCitaMedica(idCitaMedica);
        model.addAttribute("citaMedica", citaMedica);

        return "editar.jsp";
    }

    @PostMapping("/actualizarCitaMedica/{id}")
    public String actualizarCitaMedica(@PathVariable("id") Long idCitaMedica, Model model,
                                       @ModelAttribute("citaMedica") CitaMedica citaMedica) {

        Paciente paciente;
        paciente = (Paciente) pacienteService.buscarDatosPacientes();
        citaMedica.setId(idCitaMedica);
        citaMedica.getPaciente().setId(paciente.getId());
        citaMedica.getPaciente().setNombre(paciente.getNombre());
        citaMedica.getPaciente().setRut(paciente.getRut());
        citaMedica.getPaciente().setFechaNacimiento(paciente.getFechaNacimiento());
        citaMedicaService.guardarRegistroCitaMedica(citaMedica);


        return "redirect:/mostrar";
    }
}
