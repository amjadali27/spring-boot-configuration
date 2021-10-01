package com.learning.controller;

import com.learning.bean.DbConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionController {

    @Autowired
    private DbConnection dbConnection;

    @RequestMapping("db-connection")
    public String getDbConnectionDetails(){
        return "URL: "+dbConnection.getConnectionUrl()+"----HOST: "+dbConnection.getHost()+"----PORT: "+dbConnection.getPort();
    }
}
