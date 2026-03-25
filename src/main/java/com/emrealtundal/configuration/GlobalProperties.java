package com.emrealtundal.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

// Component anotasyonuyla işaretlenen classların container içinde beani oluşur

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class GlobalProperties {

    private List<Server> servers;

    @Value(value = "${key}")
    private String key;

}
