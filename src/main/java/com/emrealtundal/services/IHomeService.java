package com.emrealtundal.services;

import com.emrealtundal.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);

}
