package com.emrealtundal.controller;

import com.emrealtundal.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
