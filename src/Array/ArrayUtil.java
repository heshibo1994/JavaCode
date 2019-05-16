package Array;

public class ArrayUtil {
    private int sum;
    private double avg;
    private int min;
    private int max;
    public ArrayUtil(int data[]){
        this.max = data[0];
        this.min = data[0];
        for (int i = 0;i<data.length;i++){
            this.sum+=data[i];
            if (data[i]>max){
               max = data[i];
            }
            if (data[i]<min) {
                min = data[i];
            }
        }
        this.avg = this.sum/data.length;
    }
    public double getAvg() {
        return avg;
    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
