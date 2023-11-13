//write a program that initiate 2 string with a comma, split the string using the split() method
public class Exercise4 {
    public static void main(String[] args) {
            String holder = "String";
            String builder = "String builder";

            String concatenated = holder.concat("," + builder);
            System.out.println(concatenated);

            String[] brokenDown = concatenated.split(",");
            System.out.println(brokenDown[1]);

        }
    }





