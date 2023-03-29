package com.jagrosh.jmusicbot;

import com.jagrosh.jmusicbot.domain.model.minecraft.response.MinecraftServerStatusApiResponse;
import com.jagrosh.jmusicbot.infra.client.MinecraftServerApiClient;
import org.junit.Test;

public class MinecraftApiClientTest {
    private static final MinecraftServerApiClient apiClient = new MinecraftServerApiClient();

    @Test
    public void getStatus() {
        MinecraftServerStatusApiResponse serverStatus = apiClient.getServerStatus();
        System.out.println("serverStatus = " + serverStatus);
    }
}
