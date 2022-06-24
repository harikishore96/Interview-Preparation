package com.silentanonym.interviewprep.designpattern;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingletonTest {

    @Test
    void test_MultiThreading() throws InterruptedException {
        Callable<Integer> run = () -> {
            System.out.println(LocalDateTime.now());
            System.out.println(Singleton.getInstance());
            System.out.println(LocalDateTime.now());
            return 1;
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.invokeAll(new ArrayList<>(Arrays.asList(run, run, run)));
    }
}
