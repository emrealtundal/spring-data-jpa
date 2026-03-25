package com.emrealtundal.controller.impl;

import com.emrealtundal.configuration.DataSource;
import com.emrealtundal.configuration.GlobalProperties;
import com.emrealtundal.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/datasource")
    public DataSource getDataSource(){
        return null;
    }


    @GetMapping(value = "/getServers")
    public List<Server> getServers(){
        System.out.println("KEY BİLGİSİ : " + globalProperties.getKey());
        return globalProperties.getServers();
    }
}
