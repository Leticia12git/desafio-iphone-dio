package com.leticia;

public class Iphone implements MusicPlayer, Phone, WebBrowser {
    @Override
    public void play() {
        System.out.println("Playing music on the iPhone.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on the iPhone.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on the iPhone.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Making a call to " + number + " on the iPhone.");
    }

    @Override
    public void receiveCall(String caller) {
        System.out.println("Receiving a call from " + caller + " on the iPhone.");
    }

    @Override
    public void browse(String url) {
        System.out.println("Browsing the web on " + url + " using the iPhone.");
    }

    @Override
    public void addBookmark(String url) {
        System.out.println("Adding " + url + " to bookmarks on the iPhone.");
    }
}
