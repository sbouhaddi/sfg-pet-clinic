package sbouhaddi.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import sbouhaddi.springframework.sfgpetclinic.model.Speciality;


public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
