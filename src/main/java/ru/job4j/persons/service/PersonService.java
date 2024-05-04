package ru.job4j.persons.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.persons.model.Person;
import ru.job4j.persons.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;


    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    public Optional<Person> findById(int id) {
        return this.personRepository.findById(id);
    }

    public Person create(Person person) {
       return this.personRepository.save(person);
    }

    public void update(Person person) {
        this.personRepository.save(person);
    }

    public void delete(Person person) {
        this.personRepository.delete(person);
    }
}
