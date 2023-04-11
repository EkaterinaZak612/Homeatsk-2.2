public class Main {
    public static void main(String[] args){
        int initialBalance = 11_300;
        int addend = 800;
        int bonus = 0;
        if (addend > 1000){
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итог" + finalBalance);
        System.out.println("Бонус" + bonus);
    }
}