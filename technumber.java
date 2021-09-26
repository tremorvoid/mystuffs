public class technumber {
    public static void main(String[] args) {
        int a,b,s;
        for (int i = 1000; i <9999 ; i++) {
            a = i%100;
            b = i/100;
            s = a+b;
            if (s*s==i) {
                System.out.println(i);
            }
        }
    }
}
