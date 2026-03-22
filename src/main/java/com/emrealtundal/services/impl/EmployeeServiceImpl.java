package com.emrealtundal.services.impl;

import com.emrealtundal.dto.DtoDepartment;
import com.emrealtundal.dto.DtoEmployee;
import com.emrealtundal.entities.Employee;
import com.emrealtundal.repository.EmployeeRepository;
import com.emrealtundal.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {

        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();

        List<Employee> employeeList = employeeRepository.findAll();
        if(employeeList != null && !employeeList.isEmpty()){
            for (Employee employee : employeeList){
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee);

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                        employee.getDepartment().getDepartmentName()));

                dtoEmployeeList.add(dtoEmployee);
            }
        }

        return dtoEmployeeList;
    }
}
