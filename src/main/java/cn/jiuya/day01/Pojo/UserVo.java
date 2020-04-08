package cn.jiuya.day01.Pojo;


import java.util.List;

public class UserVo {

    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "list=" + list +
                '}';
    }
}
