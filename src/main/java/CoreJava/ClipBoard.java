package CoreJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ClipBoard {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to File cut and copy Paste program");
        System.out.print("Enter the path of the .txt file: ");
        String filePath = s.nextLine();
        String fileContent = readFile(filePath);

        if (fileContent != null) {
           
            System.out.println("Choose operation:");
            System.out.println("1.Cut");
            System.out.println("2.Copy ans Paste");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    cutOp(filePath, fileContent,s);
                    break;
                case 2:
                    copyPasteOp(filePath, fileContent,s);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting the program.");
            }
        } else {
            System.out.println("Unable to read the file. Exiting the program.");
        }

    }
     private static String readFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
            return null;
        }
    }
       private static void cutOp(String filePath, String fileContent,Scanner s) {
        System.out.print("Enter the starting line number for cut: ");
        int startLine = s.nextInt();
        System.out.print("Enter the starting index for cut: ");
        int startIndex = s.nextInt();
        System.out.print("Enter the ending line number for cut: ");
        int endLine = s.nextInt();
        System.out.print("Enter the ending index for cut: ");
        int endIndex = s.nextInt();

        
        String[] lines = fileContent.split("\n");
        StringBuilder newContent = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            if (i + 1 >= startLine && i + 1 <= endLine) {
                if (i + 1 == startLine) {
                   
                    newContent.append(lines[i], 0, startIndex);
                }
                if (i + 1 == endLine) {
                   
                    newContent.append(lines[i].substring(endIndex));
                }
            } else {
                newContent.append(lines[i]);
            }

      
            if (i < lines.length - 1) {
                newContent.append("\n");
            }
        }

     
        writeFile(filePath, newContent.toString());

        System.out.println("Cut operation completed.");
    }
       private static void writeFile(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes());
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
       private static void copyPasteOp(String filePath, String fileContent,Scanner s) {
       
        System.out.print("Enter the path for pasting the content: ");
        String newFilePath = s.next();

      
        System.out.print("Enter the line number for paste: ");
        int pasteLine = s.nextInt();
        System.out.print("Enter the index for paste: ");
        int pasteIndex = s.nextInt();

        
        String cutContent = readFile("cut_temp.txt");

        if (cutContent != null) {
           
            String[] lines = fileContent.split("\n");

           
            StringBuilder newContent = new StringBuilder();
            for (int i = 0; i < lines.length; i++) {
                if (i + 1 == pasteLine) {
                    
                    newContent.append(lines[i], 0, pasteIndex);
                    newContent.append(cutContent);
                    newContent.append(lines[i].substring(pasteIndex));
                } else {
                  
                    newContent.append(lines[i]);
                }

                
                if (i < lines.length - 1) {
                    newContent.append("\n");
                }
            }

           
            writeFile(newFilePath, newContent.toString());

            System.out.println("Copy & Paste operation completed.");
        } else {
            System.out.println("Cut content not found. Exiting the program.");
        }
    }

}
