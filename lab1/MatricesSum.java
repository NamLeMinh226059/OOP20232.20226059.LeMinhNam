import java.util.Scanner;
public class MatricesSum
{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Row: ");
	int r = sc.nextInt();
    System.out.print("Column ");
    int c = sc.nextInt();
    double [][] m1 =new double[r][c];
    double [][] m2 =new double[r][c];
    double [][] m =new double[r][c];
    System.out.println("First matrix:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            m1[i][j]=sc.nextInt();
        }
    }
    System.out.println("Second matrix:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            m2[i][j]=sc.nextInt();
            m[i][j]=m1[i][j]+m2[i][j];
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.print("\n");
    }

}
}
