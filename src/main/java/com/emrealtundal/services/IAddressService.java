package com.emrealtundal.services;

import com.emrealtundal.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);

}
