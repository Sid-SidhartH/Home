public class Biggest {
    public static int maxElement(){
        int []arr={10,20,40,12,34};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
