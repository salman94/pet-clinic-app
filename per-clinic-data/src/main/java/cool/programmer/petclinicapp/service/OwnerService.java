package cool.programmer.petclinicapp.service;
import cool.programmer.petclinicapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
