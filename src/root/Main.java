package root;

public class Main {

    static Double[][] X = new Double[100][2];
    static Double[][] y = new Double[100][1];
    static Double[][] W = new Double[1][2];
    static Double[] b = new Double[1];

    public static void main(String[] args) {
        // initialise b
        b[0]= Math.random();

        // initialise X
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = Math.random();
            }
        }
        // initialise y
         for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                double dd = Math.random() <= 0.5 ? 0.0 : 1.0;
                y[i][j] = dd;
            }
        }

        for (int i = 0; i < W.length; i++) {
            for (int j = 0; j < W[i].length; j++) {
                W[i][j] = Math.random();
            }
        }
        System.out.println(model(X,W,b).length);
    }


        public static Double[][] model(Double[][] X, Double[][] W, Double[] b) {
            Double[][] A = new Double[100][1];
            for (int i = 0; i < X.length; i++) {
               double Z = (X[i][0] * W[0][0]) + (X[i][1] * W[0][1]) + b[0];
                A[i][0]= 1 / (1+Math.exp(-Z));
            }
            return A;
        }

        public static Double log_loss(Double[][] A, Double[][] y){
        int y_length = y.length;
        Double r = -(double) (1 / y_length);

        return null;
        }
}
