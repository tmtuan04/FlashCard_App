package model;

public class TableViewMain {

    String nameColumn;
    int newColumn, leanedColumn, dueColumn;

    public TableViewMain(String nameColumn, int newColumn, int leanedColumn, int dueColumn) {
        this.nameColumn = nameColumn;
        this.newColumn = newColumn;
        this.leanedColumn = leanedColumn;
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

    public int getLeanedColumn() {
        return leanedColumn;
    }

    public void setLeanedColumn(int leanedColumn) {
        this.leanedColumn = leanedColumn;
    }

    public int getDueColumn() {
        return dueColumn;
    }

    public void setDueColumn(int dueColumn) {
        this.dueColumn = dueColumn;
    }
}
