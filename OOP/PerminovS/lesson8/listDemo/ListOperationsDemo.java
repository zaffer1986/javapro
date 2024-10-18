package OOP.PerminovS.lesson8.listDemo;

import java.util.List;

public class ListOperationsDemo {
    /*
    1) создать список 10 элементов
    2) добавить в начало и в хвост по одному элементу
    3) удалить элемент который удовлетворяет условиям
    4) создать два дубликата коллекции
    5) отсортировать дубликаты по возрастанию и по убыванию


    - получение от пользователя или из другого источника размере нашей коллекции
    - создание коллекции
    - наполнение коллекции
        - получение данных для заполнения всех элементов коллекции
        - проверка соответствия данных ?

    - добавление элемента коллекции
        - начало
        - в конец

    - поиск элементов который удовлетворяет условиям в коллекции
    - удаление этого элемента из коллекции

    - создание дубликата один и два
    - сортировка наших дубликатов


     */


    public static void main(String[] args) {

        CollectionsUtil collectionsUtil = new CollectionsUtil();
        InputData inputData = new InputData();
        OutData outData = new OutData();


        int sizeOfOurCollections = inputData.inputNumberOfElements();


        List<Book> ourLibrary = collectionsUtil.createCollection();

        System.out.println(ourLibrary);
        collectionsUtil.fillCollection(ourLibrary, sizeOfOurCollections, inputData, false);
        System.out.println();
        outData.printOurCollection(ourLibrary);
        System.out.println();
        collectionsUtil.fillCollection(ourLibrary, 1, inputData,true);
        collectionsUtil.fillCollection(ourLibrary, 1, inputData,false);

        System.out.println("-------------------------");
        outData.printOurCollection(ourLibrary);
        System.out.println("---------------");
        collectionsUtil.createCollectionDublicate(ourLibrary);



    }







}
