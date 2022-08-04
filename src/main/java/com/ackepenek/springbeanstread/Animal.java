package com.ackepenek.springbeanstread;


public class Animal {
    int speakCount = 0;
    void speakCounter() {
        this.speakCount++;
    }
    public int getSpeakCount() {
        return this.speakCount;
    }
}
