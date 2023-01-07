public class Main {
    public static void main(String[] args) {
        int count = 100;
        int addCount = 1500;
        int bonus = 0;

        if (addCount > 1000) {
            bonus = addCount / 100;

        }
        int result = count + bonus + addCount;
        System.out.println("Итоговый счет: " + result + " рублей. " + " Бонус: " + bonus + " рублей ");
    }
}