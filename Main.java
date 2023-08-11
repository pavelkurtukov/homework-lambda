public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // Ошибка, связанная с делением на 0
        //int c = calc.devide.apply(a, b);
        // Решение проблемы
        int c = calc.devide2.apply(a, b);
        calc.println.accept(c);

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
