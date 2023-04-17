// Magazine.java

public class Magazine {
    private String title;
    private int issueNumber;
    private int month;
    private int year;

    public Magazine(String title, int issueNumber, int month, int year) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

