package pe.edu.unmsm.fisi.sv.microservicio.mascotas.service;

import pe.edu.unmsm.fisi.sv.microservicio.mascotas.modelo.MascotaModelo;
import pe.edu.unmsm.fisi.sv.microservicio.mascotas.repositorio.MascotaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {
    private final MascotaRepositorio mascotaRepositorio;

    @Autowired
    public MascotaService(MascotaRepositorio mascotaRepositorio){
        this.mascotaRepositorio = mascotaRepositorio;
    }

    public List<MascotaModelo> listarMascotas() {
        return mascotaRepositorio.findAll();
    }

    public MascotaModelo obtenerMascotaPorId(Long id) {
        return mascotaRepositorio.findById(id).orElse(null);
    }

    public MascotaModelo guardarMascota(MascotaModelo mascota) {
        return mascotaRepositorio.save(mascota);
    }

    public void eliminarMascota(Long id) {
        mascotaRepositorio.deleteById(id);
    }
    public List<MascotaModelo> guardarMascotas(List<MascotaModelo> mascotas) {
        return mascotaRepositorio.saveAll(mascotas);
    }
}
