public class Praktikum {
    public static void main(String[] args) {
        int freeHours = 4; // ќбъ€вили переменную с количеством свободного времени в часах и присвоили ей значение

        checkReading(freeHours); // вызываем метод с циклом и передаЄм в него количество свободного времени
    }

    public static void checkReading(int freeHours) {// метод принимает количество свободного времени как параметр
        if (freeHours >= 2) { // ÷икл сработает, только если есть два или больше часа свободного времени
            for (int i = 1; i < 4; i = i + 1) {
                System.out.println("јнатолий прочитал " + i + "-ю главу");
            }
        } else {
            System.out.println("—егодн€ не читаем.");
        }
    }

} 