package com.pruebaRecuperativa.Controllers;


import com.pruebaRecuperativa.Models.Paciente;
import com.pruebaRecuperativa.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    //primera pestaña de ingreso de datos para la tabla pacientes//
    @RequestMapping("")
    public String paciente(@ModelAttribute("paciente")Paciente paciente) {

        return "paciente.jsp";
    }

    @RequestMapping("/guardarPaciente")
    public String guardarPaciente(@ModelAttribute("paciente") Paciente paciente) {
        pacienteService.guardarRegistroPaciente(paciente);

        return "redirect:/citaMedica";
    }


}
