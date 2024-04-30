package com.marat.spring.dao;

import com.marat.spring.models.Person;

import java.util.ArrayList;
import java.util.List;

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
        return peoplesList.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}