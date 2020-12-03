package org.kiparis;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    private static final String PORT = System.getenv("PORT");
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
//        try (ServerSocket serverSocket = new ServerSocket(Integer.valueOf(PORT))) {
//            while (true) {
//                Socket clientSocket = serverSocket.accept();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
