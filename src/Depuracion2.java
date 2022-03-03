public class Depuracion2 {

    public static void insertionSortAlternative(int[] a) {
        int nSwaps = 0;
        int nIter = 0;
        int nPass = 0;
        for (int i = (a.length - 3); i > -1; i--) {
            nPass++;
            int j = i;
            int tmp = a[i];
            while ((j < a.length - 1) && (tmp > a[j + 1])) {
                a[j] = a[j+1];
                nSwaps++;
                j++;
            }
            a[j] = tmp;
        }
        System.out.println("nPass = " + nPass
                + " nIter: " + nIter
                + " nSwaps " + nSwaps);
    }

    private static void print(int a[]) {
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        System.out.println("**********************************************");
        int array[] = {7, 5, 1, 2, 3, 6, 4};
        System.out.print("Unsorted Array: ");
        print(array);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Insertion Sort Alternative Version: ");
        insertionSortAlternative(array);
        print(array);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        array = new int[]{2, 3, 4, 5, 1};
        System.out.print("Unsorted Array: ");
        print(array);
        System.out.println("Insertion Sort Alternative Version: ");
        insertionSortAlternative(array);
        print(array);

        System.out.println("**********************************************");
        array = new int[]{7, 5, 1, 2, 3, 6, 4};
        System.out.print("Unsorted Array: ");
        print(array);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Insertion Sort Alternative Version: ");
        insertionSortAlternative(array);
        print(array);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        array = new int[]{2, 3, 4, 5, 1};
        System.out.print("Unsorted Array: ");
        print(array);
        System.out.println("Insertion Sort Alternative Version: ");
        insertionSortAlternative(array);
        print(array);

        System.out.println("**********************************************");
        array = new int[]{7, 5, 1, 2, 3, 6, 4};
        System.out.print("Unsorted Array: ");
        print(array);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Insertion Sort Alternative Version: ");
        insertionSortAlternative(array);
        print(array);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        array = new int[]{2, 3, 4, 5, 1};
        System.out.print("Unsorted Array: ");
        print(array);
        System.out.println("Insertion Sort Alternative Version: ");
        insertionSortAlternative(array);
        print(array);

    }
}