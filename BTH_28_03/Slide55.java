public class Slide55{
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 5 là: ");
             
        for (int i = 0; i <= 200; i++) {
            if (i % 5 != 0) {
                continue;
            }                
            System.out.println(i);
        }
    }
}