package com.marat.spring.dao;

import com.marat.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> peoplesList;
    {
        peoplesList = new ArrayList<>();

        peoplesList.add(new Person(++PEOPLE_COUNT, "Tom"));
        peoplesList.add(new Person(++PEOPLE_COUNT, "Bob"));
        peoplesList.add(new Person(++PEOPLE_COUNT, "John"));
        peoplesList.add(new Person(++PEOPLE_COUNT, "Mike"));
    }

    public List<Person> index() {
        return peoplesList;
    }

    public Person show(int id) {
        return peoplesList.stream().
                filter(person -> person.getId() == id).
                findAny().
                orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        peoplesList.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
