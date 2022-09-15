import java.util.Scanner;

public class Gauss {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        itSOUT(Gauss(newArr(4)));
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
    public static double[][] Gauss(double[][] a){
        double check = 0;
        int itCheck = 0;
        double lineCheck=0;
        for (int i = 0;i< a.length;i++){
            for (int j=0;j<a.length+1;j++){

                if(i==j){
                    check = a[i][j];
                    a[i][j]=1;
                }else if (itCheck==i){
                    a[i][j]=a[i][j]/check;
                }else {
                    for(int k = i+1;k<a.length;k++){
                        lineCheck=a[k][i];
                        System.out.println(lineCheck);
                        a[k][i]=0;
                        int gaus = k;
                        while(gaus<a.length){
                            if (k>gaus){
                                a[k][gaus]=0;
                            }else {
                                a[k][gaus] = a[k][gaus] - lineCheck * check;
                            }
                            gaus++;
                        }
                    }
                }
            }
            itCheck++;
        }
        itSOUT(a);
        for(int i=0;i<a.length;i++){
            for(int j = 0; j<a.length+1;j++){
                int dd = (int)(a[i][j]*1000);
                double cc = (double) dd/1000;
                a[i][j]=cc;
            }
        }
        return a;
    }
//    public static thisLine()
    public static void itSOUT(double[][] a){
        for (int i = 0; i<a.length;i++){
            for (int j= 0;j<a[i].length;j++){
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
