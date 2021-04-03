package coolprogrammer.petclinicapp.service;

import coolprogrammer.petclinicapp.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet Vet);
}
