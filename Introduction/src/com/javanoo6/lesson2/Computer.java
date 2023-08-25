package com.javanoo6.lesson2;

//Объект - это экземпляр какого-либо класса
public class Computer {
    //Поля класса следует делать приватными
    private int ssd = 500;
    private int ram = 1024;

    //Если в классе нет конструктора, это еще не значит что нельзя создать экземпляр такого класса
    //В Java есть конструкторы по умолчанию, они не требуют пар-ов

    //Если мы создали свое определение конструктора класса
    //то теперь при создании экземпляра класса будет использован этот конструктор
    //В этой ситуации конструктор по умолчанию удаляется
    public Computer() {
        System.out.println("Я есмь экземпляр");
    }
    //Теперь при создании экземпляра класса в консоли выведется "Я был проинициализирован"
    //Доступ к полям и методам класса не изменился

    //Здесь мы создали еще один конструктор класса с пар-ом примитивного типа int
    //Если при создании экземляра такому конструктору передать пар-р, то поле ssd примет значение переданного пар-ра
    Computer(int newSsd) {
        ssd = newSsd;
    }

    //Еще один конструктор
    //Если указать модификатор доступа private у такого конструктора - он будет виден только внутри класса Computer
    //Если объявить модификатор доступа protected, то метод будет доступен как внутри пакета,так и у классов-наследников
    Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
    //this - это ключевое слово, им удобно пользоваться когда необходимо сослаться на текущий объект
    //у нас уже есть поле ssd / ram в пар-ах контруктора и без ключевого слова мы не сможем различить
    //переменные класса от переданных пар-ов
    //(тк поля класса и пар-ры конструктора объявлены одинановыми именами)

    //Методы класса
    void load() {
        System.out.println("я прогрузился?");
    }

    void load(boolean someBool) {
        if (someBool) {
            System.out.println("я перегруженный метод load");
        }
    }

    void load(boolean someBool, int someInt) {
        if (someBool) {
            System.out.printf("я тоже перегруженный метод load, а ты? (вот тот самый переданный int: %d)%n", someInt);
        }
    }

    public void printComputerInfo() {
        System.out.println("оператива: " + ram);
        System.out.println("памать: " + ssd);
    }
    //Сигнатура метода состоит названия метода и пар-ов метода
    //Возвращаемый тип данных не входит в сигнатуру метода!

    /** В данном классе определено 3 коструктора, эти конструкторы ни что иное как методы.
     *  Их отличие от остальнызх методов только в том, что они называется точно так же как и класс, в котом они объявлены
     *  и используются эти методы только для создания экземпляра класса после ключевого слова new.
     *  На примере этих конструкторов(методов) можно проследить, что называются они одинаково, но принимают разное кол-во пар-ов -
     *  Это называется перегрузкой метода
     *  ВАЖНО:
     *  Перегруженные методы могут иметь разный возвращаемый тип, тк в сигнатуру метода не входит возвращаемый тип
     *  Имена методов должны быть одинаковыми
     *  В перегружаемых методах важен порядок переваемых типов данных, типы данных могут быть при этом разными
     */
}
