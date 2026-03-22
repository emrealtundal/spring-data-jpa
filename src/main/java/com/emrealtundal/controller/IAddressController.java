package com.emrealtundal.controller;

import com.emrealtundal.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);
}
