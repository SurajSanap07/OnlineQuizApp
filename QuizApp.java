package com.Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Question> questions = new ArrayList<>();
        
        // Adding all 10 questions
        questions.add(new Question("What are Java loops?",
                new String[]{"To repeat tasks", "To stop execution", "To store data", "To connect databases"}, 1));
        questions.add(new Question("What is enhanced for-loop?",
                new String[]{"Loop with conditions", "For-each loop", "Infinite loop", "Nested loop"}, 2));
        questions.add(new Question("How do you handle multiple user inputs?",
                new String[]{"Using Scanner multiple times", "Using loops", "Using arrays", "All of the above"}, 4));
        questions.add(new Question("How is a switch-case different from if-else?",
                new String[]{"Switch works with multiple data types", "Switch is faster in some cases", "If-else is more flexible", "All of the above"}, 4));
        questions.add(new Question("What are collections in Java?",
                new String[]{"Group of objects", "Only arrays", "Only lists", "Only maps"}, 1));
        questions.add(new Question("What is ArrayList?",
                new String[]{"Fixed-size array", "Dynamic array", "Hash map", "Linked list"}, 2));
        questions.add(new Question("How to iterate using iterators?",
                new String[]{"Using next() and hasNext()", "Using size() and get()", "Using length property", "Using index only"}, 1));
        questions.add(new Question("What is a Map?",
                new String[]{"Stores key-value pairs", "Stores only keys", "Stores only values", "Stores objects in sequence"}, 1));
        questions.add(new Question("How to sort a list?",
                new String[]{"Collections.sort()", "Arrays.sort()", "Manually swapping elements", "Only in databases"}, 1));
        questions.add(new Question("How to shuffle elements?",
                new String[]{"Collections.shuffle()", "Random generator", "Swap manually", "Sort in reverse"}, 1));

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }
            System.out.print("Your answer: ");
            int ans = sc.nextInt();
            if (ans == q.correctAnswer) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is: " + q.correctAnswer + ". " + q.options[q.correctAnswer - 1]);
            }
        }

        // Final result
        System.out.println("\n🎯 Quiz Over! Your score: " + score + "/" + questions.size());
        sc.close();
    }
}