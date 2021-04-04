package cool.programmer.petclinicapp.bootstrap;

import cool.programmer.petclinicapp.model.Owner;
import cool.programmer.petclinicapp.model.Vet;
import cool.programmer.petclinicapp.services.OwnerService;
import cool.programmer.petclinicapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michal");
        owner1.setLastName("Jordan");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("James");
        owner2.setLastName("Thompson");
        ownerService.save(owner2);

        System.out.println("Loading owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Steve");
        vet1.setLastName("Smith");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lisa");
        vet2.setLastName("Pray");
        vetService.save(vet2);

        System.out.println("Loading vets...");
    }
}
