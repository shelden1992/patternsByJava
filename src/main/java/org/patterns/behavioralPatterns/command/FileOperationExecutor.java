package main.java.org.patterns.behavioralPatterns.command;

import java.util.ArrayList;
import java.util.List;

public class FileOperationExecutor {
    private final List<FileOperation> fileOperationsList = new ArrayList<>();

    public void executeOperation(FileOperation fileOperation) {
        fileOperationsList.add(fileOperation);
        fileOperation.execute();

    }
}
