public class IncrementDemo {
    public static void main(String[] args) {

        int count =2;
        System.out.println(++count + count++);
        System.out.println(--count + count--);
        System.out.println(--count - count--);
        System.out.println(++count - count++);
    }
}
