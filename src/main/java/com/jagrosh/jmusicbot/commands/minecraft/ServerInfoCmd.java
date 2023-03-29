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
import com.jagrosh.jmusicbot.commands.MinecraftCommand;
import com.jagrosh.jmusicbot.domain.model.info.ServerInfo;

/**
 *
 * @author John Grosh <john.a.grosh@gmail.com>
 */
public class ServerInfoCmd extends MinecraftCommand
{
    private final Bot bot;

    public ServerInfoCmd(Bot bot)
    {
        this.bot = bot;
        this.name = "server";
        this.help = "마인크래프트 서버 정보를 보여줍니다.";
        this.aliases = bot.getConfig().getAliases(this.name);
        this.guildOnly = false;
    }
    
    @Override
    protected void execute(CommandEvent event)
    {
        event.reply(ServerInfo.getServerInfo());
    }
}
