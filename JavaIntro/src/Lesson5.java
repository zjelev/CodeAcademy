public class Lesson5 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(num--);
        boolean a = num < 36 ? true : false;
        System.out.println((num < 5) && (a || false));
    }
}