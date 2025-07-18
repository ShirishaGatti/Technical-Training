public class Matrxi {

    public static void matrix(){
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};

        int rowAdd[]=new int[matrix.length];
        int []colAdd=new int[matrix[0].length];
        int letfTraAdd=0,rightTraAdd=0;

        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                rowAdd[k]+=matrix[i][j];
                colAdd[k]+=matrix[j][i];

                if(i==j)
                    letfTraAdd+=matrix[i][j];
                if(i+j==matrix[0].length-1)
                    rightTraAdd+=matrix[i][j];
            }
            k++;
        }
        for(int i=0;i<rowAdd.length;i++)
            System.out.print(rowAdd[i]+" ");
        System.out.println();
        for(int i=0;i<colAdd.length;i++)
            System.out.print(colAdd[i]+" ");
        System.out.println();

        System.out.println(letfTraAdd+" "+rightTraAdd);
    }
    public static void main(String[] args){
        matrix();
    }
}
