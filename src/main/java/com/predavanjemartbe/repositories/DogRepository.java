package com.predavanjemartbe.repositories;

import com.predavanjemartbe.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogRepository
        extends JpaRepository<Dog, Long> {

    List<Dog> findAllByName(String name);
}
