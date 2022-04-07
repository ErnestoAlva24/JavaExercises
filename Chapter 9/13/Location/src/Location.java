public class Location {
    public int row, column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a){
        double max = 0;
        int row = 0, col = 0;

        for(int i = 0; i<a.length;i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max){
                    row = i;
                    col = j;
                    max = a[i][j];
                }
            }
        }

        return new Location(row, col, max);
    }
}
