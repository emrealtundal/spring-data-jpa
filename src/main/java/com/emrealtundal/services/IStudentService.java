package com.emrealtundal.services;

import com.emrealtundal.dto.DtoStudent;
import com.emrealtundal.dto.DtoStudentIU;
import com.emrealtundal.entities.Student;

import java.util.List;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
