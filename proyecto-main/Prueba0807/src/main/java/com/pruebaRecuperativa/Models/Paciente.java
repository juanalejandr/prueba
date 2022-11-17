package com.pruebaRecuperativa.Models;



import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rut;
    private String nombre;
    private String fechaNacimiento;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CitaMedica> citaMedica;

    @Column(updatable = false)
    private Date createdAt;
    private Date updatedAt;



    //Constructores//


    public Paciente() {
        super();
    }

    public Paciente(Long id, String rut, String nombre, String fechaNacimiento, List<CitaMedica> citaMedica) {
        super();
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.citaMedica = citaMedica;
    }

    //Getters & Setters//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<CitaMedica> getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(List<CitaMedica> citaMedica) {
        this.citaMedica = citaMedica;
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
