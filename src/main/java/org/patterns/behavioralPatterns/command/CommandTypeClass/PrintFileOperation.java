package main.java.org.patterns.behavioralPatterns.command.CommandTypeClass;

import main.java.org.patterns.behavioralPatterns.command.File;
import main.java.org.patterns.behavioralPatterns.command.FileOperation;

public class PrintFileOperation implements FileOperation {
    private File file;

    public PrintFileOperation(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.print();

    }
}
