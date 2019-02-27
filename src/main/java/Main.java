package main.java;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        File root = new File("/Users/rinat/IdeaProjects/exercises-java/src/modules");
        if (root.isDirectory()) {
            for (File file: root.listFiles()) {
                if (Character.isDigit(file.getName().charAt(0))) {
                    String name = file.getName().substring(3);
                    System.out.println(name);
                    file.renameTo(new File(name));
                    break;
                }
            }
        }
    }
}
