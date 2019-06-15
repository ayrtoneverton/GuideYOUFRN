package com.guideyoufrn.controller;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;


public class NotificationUtils {
    private static final String CHANNEL_ID = "com.guideyoufrn";
    private static final String CHANNEL_NAME = "GuideYOUFRN";

    public static void show(Context context){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            NotificationChannel channel = nm.getNotificationChannel(CHANNEL_ID);
            if (channel == null) {
                channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
                nm.createNotificationChannel(channel);
            }
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID);
        builder.setContentTitle("Análise e Projeto Orientado a Objetos irá começar");
        builder.setContentText("Sua aula de Análise e Projeto Orientado a Objetos começa em 15min. Para você chegar a tempo deve ir agora.");
        builder.setSmallIcon(android.R.drawable.sym_action_chat);

        Intent intent = new Intent(context, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context,0,intent,0);
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);

        Notification notification =  builder.build();
        NotificationManager nm =  (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        nm.notify(50, notification);
    }
}

