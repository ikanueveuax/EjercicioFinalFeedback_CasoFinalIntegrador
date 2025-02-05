package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.util;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentProcessor {

    private ExecutorService executor;

    public ConcurrentProcessor(int threadPoolSize) {
        this.executor = Executors.newFixedThreadPool(threadPoolSize);
    }

    public void processTasks(List<Runnable> tasks) {
        tasks.forEach(task -> executor.submit(task));
    }

    public void shutdown() {
        executor.shutdown();
    }
}
