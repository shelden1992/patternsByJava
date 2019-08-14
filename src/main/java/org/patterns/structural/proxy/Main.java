package main.java.org.patterns.structural.proxy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CommandExecutor commandExecutor = new CommandExecutorProxy("PASSWORD", "ADMIN");
        commandExecutor.executeCommand("run");
    }
}
