package com.pruebaRecuperativa.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas_medicas")
public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hora;
    private String areaMedica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(updatable = false)
    private Date createdAt;
    private Date updatedAt;

    //Constructores//

    public CitaMedica() {
        super();
    }

    public CitaMedica(Long id, String hora, String areaMedica, Paciente paciente) {
        this.id = id;
        this.hora = hora;
        this.areaMedica = areaMedica;
        this.paciente = paciente;
    }

    //Getters & Setters//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAreaMedica() {
        return areaMedica;
    }

    public void setAreaMedica(String areaMedica) {
        this.areaMedica = areaMedica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
