import java.util.Scanner;
public class Sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int choice; 
        double []arr=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        double temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sort result:");
        System.out.print("\n");
        for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("\n");
        System.out.println("Sum of the array is:");
        System.out.println(sum);
        System.out.println("Average:");
        double average=0;
        for(int i=0;i<n;i++)
        {
            average+=arr[i]/n;
        }
        System.out.println(average);
    }
}
