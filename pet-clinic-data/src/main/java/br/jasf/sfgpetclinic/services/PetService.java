package br.jasf.sfgpetclinic.services;

import java.util.Set;

import br.jasf.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
