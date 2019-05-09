package by.it.shcherbich.jd1.lesson09_Generics;

public class Solution <T extends ClassForGenerics & InterfaceForGenerics> {
    T variable;

    public Solution(T variable) {
        this.variable = variable;
    }
}
