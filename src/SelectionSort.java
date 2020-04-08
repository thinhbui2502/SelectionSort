public class SelectionSort {
    static double[] list = {2.3, 1, 5.9, 3.4, -6, 8, -3, 4.6, 8.1};

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length; i++) {
            int currentMinIndex = i;
            double currentMin = list[i];

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}


