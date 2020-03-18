package sbouhaddi.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import sbouhaddi.springframework.sfgpetclinic.model.PetType;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
