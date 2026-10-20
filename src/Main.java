import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" Домашняя работа № 9 \n Задание № 1");
        int[] inputArray1 = {85000, 80248, 94800, 105000, 105501};           // входной массив
        int sumInputArray1 = 0;                                       // сумма входного массива
        int maxInputArray1 = inputArray1[0];                          // максимальное число массива
        int minInputArray1 = inputArray1[0];                          // минимальное число массива
        for (int value : inputArray1) {
            sumInputArray1 += value;
            if (value > maxInputArray1) {
                maxInputArray1 = value;
            }
            if (value < minInputArray1) {
                minInputArray1 = value;
            }
        }
        float averageNumber = (float) sumInputArray1 / inputArray1.length;    // среднее число
        float[] outputArray1 = {sumInputArray1, maxInputArray1, minInputArray1, averageNumber};
        System.out.println(" Старый массив → " + Arrays.toString(inputArray1));
        System.out.println(" копия → " + Arrays.toString(outputArray1));
        System.out.println(" сумма: " + sumInputArray1);
        System.out.println(" макс число: " + maxInputArray1);
        System.out.println(" мин число: " + minInputArray1);
        System.out.println(" среднее число: " + averageNumber);
        System.out.println("\n");


        System.out.println(" Задача № 2");
        int[] inputArray2 = {85000, 80248, 94800, 105000, 105501};           // входной массив
        float[] outputArray2 = new float[inputArray2.length];                // Налог 13 %
        float[] salary2 = new float[inputArray2.length];                     // Массив ЗП
        int index2 = 0;
        for (int salary22 : inputArray2) {
            outputArray2[index2] = salary22 * 0.13f;
            salary2[index2] = salary22 - outputArray2[index2];
            index2++;
        }
        System.out.println("Зарплаты: " + Arrays.toString(inputArray2));
        System.out.println("Налог 13 %: " + Arrays.toString(outputArray2));
        System.out.println("Зарплаты после вычета  налога " + Arrays.toString(salary2));
        System.out.println(" \n");


        System.out.println("Задание № 3");
        int[] inputArray3 = {5000, 5260, 6330, 4980, 5770};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3] = bonus > 5000;
            index3++;
        }
        System.out.println("Бонусы: " + Arrays.toString(inputArray3));
        System.out.println("Проверка: " + Arrays.toString(outputArray3));
        System.out.println("\n");


        System.out.println(" Задание № 4 ");

        int[] inputArray4 = {5000, 3000, 1500, -200, 4000};
        boolean[] outputArray4 = {true};
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println("Баланс по месяцам: " + Arrays.toString(inputArray4));
        System.out.println("Все балансы положительные: " + Arrays.toString(outputArray4));
        System.out.println(" \n ");


        System.out.println(" Задача № 5 ");
        int[] inputArray5 = {120000, -200000, 150000, 0, 250000};
        int [] outputArray5 ={0};
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println("Прибыль по месяцам: " + Arrays.toString(inputArray5));
        System.out.println("Количество рентабельных месяцев: " + Arrays.toString(outputArray5));
        System.out.println(" \n ");













    }
}