public class Main {


    public static void main(String[] args) {
//        System.out.println(exponentiation(3,3));
        bagpack();
    }

    //Возведение в степень с помощью рекурсии
    public static int exponentiation(int number, int power){
        if(number < 0 || power < 0){
            throw new ArithmeticException("wrong number");
        }
        if(power == 0){
            return 1;
        }
        return number * exponentiation(number,power-1);
    }

    //Задача про рюкзак
    public static void bagpack(){
        int capacity = 10;
        Things[] baggage = { new Things(12, 5),
                new Things(10,7),
                new Things(8,4),
                new Things(5,2),
                new Things(10,6)};

        Bagpack bagpack = new Bagpack(baggage);

        System.out.println(bagpack.result(baggage.length - 1, capacity));
    }





}
