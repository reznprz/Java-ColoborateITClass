package Operators.Logical_Operators;

public class Logical_action {
    public static void main(String[] args) {
        //create truth table for && (conditoin AND) Operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Condition AND (&&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));

        // create truth table for || (condition OR) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Condition OR (||)",
                "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // create truth table for & (boolean logical AND) oeprator

        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Boolean logical AND (&)",
                "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));

        // create truth table for | (boolean logical inclusive OR) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical inclusive OR (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));

        // create truth table for ^ (boolean logical exclusive OR) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical exclusive OR (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));

        // create truth table for ! (logical negation) operator
        System.out.printf("%s\n%s: %b\n%s: %b\n",
                "Logical NOT (!)",
                "!false", (!false), "!true", (!true));

    }
}
