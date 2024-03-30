package minh_nhom2;

public class CountEvenPositive {
    public static void countEvenPositive(LinkedList list) {
        int count = 0;
        int sum = 0;
        Node current = list.head;
        while (current != null) {
            if (current.data % 2 == 0 && current.data > 0) {
                count++;
                sum += current.data;
            }
            current = current.next;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Số lượng số chẵn dương: " + count);
            System.out.println("Trung bình cộng các số chẵn dương: " + average);
        } else {
            System.out.println("Không có số chẵn dương trong danh sách");
        }
    }
}