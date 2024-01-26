package com.springtutorial.learnspringframework.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame=new MarioGame();
        var gameRunner=new  GameRunner(marioGame);
        gameRunner.run();
    }

    @SpringBootApplication
    public static class LearnSpringFrameworkApplication {

        public static void main(String[] args) {
            SpringApplication.run(LearnSpringFrameworkApplication.class, args);
        }

    }
}
