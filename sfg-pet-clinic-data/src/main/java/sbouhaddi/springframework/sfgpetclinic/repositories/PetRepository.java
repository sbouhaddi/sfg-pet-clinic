package sbouhaddi.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import sbouhaddi.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
