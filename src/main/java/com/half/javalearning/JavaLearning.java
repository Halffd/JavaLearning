/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.half.javalearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author half
 */
public class JavaLearning {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        AnnouncementPrinter printer = new AnnouncementPrinter();
        try {
            printer.makeAnnouncement();
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

class AnnouncementPrinter {

    void printToDifferentStreams(PrintStream out, String message) {
        out.println(message);
    }

    void makeAnnouncement() throws FileNotFoundException {
        String announcement = "Important announcement!";
        
        // Print to standard output and error streams
        printToDifferentStreams(System.out, announcement);
        printToDifferentStreams(System.err, announcement);
        
        // Create a platform-independent file path
        String filePath = "announcement.txt"; // Use relative path for multi-platform compatibility
        PrintStream fileStream = new PrintStream(new File(filePath));
        printToDifferentStreams(fileStream, announcement);
        
        // Show the absolute path of the stored file
        File file = new File(filePath);
        System.out.println("File stored at: " + file.getAbsolutePath());
    }
}