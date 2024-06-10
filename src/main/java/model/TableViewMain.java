package model;

// Lớp này liên quan đến TableView trong MainWindow

public class TableViewMain {

    String nameColumn;
    int newColumn, learnedColumn, dueColumn;

    public TableViewMain(String nameColumn, int newColumn, int learnedColumn, int dueColumn) {
        this.nameColumn = nameColumn;
        this.newColumn = newColumn;
        this.learnedColumn = learnedColumn;
        this.dueColumn = dueColumn;
    }

    public String getNameColumn() {
        return nameColumn;
    }

    public void setNameColumn(String nameColumn) {
        this.nameColumn = nameColumn;
    }

    public int getNewColumn() {
        return newColumn;
    }

    public void setNewColumn(int newColumn) {
        this.newColumn = newColumn;
    }

    public int getLearnedColumn() {
        return learnedColumn;
    }

    public void setLearnedColumn(int learnedColumn) {
        this.learnedColumn = learnedColumn;
    }

    public int getDueColumn() {
        return dueColumn;
    }

    public void setDueColumn(int dueColumn) {
        this.dueColumn = dueColumn;
    }
}
