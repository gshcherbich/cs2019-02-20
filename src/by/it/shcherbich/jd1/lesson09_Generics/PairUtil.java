package by.it.shcherbich.jd1.lesson09_Generics;

public final class PairUtil {
    static Pair swap(Pair pair) {
        Pair pair1 = new Pair();
        pair1.key = pair.value;
        pair1.value = pair.key;
        return pair1;
    }
}
