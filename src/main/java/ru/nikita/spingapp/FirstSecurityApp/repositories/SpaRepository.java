package ru.nikita.spingapp.FirstSecurityApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.spingapp.FirstSecurityApp.models.Spa;

import java.util.List;

@Repository
public interface SpaRepository extends JpaRepository<Spa,Integer> {
    @Override
    List<Spa> findAll();
}
