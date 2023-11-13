//Break this string into protocol, host, endpoint http://ingrydacademy.com/students
public class Exercise7 {
    public static void main(String[] args) {
        String holder = "http://ingrydacademy.com/students";
        String protocol = holder.substring(0, holder.indexOf(':'));
        String host = holder.substring(holder.indexOf('i'), holder.lastIndexOf('/'));
        String endpoint = holder.substring(holder.lastIndexOf('/') + 1);
        System.out.println(protocol);
        System.out.println(host);
        System.out.println(endpoint);


    }
}



