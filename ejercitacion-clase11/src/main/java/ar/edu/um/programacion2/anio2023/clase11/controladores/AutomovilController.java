package ar.edu.um.programacion2.anio2023.clase11.controladores;

import ar.edu.um.programacion2.anio2023.clase11.dto.InternoDTO;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Automovil;
import ar.edu.um.programacion2.anio2023.clase11.entidades.Chofer;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.AutomovilRepository;
import ar.edu.um.programacion2.anio2023.clase11.repositorios.ChoferRepository;
import ar.edu.um.programacion2.anio2023.clase11.servicios.AutomovilService;
import ar.edu.um.programacion2.anio2023.clase11.servicios.ChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/automovil/")
public class AutomovilController {
    @Autowired
    AutomovilService automovilService;
    @Autowired
    AutomovilRepository automovilRepository;

    @Autowired
    ChoferRepository choferRepository;

    @GetMapping
    public List<Automovil> getAll() {
        List<Automovil> automoviles = this.automovilService.getAll();
        return automoviles;
    }

    @GetMapping("/{id}")
    public Automovil getPorId(@PathVariable Long id) {
        Automovil automovil = this.automovilService.get(id);
        return automovil;
    }

    @PostMapping
    public Automovil post(@RequestBody Automovil automovil) {
        this.automovilService.add(automovil);
        return automovil;
    }

    @GetMapping("buscar/marca/{marca}")
    public List<Automovil> getPorMarca(@PathVariable String marca){
        List<Automovil> automoviles = this.automovilService.getPorMarca(marca);
        return automoviles;
    }

    @PostMapping("agregar/automovil/chofer")
    public Automovil agregarAutoAChofer(@RequestBody InternoDTO internoDTO){
        Optional<Chofer> chofer = this.choferRepository.findById(internoDTO.getIdChofer());
        Chofer ch = chofer.get();
        Automovil nuevo = internoDTO.getAutomovil();
        this.automovilRepository.save(nuevo);
        ch.getAutomoviles().add(nuevo);
        this.choferRepository.save(ch);
        return null;
    }
}
