public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        view = new double[numRows][numCols];
        int index = 0;
        for(int i = 0; i< numRows; i++){
            if(i%2 == 0) {
                for (int j = 0; j < numCols; j++) {
                    view[i][j] = scanned[index];
                    index++;
                }
            }
            else{
                for (int j = numCols-1; j >= 0; j--) {
                    view[i][j] = scanned[index];
                    index++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double sum = 0;
        double count = 0;
        for(int i = startRow; i <= endRow; i++){
            for(int j=startCol; j <= endCol;j++){
                sum=sum+view[i][j];
                count++;
            }
        }
        return (sum/count);
    }

    public String toString(){
        String str="";
        for(int i = 0; i< view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                    str = str + view[i][j] + ", ";
            }
            str = str +"\n";
        }
        return str;
    }
}
