public class Armstrong {

    public static int checkArmstrong(int temp){
        int s=temp;
        int res=0,sum=0;
        while(s>0){
            res=s%10;
            sum += res*res*res;
            s=s/10;
        }
        if(sum==temp){
            return 1;
        }
        else{
            return 0;
        }
    }
}
