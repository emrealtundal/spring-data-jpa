package com.emrealtundal.controller;

import com.emrealtundal.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);

    }
