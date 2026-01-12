package scenario_based.OnlineExam;

class Question {
    private int id;
    private String question;
    private String correctAnswer;
    private int marks;

    public Question(int id, String question, String correctAnswer, int marks) {
        this.id = id;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getMarks() {
        return marks;
    }
}
