public class Massiv {
    public static void main(String[] args) {
        System.out.println("Hello");
        invertArray();
        fillArray();
        sixArray();
        matrixDio();

    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1)
                System.out.print(arr[i] = 0);
         else {
                System.out.print(arr[i] = 1);
            }

    }

    public static void fillArray() {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.out.println(num[i] = i);

        }
    }




    public static void sixArray () {
        int[] six = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < six.length; i++) {
            if (six[i] < 6) {
                System.out.println(six[i] *= 2);
            }


        }
    }

    public static void matrixDio () {
        int[][] quadrat = new int[4][4];
        for (int i = 0; i < quadrat.length; i++) {
            quadrat[i][i] = 1;
            }
            for (int i = 0; i < quadrat.length; i++) {
                for (int j = 0; j < quadrat[0].length; j++) {
                    System.out.print(quadrat[i][j] +" ");
                }
                System.out.println();
        }
        System.out.println();

    }
}




