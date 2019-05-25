package Mapping;

public class Role {
    private long rid;
    private String title;

    public Role(long rid, String title) {
        this.rid = rid;
        this.title = title;
    }
    public String getInfo() {
        return "Role{" +
                "rid=" + rid +
                ", title='" + title + '\'' +
                '}';
    }
}
