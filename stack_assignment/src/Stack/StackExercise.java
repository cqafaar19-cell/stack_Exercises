package Stack;

import java.util.Stack;

public class StackExercise {

    public static void main(String[] args) {

        // 1 - Create a Stack of Strings called 'stack'
        Stack<String> stack = new Stack<>();

        // 2 - Push 5 elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        System.out.println(stack.toString());

        // 3 - Peek at the top element without removing it
        System.out.println("Top element : " + stack.peek());

        // 4 - Pop an element and print it, then print the remaining stack
        String popped = stack.pop();
        System.out.println("Popped: " + popped);
        System.out.println("Remaining stack: " + stack);

        // 5 - Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());


            // --- String Reversal ---
            System.out.println("\n--- String Reversal ---");
            String original = "Hello World";
            Stack<Character>mystack=new Stack<>();
            for (int i=0; i<original.length(); i++)
                mystack.push(original.charAt(i));
                System.out.println(mystack);
                System.out.println("before pop");
                String result="";
                while (!mystack.isEmpty()){
                    result+=mystack.pop();
                }
                System.out.println("after pop");
                System.out.println(mystack);
                System.out.println(original);
                System.out.println(result);


            // --- Balanced Brackets ---
            System.out.println("\n--- Balanced Brackets ---");
            String balanced = "({[()]})";
            String unbalanced = "({[})";

    // 7 - Balanced brackets checker
            String[] tests = { balanced, unbalanced };

            for (String s : tests) {
                Stack<Character> bracketStack = new Stack<>();
                boolean isBalanced = true;

                for (char c : s.toCharArray()) {
                    if (c == '(' || c == '{' || c == '[') {
                        bracketStack.push(c);                  // opening: remember it
                    } else if (c == ')' || c == '}' || c == ']') {
                        if (bracketStack.isEmpty()) {          // closing with nothing open
                            isBalanced = false;
                            break;
                        }
                        char top = bracketStack.pop();         // most recent opening bracket
                        if ((c == ')' && top != '(') ||
                                (c == '}' && top != '{') ||
                                (c == ']' && top != '[')) {
                            isBalanced = false;                // wrong type of bracket
                            break;
                        }
                    }
                }

                // Leftover opening brackets mean it's unbalanced
                if (!bracketStack.isEmpty()) {
                    isBalanced = false;
                }

                System.out.println(s + " is " + (isBalanced ? "balanced" : "NOT balanced"));
            }

        }

}