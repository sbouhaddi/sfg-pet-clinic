package sbouhaddi.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import sbouhaddi.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
