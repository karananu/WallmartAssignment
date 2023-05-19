
import java.util.Comparator;
import java.util.PriorityQueue;
    public class PowerOfTwoMaxHeap<T extends Comparable<T>> {
        private PriorityQueue<T> heap;

        public PowerOfTwoMaxHeap(int childrenFactor) {
            Comparator<T> comparator = Comparator.reverseOrder();
            this.heap = new PriorityQueue<>(comparator);
        }

        public void insert(T element) {
            heap.offer(element);
        }

        public T popMax() {
            if (isEmpty()) {
                throw new IllegalStateException("Heap is empty.");
            }

            return heap.poll();
        }

        public boolean isEmpty() {
            return heap.isEmpty();
        }
    }


