package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public abstract class Pen {
    public String id;
    public String brand;
    public String color;
    public String material;
    public int size;

    public abstract void calculatePrice();


}
