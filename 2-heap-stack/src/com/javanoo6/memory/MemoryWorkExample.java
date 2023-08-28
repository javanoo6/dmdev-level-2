package com.javanoo6.memory;

import java.util.Stack;

/**
 * Stack память в Java работает по схеме LIFO (Последний-зашел-Первый-вышел).
 * Т.е. последний элемент, который был добавлен в стек, будет удален первым.
 */

public class MemoryWorkExample {
    /**
     * При запуске программы все классы загружаются в Heap.
     */
    public static void main(String[] args) {
        var stack = new Stack();
        /**
         * Созданные ниже объекты автоматически сохраняются в Heap.
         * В Stack памяти сохраняются только ссылки на объекты в Heap, а так же примитивы
         * Один поток может породить множество объектов Stack, множество потоков могут разделять один и тот же Stack
         * В Heap содержатся все объекты, которые были созданны в потоке.
         * В данном примере у нас всего один поток (Thread)
         */
        var object1 = new ObjectWithName("TheFirstInStack");
        var object2 = new ObjectWithName("TheSecondInStack");
        var object3 = new ObjectWithName("TheThirdInStack");
        stack.push(object1.getName());
        stack.push(object2.getName());
        stack.push(object3.getName());
        System.out.println(stack.pop());//TheThirdInStack
        System.out.println(stack.pop());//TheSecondInStack
        System.out.println(stack.pop());//TheFirstInStack
        System.out.println(stack.empty());//true

        // Эта перенная будет хранится в Stack памяти
        var primitiveType = 1;
        // А эта переменная сохранится только в кач-ве ссылки "referenceType", само значение будет создано в Heap памяти
        var referenceType = new ObjectWithName("I am the reference, I belong to the HEAP");
        // Идентичная ситуация и здесь
        var stackExample = new MemoryWorkExample();
        // Вызов метода executeMethod создает блок на вершине Stack (аналогично с .push(object))
        // При этом этот блок будет содержать локальные переменные и ссылки на объекты для этого метода
        // Тк Java передает параметры по значению, то вызов метода executeMethod создаст еще одну ссылку на объект 'referenceType'
        stackExample.executeMethod(referenceType);

    }// На этом этапе удаляется Stack память
     // но в Heap все так же будут сужествовать созданные объекты до тех пор, пока их не удалить Garbage Collector

    private void executeMethod(ObjectWithName referenceType) {
        // тк String это ссылочный тип данных, то и ссылка ссылка будет существовать только в рамках Stack памяти
        // само значение будет создано в Heap памяти
        /** Почему здесь не используется ключевое слово new, хотя тип данных ссылочный:
         *  Все строки перед их созданеим проверяются на сущестование в String Pool
         *  Если такое строки нет, то оно будет создана, в противном случае создастся ссылка на уже существующую строку
         */
        var objectName = referenceType.getName();
        // При завершении метода 'executeMethod' созданный блок на вершине Stack памяти будет удален (.pop(object))
        System.out.println(objectName);
    }
}

