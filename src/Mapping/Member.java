package Mapping;

public class Member {
    private long mid;
    private String name;

    public Member(long mid, String name) {
        this.mid = mid;
        this.name = name;
    }


    public String getInfo() {
        return "Member{" +
                "mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
