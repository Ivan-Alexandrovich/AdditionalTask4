package Ivan.com;

public class ReturnNumber {
    private int [] values; //массив значений
    private int [] weights; //массив весов
    private int [] index; //левые границы отрезков
    private int sum; //сумма всех весов = общая длина интервала

    public ReturnNumber (int [] values, int [] weights) {
        this.values = values;
        this.weights = weights;
        index = new int [values.length]; //массив левых границ отрезка такой же размерности что и массив значений

        sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += weights[i];
        }

        int leftSum = 0; // заполняем массив левых границ
        for (int i = 0; i < index.length; i++) {
            index[i] = leftSum;
            leftSum += weights[i];
        }
     }

    public int randomNumber () {
        int random = (int) (Math.random() * (sum - 1));

        int appropriateIndex = 0;
        for (int i = 0; i < index.length; i++) {
            if (random < index[i]) {
                break;
            }
            appropriateIndex = i;
        }
        return values[appropriateIndex];
    }
}
