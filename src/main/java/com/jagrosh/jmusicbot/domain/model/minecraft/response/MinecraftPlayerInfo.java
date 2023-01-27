package com.jagrosh.jmusicbot.domain.model.minecraft.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MinecraftPlayerInfo {
    private Integer max;
    private Integer now;
}