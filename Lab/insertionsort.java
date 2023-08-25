import java.util.*;

public class insertionsort {
    public static void insertsort(int arr[]){
        int size = arr.length;
        for(int i=1;i<size;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1] = key;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        insertsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
