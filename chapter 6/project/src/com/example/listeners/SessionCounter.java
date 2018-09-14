package com.example.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Dmitrii on 14.09.2018.
 */
public class SessionCounter implements HttpSessionListener {
    static private int activeSessions;
    public static int getActiveSessions() {
        return activeSessions;
    }
    public void sessionCreated(HttpSessionEvent event) {
        activeSessions++;
        printActiveSessions();
    }
    public void sessionDestroyed(HttpSessionEvent event) {
        activeSessions--;
        printActiveSessions();
    }

    private void printActiveSessions() {
        System.out.println("Active sessions: " + activeSessions);
    }
}