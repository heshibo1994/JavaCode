package testReference;

public class Role {
    private long rid;
    private String title;
    private Member members[];
    private Privilege privileges[];

    public Role(long rid, String title) {
        this.rid = rid;
        this.title = title;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Privilege[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Privilege[] privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", title='" + title + '\'' +
                '}';
    }
}
