package com.pruebaRecuperativa.Repositorys;

import com.pruebaRecuperativa.Models.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Long> {
}
