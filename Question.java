package com.Quiz;

class Question {
    String question;
    String[] options;
    int correctAnswer; // index starting from 1

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}
