/*
 * Copyright 2017 John Grosh <john.a.grosh@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jagrosh.jmusicbot.commands.minecraft;

import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jmusicbot.Bot;
import com.jagrosh.jmusicbot.commands.OwnerCommand;
import com.jagrosh.jmusicbot.domain.model.minecraft.response.MinecraftServerStatusApiResponse;
import com.jagrosh.jmusicbot.infra.client.MinecraftServerApiClient;

import java.util.Objects;

/**
 *
 * @author John Grosh <john.a.grosh@gmail.com>
 */
public class OnlineCmd extends OwnerCommand
{
    private final Bot bot;
    private final MinecraftServerApiClient minecraftServerApiClient;

    public OnlineCmd(Bot bot)
    {
        this.bot = bot;
        this.name = "online";
        this.help = "현재 서버 접속자 수를 보여줍니다.";
        this.aliases = bot.getConfig().getAliases(this.name);
        this.guildOnly = false;
        this.minecraftServerApiClient = new MinecraftServerApiClient();
    }
    
    @Override
    protected void execute(CommandEvent event)
    {
        MinecraftServerStatusApiResponse serverStatus = minecraftServerApiClient.getServerStatus();

        if (Objects.equals(serverStatus.getPlayers().getNow(), 0)) {
            event.reply("현재 접속 중인 사람이 없어요 ㅠㅠ 먼저 들어가보시는 건 어때요?");
        } else if (serverStatus.getPlayers().getNow() > 0) {
            event.reply(String.format("현재 %d명이 접속중이에요! 같이 게임 하실래요?", serverStatus.getPlayers().getNow()));
        }
    }
}
