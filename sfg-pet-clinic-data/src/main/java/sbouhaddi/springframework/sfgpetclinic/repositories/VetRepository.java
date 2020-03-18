package sbouhaddi.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import sbouhaddi.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
