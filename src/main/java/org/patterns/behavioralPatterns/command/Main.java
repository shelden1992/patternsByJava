package main.java.org.patterns.behavioralPatterns.command;

public class Main {
    public static void main(String[] args) {
        FileOperationExecutor fileOperationExecutor =
                new FileOperationExecutor();
//        fileOperationExecutor.executeOperation(new OpenFileOperation(new TextFile("text.file")));
        HtmlFile htmlFile = new HtmlFile("html.file");
        fileOperationExecutor.executeOperation(htmlFile::read);



    }

}
