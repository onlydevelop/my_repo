package com.com.example;

import software.amazon.codeguruprofilerjavaagent.Profiler;

class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Profiler.Builder()
         .profilingGroupName("my_development")
         .build().start();
    }
}
