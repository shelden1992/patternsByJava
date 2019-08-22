package main.java.org.patterns.behavioralPatterns.command.CommandTypeClass;

import main.java.org.patterns.behavioralPatterns.command.File;
import main.java.org.patterns.behavioralPatterns.command.FileOperation;

public class ReadFileOperation implements FileOperation {
    private File file;

    public ReadFileOperation(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.read();

    }
}
