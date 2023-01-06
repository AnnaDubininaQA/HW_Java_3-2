public class Main {
    public static void main(String[] args) {
        int count = 100;
        int addCount = 1500;
        int bonus = 0;

        if (addCount > 1000) {
            bonus = addCount / 100;

            if (addCount > 0) ;
        } else {
            System.out.println("Пополнение счета не может быть отрицательным");
        }
        count = count + bonus + addCount;
        System.out.println("На вашем счете: " + count + "рублей." + "Ваш бонус: " + bonus + "рублей");
    }
}