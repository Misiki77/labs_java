package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest {
    private Writer writer;
    private List<Pen> pencilcases;
    private static final String resultFileName = "result.csv";
    private static final String expectedFileName = "expected.csv";


    @BeforeEach
    public void setUp(){
        writer = new Writer();
        pencilcases = new LinkedList<>();
        pencilcases.add(new SchoolPen("rs-44","Kite","yellow","cloth",13,2,2,1));
        pencilcases.add(new MarkerPen("wep3","Camel","purple","plastic",11,11,"for drowing"));
        pencilcases.add(new FeatherPen("klot-666","Big","black","feather",21,"chiken's feather", "octopus' ink",3));
        pencilcases.add(new OilPen("tgr44","Parlament","black","mettalic",15,"olive oil",4));
    }

    @Test
    void emptyListTest() throws IOException {
        List<Pen> pencilcases = new LinkedList<>();
        writer.writeToFile(pencilcases, resultFileName);
        File file = new File(resultFileName);
        assertFalse(file.exists());
    }
    @Test
    void writeToFileTest() throws IOException {
        writer.writeToFile(pencilcases, "result.csv");
    }
    @Test
    void CompareTest() throws IOException {
        Path reality = new File(resultFileName).toPath();
        Path expected = new File(expectedFileName).toPath();
        assertEquals(0, Files.mismatch(expected, reality));
    }
    @Test
    void fileIsAlreadyExist() throws IOException {
        if(Files.exists(Path.of(resultFileName)))
            writeToFileTest();
        }
    }

