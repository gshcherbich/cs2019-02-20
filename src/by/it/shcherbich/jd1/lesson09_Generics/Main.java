package by.it.shcherbich.jd1.lesson09_Generics;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair("������", "��� ����?");
        System.out.println(pair.key+ " " +pair.value);
        System.out.println(PairUtil.swap(pair).key+" " + PairUtil.swap(pair).value);
        Arithmetic ar = new Arithmetic(4, 2.1);
        System.out.println("����� "+ ar.a+ " � " + ar.b+ " = "+ar.sum());

    }
}
