public class IfElseIfStatement {
    public static void main(String[] args) {
        int x = 25;
        int y = 30;
        int z = 35;
        if (x> y && x > z){
            System.out.println("x is greater than y and z");

        } else if( y > x && y > z){
            System.out.println("y is greater than x and z");
        }else if(z > x && z > y){
            System.out.println("z is greater than x");
        }else {
            System.out.println("two numbers are equal above");
        }
    }
}
