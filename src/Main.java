import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userNumber, password, right = 3, balance = 1500, price;
        Scanner input = new Scanner(System.in);
        int select;

        while (right > 0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            userNumber = input.nextInt();
            System.out.print("Lütfen şifrenizi giriniz: ");
            password = input.nextInt();

            if (userNumber== 241642 && password == 121421) {
                do {
                    System.out.print("\nYapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");

                    select = input.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            price = input.nextInt();
                            balance = balance + price;
                            System.out.print("Yeni bakiye : " + balance);
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz miktar: ");
                            price = input.nextInt();
                            if (balance >= price) {
                                balance = balance - price;
                                System.out.print("Yeni bakiye: " + balance);
                            }
                            else
                                System.out.print("Yetersiz bakiye.");
                        }
                        case 3 -> System.out.print("Mevcut bakiyeniz: " + balance);
                    }
                }
                while (select != 4);
                System.out.print("İyi günler dileriz!");
            }

            else {
                System.out.print("Hatalı şifre, lütfen tekrar deneyiniz.");
                right--;
                if (right == 0) {
                    System.out.print("Kartınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
                else
                    System.out.print("Kalan hakkınız: "+right);
            }
        }
    }
}
