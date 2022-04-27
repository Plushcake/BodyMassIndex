public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bobyMassIndexVersion_1 = service.calculate(68, 160);
        System.out.println("Индекс массы тела первой версии: " + bobyMassIndexVersion_1);

        int bobyMassIndexVersion_2 = service.calculate(80, 170);
        System.out.println("Индекс массы тела второй версии: " + bobyMassIndexVersion_2);

        int bobyMassIndexVersion_3 = service.calculate(120, 220);
        System.out.println("Индекс массы тела третьей версии: " + bobyMassIndexVersion_3);

    }
}

//body Weight - Вес тела.
//body Growth - Рост.
