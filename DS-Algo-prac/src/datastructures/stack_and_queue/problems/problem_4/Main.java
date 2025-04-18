package datastructures.stack_and_queue.problems.problem_4;

public class Main {

    // WRITE THE ISBALANCEDPARENTHESES METHOD HERE //
    public static boolean isBalancedParentheses(String str){
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        int length = str.length();
        if(length%2!=0) return false;



        for(char c : str.toCharArray()){
            if(c=='('){
                stack.push(c);
            }

            if(c==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) return false;

        return true;

    }




    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

}

