package model;

// Đây chỉ là demo, mình sẽ phải bổ sung và sửa lai nhiều

// Đây là đại diện cho một thẻ flashcard, bao gồm các thuộc tính:
// Câu hỏi, câu trả lời, danh mục hoặc mức độ ưu tiên

// Class này chưa động đến

public class Card {

    private String question;
    private String answer;
    private String category;
    private int priority;

    public Card(String question, String answer, String category, int priority) {
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.priority = priority;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
