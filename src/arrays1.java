public class arrays1 {
    public static void main(String[] args) {
        int[] array = {1, 23, 43, 756, 59, 32, 321, 43, 123, 4, 1232, 1331, 543};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dizinin " + i + "." + "elemani : " + array[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[array.length - 1]) {
                max = array[i];
            } else {
                max = array[array.length - 1];
            }
        }
        System.out.println("Dizide ki eleman sayisi: " + array.length);
        System.out.println("Dizide ki en buyuk deger : " + max);

        for (int i = 0; i < array.length; i++) {
            array[i] = max;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }
}
