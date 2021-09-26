public class ascii {
    public static void main(String[] args) {
        int a = 'A';
        System.out.println("Letters    Unicode");
        for (int i = 0; i < 26; i++) {
            
             System.out.println((char)a+"           "+a);
             a=a+1;

        }
    }
}
