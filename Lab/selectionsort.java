public class selectionsort {
    static void Selectionsort(int arr[]){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            int min=arr[i];
            for(int j=i+1;j<size-1;j++){
                if(arr[j]<min){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={5,10,51,15,66,11};
    }
}
