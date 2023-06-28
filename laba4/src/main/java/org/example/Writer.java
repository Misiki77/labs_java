package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.opencsv.CSVWriter;

public class Writer {
    public String writeToFile(List<Pen> pencilcases, String filename) throws IOException {
        if(new File("result.csv").exists()){
            Files.delete(Path.of("result.csv"));
        }
        if(pencilcases == null || pencilcases.isEmpty()){
            return null;
        }
        try (FileWriter writer = new FileWriter(filename)){
            for(Pen pencilcase: pencilcases){
                writer.write(pencilcase.getTitle());
                writer.write("\r\n");
                writer.write(pencilcase.getHeaders());
                writer.write("\r\n");
                writer.write(pencilcase.toCSV());
                writer.write("\r\n");
                writer.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "result.csv";
    }

}
