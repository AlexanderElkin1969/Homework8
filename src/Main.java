import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] arr1 = new int[3];
        double [] arr2 = {1.57, 7.654, 9.986};
        String [] arr3 = {"Мне ","нравится ","Java "};
        System.out.println("Задача 1-2");
        for (int i = 0; i <= 2; i++) {
            arr1[i] = i + 1;
        }
        System.out.println("Целочисленный массив: "+Arrays.toString(arr1));
        System.out.println("Вещественный массив: "+Arrays.toString(arr2));
        System.out.println("Строковый массив: "+Arrays.toString(arr3));
        System.out.println("Но в другом виде выглядит лучше: ");
        for (int i = 0; i <= 2; i++) {
        System.out.print(arr3[i]);
        }
        System.out.println("\n"+"Задача 3");
        for (int i = 2; i >= 0; i--) {
            if (i==0){
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i]+", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i==0){
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i]+", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i==0){
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i]+", ");
        }
        System.out.println("\n"+"Задача 4");
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i]%2 != 0){
                arr1[i] += 1;
            }
        }
        System.out.println("Целочисленный массив: "+Arrays.toString(arr1));
    }

}