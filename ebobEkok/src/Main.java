import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        int obeb = 1;

        if(n1 < n2){
            int i = n1;
            while(i > 0){
                if(n1 % i == 0 && n2 % i == 0){
                    obeb = i;
                    break;
                }
                i--;
            }
            System.out.println("OBEB : " + obeb);
        } else if (n2 < n1) {
            int j = n2;
            while(j > 0){
                if(n1 % j == 0 && n2 % j == 0){
                    obeb = j;
                    break;
                }
                j--;
            }
            System.out.println("OBEB : " + obeb);

        }
        int k = 1;
        int okek = 1;
        while(k <= n1*n2){

            if(k % n1 == 0 && k % n2 == 0){
                okek = k;
                break;
            }
            k++;
        }
        System.out.println("OKEK : " + okek);
    }
}