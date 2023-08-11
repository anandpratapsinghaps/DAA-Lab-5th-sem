public class bubblesort {
    static void Bubblesort(int arr[]){
        int size=arr.length-1;
        for(int i=0;i<=size-1;i++){
            for(int j=0;j<=size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={10,5,7,15,20};
        
        Bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
