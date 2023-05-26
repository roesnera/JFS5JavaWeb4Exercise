package org.skillgrowth.studentsapplication.data;

import org.skillgrowth.studentsapplication.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository
        extends JpaRepository<Student, Integer>
{

    Student findById( int id );

}