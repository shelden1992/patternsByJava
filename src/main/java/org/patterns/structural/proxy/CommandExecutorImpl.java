package main.java.org.patterns.structural.proxy;

import main.java.org.patterns.structural.decorator.exemple1.IO;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void executeCommand(String cmd) throws IOException {
        System.out.println(cmd+" execute");

    }
}
