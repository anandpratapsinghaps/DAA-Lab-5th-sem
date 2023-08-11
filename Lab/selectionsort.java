public class selectionsort {
    static void Selectionsort(int []arr){
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[min]){
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
        Selectionsort(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
