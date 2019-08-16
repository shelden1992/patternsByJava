package main.java.org.patterns.structuralPatterns.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void executeCommand(String cmd) throws IOException {
        System.out.println(cmd+" execute");

    }
}
