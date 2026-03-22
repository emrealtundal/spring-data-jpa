package com.emrealtundal.controller;


import com.emrealtundal.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployees();
}
