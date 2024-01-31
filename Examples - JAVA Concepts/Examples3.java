import java.util.LinkedList;

public class Examples3 {
    public static void main(String[] args) {
        LinkedList<Character> charList = new LinkedList<>();

        charList.add('A');
        charList.add('B');
        charList.add('C');
        charList.add('D');

        reverseLinkedList(charList);

        System.out.println("Reversed LinkedList:");
        for (char ch : charList) {
            System.out.print(ch + " ");
        }
    }

    static void reverseLinkedList(LinkedList<Character> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            char temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
