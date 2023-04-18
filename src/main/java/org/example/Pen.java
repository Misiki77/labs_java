package org.example;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public abstract class Pen {
    public String id = "isn-101";
    public String brand;
    public String color;
    public String material;
    public int size;

    public abstract void calculatePrice();


}
