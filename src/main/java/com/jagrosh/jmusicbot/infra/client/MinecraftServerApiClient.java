package com.jagrosh.jmusicbot.infra.client;

import com.jagrosh.jmusicbot.domain.model.minecraft.response.MinecraftServerStatusApiResponse;

public class MinecraftServerApiClient {
    private static final CommonApiClient apiClient = new CommonApiClient();
    private static final String requestUrl = "https://mcapi.us/server/status?ip=182.220.91.17&port=25566";

    public MinecraftServerStatusApiResponse getServerStatus() {
        return apiClient.get(requestUrl, MinecraftServerStatusApiResponse.class);
    }
}
