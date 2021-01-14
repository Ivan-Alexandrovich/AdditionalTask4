package Ivan.com;
/*4 Напишите класс, конструктор которого принимает два массива: массив значений и
массив весов значений. Класс должен содержать метод, который будет возвращать
элемент из первого массива случайным образом, с учётом его веса. Пример: Дан
массив [1, 2, 3], и массив весов [1, 2, 10]. В среднем, значение «1» должно
возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение
«3».*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Insert number of elements in your array");
	Scanner input = new Scanner(System.in);
	int size = input.nextInt();
	int [] values = new int[size];
	int [] weights = new int[size];
	System.out.println("Insert array value elements");
    inputArray(values, size);
    System.out.println("Insert array weight elements");
    inputArray(weights, size);
    System.out.println("Here is your value array");
    outputArray(values,size);
    System.out.println();
    System.out.println("Here is your weight array");
    outputArray(weights,size);

    ReturnNumber a = new ReturnNumber(values, weights);
    System.out.println();
    System.out.println("Returned value: " + a.randomNumber());
    }

    public static void inputArray (int [] arr, int size) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void outputArray (int [] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
