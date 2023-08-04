import java.util.Scanner;

class linearsearch{

    public static void ls(int arr[],int key){
        for(int i=0;i<arr.length-1;i++){
            if(key==arr[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println("not found");
    }

    public static int max(int arr[]){
        int max=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int max=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int key=6;
        sc.close();

//        linearsearch.ls(arr, key );
//        System.out.println(max(arr));
        System.out.println(min(arr));

    }
}