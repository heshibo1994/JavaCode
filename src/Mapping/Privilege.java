package Mapping;

public class Privilege {
    private long pid;
    private String title;

    public Privilege(long pid, String title) {
        this.pid = pid;
        this.title = title;
    }

    public String getInfo() {
        return "Privilege{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                '}';
    }
}
