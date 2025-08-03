package com.khan.springhibernateoracle.config;

import org.h2.tools.Server;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.sql.SQLException;

@Component
public class H2TcpServer {

    private Server tcpServer;

    @PostConstruct
    public void startTcpServer() throws SQLException {
        this.tcpServer = Server.createTcpServer(
                "-tcp", "-tcpAllowOthers", "-tcpPort", "8091"
        ).start();
        System.out.println("H2 TCP server started at: " + tcpServer.getURL());
    }

    @PreDestroy
    public void stopTcpServer() {
        if (tcpServer != null) {
            tcpServer.stop();
            System.out.println("H2 TCP server stopped.");
        }
    }
}

