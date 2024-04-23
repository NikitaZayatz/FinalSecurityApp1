package ru.nikita.spingapp.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.spingapp.FirstSecurityApp.models.Attraction;


@Repository
public interface AttractionRepository extends JpaRepository<Attraction,Integer> {
}
