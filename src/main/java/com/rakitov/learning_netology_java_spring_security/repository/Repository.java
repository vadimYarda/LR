package com.rakitov.learning_netology_java_spring_security.repository;

import com.rakitov.learning_netology_java_spring_security.entity.Person;
import com.rakitov.learning_netology_java_spring_security.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Stanislav Rakitov
 */
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, PersonId> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
