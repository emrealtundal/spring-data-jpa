package com.emrealtundal.services;

import com.emrealtundal.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
