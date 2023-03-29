package com.jagrosh.jmusicbot.domain.model.minecraft.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MinecraftServerStatusApiResponse {
    private String status;
    private Boolean online;
    private String motd;
    private MinecraftPlayerInfo players;
    private MinecraftServerInfo server;
}
