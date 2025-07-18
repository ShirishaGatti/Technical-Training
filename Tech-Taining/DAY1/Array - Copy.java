import java.util.*;
class Day1{

    public  int arraySum(int [] arr){
       
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum+= arr[i];
        }
        return sum;   
    }
    public int arrayMax(int[] arr){
        int max=Integer.MIN_VALUE;

        for(int num : arr){
            if(num>max)
            max=num;
        }
        return max;
    }
      public int arrayMin(int[] arr){
        int min=Integer.MAX_VALUE;

        for(int num : arr){
            if(num<min)
            min=num;
        }
        return min;
    }
    public static void vaishali(){
        while(true){
            System.out.println("Vaishlii ");
        }
    }
    // public static void pat(){
    //     for(int i=0;i<5;i++){
    //         System.out.println(00                                                                                 );
    //     }
    //     for(int i=0;i<5;i++){
    //         for(int j=0;j<5;j++){
    //             if(j>0 && j<5)
    //                 {
    //                     if(i==j)
    //                     System.out.print("*");
    //                     else
    //                     System.out.print(" ");

    //                 }
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args){
       Day1 d=new Day1();
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

      int sum= d.arraySum(arr);
      System.out.println("Sum :"+sum);  

      int max=d.arrayMax(arr);
      System.out.println("Max :"+max);  
      
      int min=d.arrayMin(arr);
      System.out.println("Min :"+min); 

      vaishali();
    //   pat();
    }
}