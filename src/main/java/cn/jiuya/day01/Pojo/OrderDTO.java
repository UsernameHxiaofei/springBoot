package cn.jiuya.day01.Pojo;


public class OrderDTO extends Order {
    private Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "money=" + money +
                '}';
    }
}
