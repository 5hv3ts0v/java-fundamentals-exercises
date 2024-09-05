package com.bobocode.intro;

import java.util.Base64;

/**
 * Welcome! This is an introduction exercise that will show you a simple example of Bobocode exercises.
 * <p>
 * JavaDoc is a way of communication with other devs. We use Java Docs in every exercise to define the task.
 * So PLEASE MAKE SURE you read the Java Docs carefully.
 * <p>
 * <p>
 * In this repo you'll find dozens of exercises covering various fundamental topics.
 * They all have the same structure helping you to focus on practice and build strong skills!
 *
 * @author Taras Boychuk
 */
public class ExerciseIntroduction {
    /**
     * This method returns a very important message. If understood well, it can save you years of inefficient learning,
     * and unlock your potential!
     *
     * @return "The key to efficient learning is practice!"
     */
    public String getWelcomeMessage() {
        // todo: implement a method and return a message according to javadoc
        return "The key to efficient learning is practice!";
    }

    public String encodeMessage(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
