package main.java.org.patterns.structuralPatterns.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {
    private static final String PASSWORD = "PASSWORD";
    private static final String LOGIN = "ADMIN";
    private String password;
    private String login;
    private CommandExecutor commandExecutor;
    private boolean admin;


    public CommandExecutorProxy(String password, String login) {
        this.password = password;
        this.login = login;
        if (password.equals(PASSWORD) && login.equals(LOGIN)) {
            admin = true;
            commandExecutor = new CommandExecutorImpl();
        }
    }

    @Override
    public void executeCommand(String cmd) throws IOException {
        if (admin) {
            commandExecutor.executeCommand(cmd);
        }
        else System.out.println("Try again, you are enter not correct data");


    }
}
