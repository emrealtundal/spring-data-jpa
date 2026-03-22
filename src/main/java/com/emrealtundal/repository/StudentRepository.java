package com.emrealtundal.repository;

import com.emrealtundal.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // HQL : hibernate query language. sınıfın ismi ve sınıftaki değişken isimleri kullanılır
    // SQL : standart query language. database içindeki tablo ismi ve değişken adları kullanılır. natvieQuery = true yaparak kullanılabilir
    @Query(value = "from Student", nativeQuery = false)
    List<Student> findAllStudents();

    @Query(value = "from Student s WHERE s.id= :studentId")
    Optional<Student> findStudentByID(Integer studentId);

}
