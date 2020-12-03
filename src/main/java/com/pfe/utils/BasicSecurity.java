package com.pfe.utils;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BasicSecurity {

    @Autowired
    private Environment env;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);

    public void register(String nonHashedPassword){
        encoder.encode(nonHashedPassword);
    }

}
