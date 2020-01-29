package testReference;

public class Privilege {
    private long pid;
    private String title;
    private Role role;
    public Privilege(long pid, String title) {
        this.pid = pid;
        this.title = title;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Privilege{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                '}';
    }
}
