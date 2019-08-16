package main.java.org.patterns.structuralPatterns.proxy;

import java.io.IOException;

public interface CommandExecutor {
    void executeCommand(String cmd) throws IOException;
}
