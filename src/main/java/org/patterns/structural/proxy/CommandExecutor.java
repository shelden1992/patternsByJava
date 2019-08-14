package main.java.org.patterns.structural.proxy;

import java.io.IOException;

public interface CommandExecutor {
    void executeCommand(String cmd) throws IOException;
}
