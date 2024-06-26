package ru.nikita.spingapp.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.spingapp.FirstSecurityApp.models.Person;

import java.util.List;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Person findByUsername(String username);

    @Override
    List<Person> findAll();
}
