import java.util.Scanner;
class test{
    int s;
    test(int k){
        s = k;
    }
}
public class arayOfObjects {
    public static void main(String[] args) {
        test ob[] = new test[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            int k = scan.nextInt();
            ob[i] = new test(k);
            scan.close();
        }

        for(int i=0; i<5; i++){
            System.out.println(i+"th element: "); 
            System.out.println(ob[i].s + "\n");
        }
    }
}
