package Arrays;

public class PassingArray {
    static void addone(int x)
    {
        x=x+1;
    }
    static void addone(int arr[]){
        for (int i=0;i< arr.length;i++)
        {
            arr[i]++;
        }
    }
    public static void main (String[]args){
        int x=10;
        addone(x);
        System.out.println(x);

        int arr[]={1,2,3,4,5};
        addone(arr);
        for (int i=0;i< arr.length;i++)
        {
          System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
