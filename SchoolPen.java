package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter

    private int numPencils;
    private int numPens;
    private int numErasers;


    private static SchoolPen instance = new SchoolPen();
    public static SchoolPen getInstance(){
        return  instance;
    }

            numPens++;
    }
    public void addPencil(){
        numPencils++;
    }
    public void removePen(){
        numPens--;
    }
    public void removePencils(){
        numPencils--;
    }
