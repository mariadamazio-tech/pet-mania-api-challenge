package com.dt2.petmania.service;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> mostrarPet(){
        List<Pet> petList = new ArrayList<>();
        petList = repository.findAll();
        return petList;
    }

    public void cadastrarPet(Pet animal){
        Pet pet =new Pet();
        pet.setNome(animal.getNome());
        pet.setEspecie(animal.getEspecie());
        pet.setRaca(animal.getRaca());
        pet.setIdade(animal.getIdade());
        pet.setSexo(animal.getSexo());
        pet.setPorte(animal.getPorte());
        pet.setPersonalidade(animal.getPersonalidade());
        pet.setFoto(animal.getFoto());
        pet.setDisponivel(animal.isDisponivel());
        repository.save(pet);

    }
}
