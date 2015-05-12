package net.mindview.chapter5;

public class MoneyList {
    MoneyEnum moneyEnum;
    public MoneyList(MoneyEnum moneyEnum) {
        this.moneyEnum = moneyEnum;
    }
    void describe() {
        System.out.print("This currency is ");
        switch (moneyEnum) {
            case USD:
                System.out.println("US Dollars.");break;
            case EUR:
                System.out.println("European EURO.");break;
            case UAH:
                System.out.println("Ukrainian Gruvnya.");break;
            case RUR:
                System.out.println("Russian Rubil.");
        }
    }
    public static void main(String[] args) {
        for (MoneyEnum me : MoneyEnum.values()) {
            System.out.println(me + ", ordinar " + me.ordinal());
        }
        MoneyList
                gruvna = new MoneyList(MoneyEnum.UAH),
                dollars = new MoneyList(MoneyEnum.USD),
                rubil = new MoneyList(MoneyEnum.RUR),
                euro = new MoneyList(MoneyEnum.EUR);
        gruvna.describe();
        dollars.describe();
        rubil.describe();
        euro.describe();
    }
}
