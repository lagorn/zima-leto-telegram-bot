package com.example.myfirstapp;

import com.example.myfirstapp.telegram.MyAmazingBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class MyFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstAppApplication.class, args);

		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new MyAmazingBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
