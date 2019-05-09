package by.it.shcherbich.jd1.lesson16_Serialization;

import lombok.Data;

@Data
public class Notebook extends Computer{
    private Touchpad typeTouchpad;
    private transient String display;
public String toString (){
    return "������� "+getName()+", ��������� "+getCpu()+" ���������� = "+getRam()+" ������� ���� = "+ getHdd()+" ������ "+getTypeTouchpad()+" ������� "+getDisplay();
}
    public Notebook(String name, String cpu, int ram, int hdd, Touchpad typeTouchpad, String display) {
        super(name, cpu, ram, hdd);
        this.typeTouchpad = typeTouchpad;
        this.display = display;
    }
}
