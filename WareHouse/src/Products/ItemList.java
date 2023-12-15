package Products;

import java.util.Scanner;

public class ItemList {
    protected int idItemList; // id списка товара
    protected String nameIdList; // название списка товара
    protected double sizeItemList; // размер списка товара
    protected String descriptionItemList; // описание списка товара
    Scanner scanner = new Scanner(System.in);

    // Конструктор
    public ItemList(int idItemList, String nameIdList, double sizeItemList, String descriptionItemList) {
        this.idItemList = idItemList;
        this.nameIdList = nameIdList;
        this.sizeItemList = sizeItemList;
        this.descriptionItemList = descriptionItemList;
    }

    // Дополнительные методы и set/get методы
    public static ItemList createItemListFromConsole() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите id товара:");
            int id = scanner.nextInt();
            scanner.nextLine(); // считываем символ новой строки

            System.out.println("Введите название товара:");
            String name = scanner.nextLine();

            System.out.println("Введите размер товара:");
            double size = -1;
            while (size < 0) {
                System.out.println("Введите корректный размер товара (должен быть неотрицательным):");
                size = scanner.nextDouble();
            }
            scanner.nextLine(); // считываем символ новой строки

            System.out.println("Введите описание товара:");
            String description = scanner.nextLine();

            return new ItemList(id, name, size, description);

        } catch (Exception e) {
            System.out.println("Ошибка при вводе данных. Попробуйте снова.");
            return null;
        } finally {
            scanner.close(); // закрываем Scanner
        }
    }

    public void printItemListInfo() {
        System.out.println("Информация о товаре:");
        System.out.println("ID: " + idItemList);
        System.out.println("Название: " + nameIdList);
        System.out.println("Размер: " + sizeItemList);
        System.out.println("Описание: " + descriptionItemList);
    }
}
