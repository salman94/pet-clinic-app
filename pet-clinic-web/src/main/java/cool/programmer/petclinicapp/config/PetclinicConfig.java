package cool.programmer.petclinicapp.config;

import cool.programmer.petclinicapp.services.OwnerService;
import cool.programmer.petclinicapp.services.PetService;
import cool.programmer.petclinicapp.services.VetService;
import cool.programmer.petclinicapp.services.map.OwnerServiceMap;
import cool.programmer.petclinicapp.services.map.PetServiceMap;
import cool.programmer.petclinicapp.services.map.VetServiceMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetclinicConfig {
    @Bean
    OwnerService ownerService(){
        return new OwnerServiceMap();
    }

    @Bean
    VetService vetService(){
        return new VetServiceMap();
    }

    @Bean
    PetService petService(){
        return new PetServiceMap();
    }
}
