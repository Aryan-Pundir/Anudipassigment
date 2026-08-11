public class Main {
    static void main(String[] args) {
        String s1 = "Aryan";
        String s2 = "Aryan";
        String s3 = new String("Aryan");
        String s4 = new String("Aryan");
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1==s2);
        System.out.println(s3==s2);
    }
}
