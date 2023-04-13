// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.FileWriter;
import java.util.Arrays;

public class HomeTask2{
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] arr = {5, 7, -1, 0, 11, 18, 8, 3, 9, 2};
        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                stringBuilder.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fileWriter = new FileWriter("log.txt", false);
                    fileWriter.write(stringBuilder.toString());
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }  
            }
        }
    }
}
