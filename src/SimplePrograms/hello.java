package SimplePrograms;

import java.io.FileWriter;
import java.io.IOException;

public class hello {

    public static void main(String[] args) throws IOException {
        // The output message to be saved in the file
        String message = "Hello world welcome to Jenkins..........TEST";

        // Display the message on the console
        System.out.println(message);
        
        // Write the message to a file named "output.txt"
        try (FileWriter fileWriter = new FileWriter("/var/lib/jenkins/workspace/Java_Build_SaveOutput/hello_output.txt")) {
            fileWriter.write(message);
            System.out.println("Output has been successfully written to output.txt");
        } 
}
    }