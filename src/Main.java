import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Operations operations=new Operations();
int eded=0;
        while (true) {
            System.out.println("Əlavə etmək əməliyyatı üçün 1 ədədini daxil edin! ");
            System.out.println("Silmək əməliyyatı üçün 2 rəqəmini daxil edin!");
            System.out.println("Hansısa musiqi haqqında məlumatlara baxmaq istəyirsizsə 3 rəqəmini daxil edin!");
            System.out.println("Əməliyyatı bitirmək üçün 0 daxil edin!");

            System.out.println("Əməliyyat üçün rəqəm daxil edin: ");
            eded = scanner.nextInt();

            if (eded == 0) {
                break;
            }

            switch (eded) {

                case 1:
                    System.out.println("Musiqinin id-si: ");
                    int musiqiid= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Daxil edəcəyiniz musiqinin adını deyin: ");
                    String Musiqiad=scanner.nextLine();

                    System.out.println("Ifacinin adi: ");
                    String ifaci= scanner.nextLine();
                    operations.add(new Music(musiqiid,Musiqiad,ifaci));
                    operations.info();

                    break;
                case 2:
                    System.out.println("Silinecek musiqinin id-si: ");
                    int musiqiId = scanner.nextInt();
                    operations.delete(musiqiId);
                    operations.info();
                    break;

                case 3:
                    System.out.println("baxilacaq musiqinin id-si: ");
                    int musiqiId2 = scanner.nextInt();
                    System.out.println(operations.getMusic(musiqiId2));
                    break;



            }
        }
    }
}
