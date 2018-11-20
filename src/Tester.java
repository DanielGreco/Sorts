public class Tester
    {
        public static void main(String args[])
            {
                int[] arr1 = {328,812,1019,519,1011,408,406,214,1004,222,102,816,204,601,312,713,604};
                Sorts.printArr(arr1);
                System.out.println();

                Sorts.ascendingSort(arr1);
                Sorts.printArr(arr1);
                System.out.println();

                Sorts.descendingSort(arr1);
                Sorts.printArr(arr1);
                System.out.println();

                String[] arr2 = {"Daniel","Cindy","Andrew","Sheba","Chrissie","Calvin","Yashrif","Awais","Angela"};
                Sorts.ascendingSort(arr2);
                Sorts.printArr(arr2);
                System.out.println();

                Sorts.descendingSort(arr2);
                Sorts.printArr(arr2);
                System.out.println();
            }
    }