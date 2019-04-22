package by.it.shcherbich.jd1.lesson14_Regexp_Pattern_Matcher;
/*
3. Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например
<p id ="p1">,
и замену их на простые теги абзацев <p>.
 */
public class task3 {
    public static void main(String[] args) {
        System.out.println("<pfggf>bngnhjgh<p1>fgfhghg<p id =\"p1\">".replaceAll("(<p)([^<>]*)(>)","<p>"));
    }
}
