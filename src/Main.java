// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PowerOfTwoMaxHeap<Integer> heap = new PowerOfTwoMaxHeap<>(3);

        // Insert elements into the heap
//        heap.insert(10);
//        heap.insert(30);
//        heap.insert(50);
//        heap.insert(20);
//        heap.insert(40);
        heap.insert(100);
        heap.insert(200);
        heap.insert(600);
        heap.insert(700);


        // Pop the maximum element
        int max = heap.popMax();
        System.out.println("Maximum element: " + max);

        // Check if the heap is empty
        boolean isEmpty = heap.isEmpty();
        System.out.println("Is heap empty? " + isEmpty);
    }
}
// test case
case :1                                     case :1 
    100 200 600 700
    700 600 200 100
    Maximum Element is 700
    10 30 50 20 40
   50 40 30 2010
    Maximum Element is 50



