package ru.nikita.spingapp.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.spingapp.FirstSecurityApp.models.Procedure;


@Repository
public interface ProcedureRepository extends JpaRepository<Procedure, Integer> {
}
