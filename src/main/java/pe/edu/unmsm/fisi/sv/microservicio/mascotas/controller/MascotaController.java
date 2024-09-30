package pe.edu.unmsm.fisi.sv.microservicio.mascotas.controller;

import pe.edu.unmsm.fisi.sv.microservicio.mascotas.modelo.MascotaModelo;
import pe.edu.unmsm.fisi.sv.microservicio.mascotas.service.MascotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public List<MascotaModelo> listarMascotas() {
        return mascotaService.listarMascotas();
    }

    @GetMapping("/{id}")
    public MascotaModelo obtenerMascotaPorId(@PathVariable Long id) {
        return mascotaService.obtenerMascotaPorId(id);
    }

    @PostMapping
    public MascotaModelo guardarMascota(@RequestBody MascotaModelo mascota) {
        return mascotaService.guardarMascota(mascota);
    }

    @DeleteMapping("/{id}")
    public void eliminarMascota(@PathVariable Long id) {
        mascotaService.eliminarMascota(id);
    }
    @PostMapping("/batch")
    public List<MascotaModelo> guardarMascotas(@RequestBody List<MascotaModelo> mascotas) {
        return mascotaService.guardarMascotas(mascotas);
    }
}
