package by.it.shcherbich.jd1.lesson16_Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class Computer implements Serializable {
    private String name;
    private String cpu;
    private int ram;
    private int hdd;
}
