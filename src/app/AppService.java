package app;

import app.classes.Circle;
import app.classes.Rectangle;
import app.classes.Triangle;
import java.text.DecimalFormat;

import java.util.Scanner;

public class AppService {

    private static Scanner scanner;

    private final static String APP_MAIN_MENU = """
            1) Порахувати площу кола
            2) Порахувати площу квадрата
            3) Порахувати площу трикутника (висота*основу)
            4) Порахувати суму площ трьох фігур
            0) Вихід
            """;

    private int showMainMenu() {
        System.out.println(APP_MAIN_MENU);
        return Integer.parseInt(readStringVar("Зробіть вибір: введіть число від 0 до 4: "));
    }

    public String readStringVar(String hint) {
        System.out.print(hint);
        return AppService.scanner.nextLine();
    }

    private void outPuter(String textToOutput){
        System.out.println(textToOutput);
    }

    public void appMainService() {
        AppService.scanner = new Scanner(System.in);

        int choice;
        do {
            choice = showMainMenu();
            runChoicedTask(choice);
        } while (choice != 0);

        scanner.close();
    }

    private void runChoicedTask(int choicedTask) {
       switch (choicedTask) {
           case 1 -> calculateAreaOfCircle();
           case 2 -> calculateAreaOfRectangle();
           case 3 -> calculateAreaOfTriangle();
           case 4 -> calculateAreaOfThreeShapes();
       }
    }

    private void calculateAreaOfCircle() {
        //Ввід даних
        Circle circle = new Circle (Double.parseDouble(readStringVar("Введіть радіус кола: ")));

        //Вивід даних
        outPuter(circle + "\nПлоща кола = " + new DecimalFormat("0.00").format(circle.calculateArea())+ "\n");
    }
    private void calculateAreaOfRectangle() {
        //Ввід даних
        Rectangle rectangle = new Rectangle (Double.parseDouble(readStringVar("Введіть ширину прямокутника: ")),
                                             Double.parseDouble(readStringVar("Введіть висоту прямокутника: ")));

        //Вивід даних
        outPuter(rectangle + "\nПлоща прямокутника = " + new DecimalFormat("0.00").format(rectangle.calculateArea())+ "\n");
    }

    private void calculateAreaOfTriangle() {
        //Ввід даних
        Triangle triangle = new Triangle (Double.parseDouble(readStringVar("Введіть основу трикутника: ")),
                                          Double.parseDouble(readStringVar("Введіть висоту трикутника: ")));

        //Вивід даних
        outPuter(triangle + "\nПлоща трикутника = " + new DecimalFormat("0.00").format(triangle.calculateArea())+ "\n");
    }

    private void calculateAreaOfThreeShapes() {
        //Ввід даних
        Circle circle = new Circle (Double.parseDouble(readStringVar("Введіть радіус кола: ")));
        Rectangle rectangle = new Rectangle (Double.parseDouble(readStringVar("Введіть ширину прямокутника: ")),
                                             Double.parseDouble(readStringVar("Введіть висоту прямокутника: ")));
        Triangle triangle = new Triangle (Double.parseDouble(readStringVar("Введіть основу трикутника: ")),
                                          Double.parseDouble(readStringVar("Введіть висоту трикутника: ")));

        //Вивід даних
        outPuter(circle + "\nПлоща кола = " + new DecimalFormat("0.00").format(circle.calculateArea())+ "\n" +
                rectangle + "\nПлоща прямокутника = " + new DecimalFormat("0.00").format(rectangle.calculateArea())+ "\n" +
                triangle + "\nПлоща трикутника = " + new DecimalFormat("0.00").format(triangle.calculateArea())+ "\n" +
                "Сума площ = " + new DecimalFormat("0.00").format((circle.calculateArea() + rectangle.calculateArea() + triangle.calculateArea()))+"\n");
    }
}
