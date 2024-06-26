package ru.nikita.spingapp.FirstSecurityApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.spingapp.FirstSecurityApp.models.Seance;

import java.util.List;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Integer> {


    @Override
    List<Seance> findAll();

}
