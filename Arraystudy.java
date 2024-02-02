package Arrays;

public class Arraystudy {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //1.Array creation
        int size =5;
        int arr[]=new int[size];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        print(arr);

        for (int i=0;i<size;i++)
        {
            arr[i]=i+1;
        }
        print(arr);
        //2.Array initializers list
        int arr2[]={1,2,3};
        print(arr2);
        //If we want to increase size of an array
        int copyarr[]=new int[2*size];//create array of double size
        for(int i=0;i<size;i++)//copy all elements from old array to new one
        {
            copyarr[i]=arr[i];
        }
        copyarr[5]=6;
        copyarr[6]=7;
        print(copyarr);
    }

}
