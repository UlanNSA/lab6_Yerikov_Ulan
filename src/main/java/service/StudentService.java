package service;

import database.Student;
import repository.StudentRepository;

import java.util.List;

public class StudentService implements StudentRepository {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }
}
