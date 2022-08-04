package com.ackepenek.springbeanstread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class Runners {
    @Component
    static class Runner1 {
        @Autowired
        Animal animal;

        @Scheduled(fixedDelay = 1000)
        void count() {
            this.animal.speakCounter();
            System.out.println("Runner1 - " + this.animal.getSpeakCount());
        }
    }
    @Component
    static class Runner2 {
        @Autowired
        Animal animal;

        @Scheduled(fixedDelay = 500)
        void count() {
            this.animal.speakCounter();
            System.out.println("Runner2 - " + this.animal.getSpeakCount());
        }
    }
}
