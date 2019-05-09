package by.it.shcherbich.jd1.lesson16_Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Touchpad implements Serializable {
    String type;
}
