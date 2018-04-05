public class MyClientStack {
    public static void main(String[] as) throws Exception {
        MyArrayStack stack = new MyArrayStack(5);

        stack.push(150);
        stack.push(17);
        stack.push(12);
        stack.push(54);
        stack.push(-15);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("2. Pop elements from stack: ");

        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop an operation: " +  stack.size());
    }
}
