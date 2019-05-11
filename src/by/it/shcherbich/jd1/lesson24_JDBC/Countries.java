package by.it.shcherbich.jd1.lesson24_JDBC;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Countries {
    int idcountries;
    String country_name;
    double population;
    int square;
    public String toString(){
        return "id "+idcountries+", "+country_name+ ", население "+population+" млн. чел., площадь "+ square+" тыс. кв.км.";
    }
}
