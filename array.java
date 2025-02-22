import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = scan.nextInt();
            scan.close();
        }
        System.out.println("1D array: ");
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
        int arr2[][] = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr2[i][j] = scan.nextInt();
                scan.close();
            }
        }

        System.out.println("2D array: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println(arr2[i][j]);
            }
        }

        int arr3[][][] = new int[1][2][3];
        for(int i=0; i<1; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<3; k++){
                    arr3[i][j][k] = scan.nextInt();
                    scan.close();
                }
            }
        }
    }
}
