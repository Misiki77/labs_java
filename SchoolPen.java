package ua.lviv.iot.algo.part1.lab1;
import com.sun.source.tree.Scope;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolPen {
    private String id;
    private String brand;
    private String color;
    private String material;
    private int size;
    private int numPencils;
    private int numPens;
    private int numErasers;

    private static SchoolPen instance = new SchoolPen();
    public static SchoolPen getInstance(){
        return  instance;
    }

    public void addPen() {
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
    public void printAll(){
        System.out.println("ID- "+id + "\t" + "Brand- "+brand + "\t" + "Color- "+color + "\t" + "Materia- "+material + "\t" + "Size- "+size + "\t" + "NumPencils- "+numPencils + "\t" + "NumPens- "+numPens + "\t" + "NumErasers"+numErasers + "\n");
    }

    public static void main(String[] args) {
       SchoolPen[] pencilscase = {
               new SchoolPen("lgp-67", "Big", "green", "cloth", 11, 4, 2, 1),
               new SchoolPen(),
               SchoolPen.getInstance()};

       for (SchoolPen pencilcase: pencilscase) pencilcase.printAll();

       pencilscase[0].removePen();
       pencilscase[1].removePencils();
       pencilscase[2].addPen();
       pencilscase[2].addPencil();

        for (SchoolPen pencilcase: pencilscase) pencilcase.printAll();



    }
}