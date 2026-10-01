public class ilkkod {
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 2; i <= 20; i += 2) {
            toplam += i * i * i;
        }

        System.out.println("Çift sayıların küpleri toplamı: " + toplam);
    }
}