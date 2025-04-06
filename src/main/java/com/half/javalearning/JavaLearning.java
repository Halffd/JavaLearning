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
        // Print a greeting message
        System.out.println(AnsiColors.GREEN + "Hello World!" + AnsiColors.RESET);

        AnnouncementPrinter printer = new AnnouncementPrinter();
        try {
            printer.makeAnnouncement();
        } catch (FileNotFoundException e) {
            System.err.println(AnsiColors.RED + "Error: " + e.getMessage() + AnsiColors.RESET);
        }
    }
}

class AnnouncementPrinter {

    void printToDifferentStreams(PrintStream out, String message) {
        out.println(message);
    }

    void makeAnnouncement() throws FileNotFoundException {
        String announcement = "Important announcement!";
        
        // Print to standard output and error streams with colors
        printToDifferentStreams(System.out, AnsiColors.CYAN + announcement + AnsiColors.RESET);
        printToDifferentStreams(System.err, AnsiColors.YELLOW + "Warning: " + announcement + AnsiColors.RESET);
        
        // Create a platform-independent file path
        String filePath = "announcement.txt"; // Use relative path for multi-platform compatibility
        PrintStream fileStream = new PrintStream(new File(filePath));
        printToDifferentStreams(fileStream, announcement);
        
        // Show the absolute path of the stored file
        File file = new File(filePath);
        System.out.println(AnsiColors.GREEN + "File stored at: " + file.getAbsolutePath() + AnsiColors.RESET);
    }
}

// Class to hold ANSI color codes
class AnsiColors {
    public static final String RESET = "\033[0m"; // Reset to default color
    public static final String GREEN = "\033[32m"; // Green for normal output
    public static final String RED = "\033[31m";   // Red for error messages
    public static final String YELLOW = "\033[33m"; // Yellow for warnings
    public static final String CYAN = "\033[36m";   // Cyan for announcements
}