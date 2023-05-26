package org.skillgrowth.studentsapplication.service;


import org.skillgrowth.studentsapplication.data.StudentRepository;
import org.skillgrowth.studentsapplication.data.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{

    private final StudentRepository studentsRepository;

    public StudentService( StudentRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }


    public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }


    public Student get( int studentId )
    {
        return studentsRepository.findById( studentId );
    }


    public void save( Student student )
    {
        studentsRepository.save( student );
    }


    public void delete( int studentId )
    {
        studentsRepository.deleteById( studentId );
    }
}