package ru.nikita.spingapp.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikita.spingapp.FirstSecurityApp.models.Communication;

import java.util.List;


@Repository
public interface CommunicationPepository extends JpaRepository<Communication, Integer> {

    @Override
    List<Communication> findAll();
}
