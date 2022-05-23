package root;

public class Main {

   static Double [][] X = new Double[100][2];
    static Double [][] y = new Double[100][1];
    static Double [][] W = new Double[1][2];
    static Double []b = new Double[1];

    public static void main(String[] args) {
        for (int i = 0; i < X.length; i++){
            for (int j = 0; j < X[i].length; j++) {
                 X[i][j] = Math.random();
            }
         }

        for (int i = 0; i < y.length; i++){
            for (int j = 0; j < y[i].length; j++) {
                 Double dd = Math.random() <= 0.5?0.0:1.0;
                y[i][j] = dd;
             }
        }
     }


     public static Double [][] model(Double[][] X,Double[][] W,Double[] b){
        Double[][] Z = null;
         for (int i = 0; i < X.length ; i++) {
             for (int j = 0; j < X[i].length; j++) {
                Z[i][j] = (X[i][j] * W[0][j])+b[0];
             }
         }
         return X;
     }


}
