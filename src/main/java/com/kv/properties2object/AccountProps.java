package com.kv.properties2object;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties("kv.config")
public class AccountProps {
    private String user;
    private String passw;
}
