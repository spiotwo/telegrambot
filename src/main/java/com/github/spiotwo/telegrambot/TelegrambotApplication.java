package com.github.spiotwo.telegrambot;

import com.github.spiotwo.telegrambot.bot.testbot2606bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class TelegrambotApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TelegrambotApplication.class, args);
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new testbot2606bot.testbot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
