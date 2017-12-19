package com.example.jp.simplesocket;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by JP on 12/19/2017.
 */

public class SocketClient extends AsyncTask<String,Void,Void>{
    Socket sckClient;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {
        String data = voids[0];
        try {
            sckClient = new Socket("192.168.2.11",1024);
            pw = new PrintWriter(sckClient.getOutputStream());
            pw.write(data);
            pw.flush();
            pw.close();
            sckClient.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}