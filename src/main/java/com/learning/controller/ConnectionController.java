package com.learning.controller;

import com.learning.bean.DbConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionController {

    @Autowired
    private DbConnection dbConnection;

    @Autowired
    private Environment env;

    @RequestMapping("db-connection")
    public String getDbConnectionDetails(){
        return "URL: "+dbConnection.getConnectionUrl()+"----HOST: "+dbConnection.getHost()+"----PORT: "+dbConnection.getPort();
    }

    @RequestMapping("/env-details")
    public String getEnvDetails(){
        return env.toString();
    }
}
