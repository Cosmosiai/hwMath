import java.util.Scanner;

public class Radix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        radix(newArr(4));
    }
    public static double[][] newArr(int a){
        double[][] arr = new double[a][a+1];
        for (int i = 0; i<a;i++){
            for (int j=0;j<a+1;j++){
                if(j==a){
                    System.out.println("result"+(i+1)+" = ");
                }else {
                    System.out.println("a"+(i+1)+""+(j+1)+" = ");
                }
                double newDoub= sc.nextDouble();
                arr[i][j]=newDoub;
            }
        }
        return arr;
    }
    public static void radix(double[][] a){
        double t = 0;
        int b = a.length;
        double[][] tDoub= new double[b][b+1];
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (i==0&&j==0) {
                    t=Math.sqrt(a[i][j]);
                    tDoub[i][j]=t;
                }else if(i>j){
                    tDoub[i][j]=0;
                }else if(j==i){
                    double doub = a[i][j];
                    for (int i1 = i;i1>=0;i1--){
                        doub = doub-tDoub[i1][j]*tDoub[i1][j];
                    }
                }else{

                }
            }
            System.out.println();
        }
    }
}
