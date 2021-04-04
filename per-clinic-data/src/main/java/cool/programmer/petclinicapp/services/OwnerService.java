package cool.programmer.petclinicapp.services;
import cool.programmer.petclinicapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
