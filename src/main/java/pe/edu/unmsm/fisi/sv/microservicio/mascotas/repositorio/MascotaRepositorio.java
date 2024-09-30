package pe.edu.unmsm.fisi.sv.microservicio.mascotas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unmsm.fisi.sv.microservicio.mascotas.modelo.MascotaModelo;

public interface MascotaRepositorio extends JpaRepository<MascotaModelo, Long> {

}
