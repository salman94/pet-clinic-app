package petclinicapp.model.service;

import petclinicapp.model.Vet;

import java.util.Set;

public interface PetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet Vet);
}
