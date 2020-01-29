package testReference;

public class Member {
    private String mid;
    private String name;
    private Role roles[];

    public Member(String mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
