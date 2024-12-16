import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Задача 1
        Объявите три массива:
• Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с
        помощью ключевого слова New*/

        int[] intArr = new int[] {1, 2, 3};

       /*Массив, в котором можно хранить три дробных числа — 1.57, 7.654,
                9.986. Массив сразу заполните значениями.*/

        double[] doubleArr = {1.57, 7.654, 9.986};

        /*Произвольный массив. Тип и количество данных определите сами.
        Самостоятельно выберите способ создания массива: с помощью
        ключевого слова или сразу заполненный элементами.*/

        int[] randomArr = new int[5];

        randomArr[0] = 13;
        randomArr[1] = 140;
        randomArr[2] = 109;

        /*Задача 2
        Распечатайте на отдельной строчке элементы каждого массива по
        порядку через запятую. В конце строки запятую ставить не надо.*/
        for (int num : intArr) {
            System.out.print(num + ", ");
        }

        for (double num : doubleArr) {
            System.out.print(num + ", ");
        }

        for (int i = 0; i < randomArr.length;  i++) {
            if (i == randomArr.length - 1) {
                System.out.println(randomArr[i]);
            }
            System.out.print(randomArr[i] + ", ");
        }

/*        Задача 3
        Распечатайте на отдельной строчке элементы каждого массива в
        обратном порядке через запятую. В конце строки запятую ставить не надо.
                Если в задаче 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986
// Произвольные элементы третьего массива
        то в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57
// Произвольные элементы третьего массива в обратном порядке*/

        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i] + ", ");
        }

        for (double num : doubleArr) {
            for (double i = doubleArr.length - 1; i >= 0; i--) {
            }
            System.out.print(num + ", ");
        }
        for (int i = 0; i > randomArr.length; i--) {
            System.out.println(i + ", ");
        }
        System.out.println();
        /*Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Создайте массив с пятью целочисленными элементами и задайте
        каждому элементу значение.
                Напишите программу, которая решит эту задачу, и выведите в консоль
        результат в формате: «Сумма трат за месяц составила … рублей».*/

        int[] expenseTeacher = {30000, 26500, 34500, 45000, 23000};

        int totalExpenses = 0;

        for (int expenses : expenseTeacher){
            totalExpenses += expenses;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        /*Также бухгалтерия попросила найти минимальную и максимальную траты за неделю.
        Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
         «Минимальная сумма трат за неделю составила ... рублей. Максимальная сумма трат за неделю составила ... рублей».*/

        int minExpenses = expenseTeacher[0];
        int maxExpenses = expenseTeacher[0];

        for (int expenses : expenseTeacher){
            if (expenses < minExpenses){
                minExpenses = expenses;
            }
            if (expenses > maxExpenses){
                maxExpenses = expenses;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");
    }
}