package com.nicholas.ioproject.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class IOClient {

    public static void main(String[] args) {

        new Thread(() -> {
            Socket socket = null;
            try {
                socket = new Socket("127.0.0.1",8000);
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true){
                try {
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write((new Date() + ": Hello ").getBytes());
                   Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
