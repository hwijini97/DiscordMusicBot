package com.jagrosh.jmusicbot;

import com.jagrosh.jmusicbot.domain.model.info.ServerInfo;
import org.junit.Test;

public class ServerInfoTest {

    @Test
    public void printServerInfo() {
        System.out.println(ServerInfo.getServerInfo());
    }
}
