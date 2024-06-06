package model;

public class TableViewAddCard {

//    Để thử cái tên khác để check lại cái hàm
    int STT;
    String front, back;

    public TableViewAddCard(int STT, String front, String back) {
        this.STT = STT;
        this.front = front;
        this.back = back;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }
}
