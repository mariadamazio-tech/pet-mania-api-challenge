package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import com.dt2.petmania.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pets")

public class PetController {

    private final PetService service;

    public PetController(PetRepository repository, PetService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pet> mostrarAnimal() {

        return service.mostrarPet();
    }

    @PostMapping
    public void cadastrarAnimal(@RequestBody Pet pet) {
        service.cadastrarPet(pet);
    }
}
//CRIE O DELETE



