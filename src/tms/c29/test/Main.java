package tms.c29.test;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(new Box[]{
                new Box(22, 5.77, "A-29"),
                new Box(44, 6.77, "B-29"),
                new Box(55, 8.77, "C-29"),
                new Box(19, 5.11, "D-29"),
                new Box(70, 9.77, "E-29")

        });

        for (int i = 0; i < warehouse.getArray().length; i++) {
            System.out.println(warehouse.getArray()[i] + " Next element: " + warehouse.next());
            //не понимаю,как исправить возникающую ошибку: A->B,B->C,C->D,но D->A,игнорируя E
            //если добавить while(index<boxes.length-1),то все,кроме 1й,-null
        }
    }
}
