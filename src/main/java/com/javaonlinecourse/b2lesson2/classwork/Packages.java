package com.javaonlinecourse.b2lesson2.classwork;


/**
 * http://ru.stackoverflow.com/questions/Несколько-классов-в-одном-java-файле
 *
 * Почему НЕ стоит пихать интерфейс в тот же файл - потому что интерфейс сам по себе подразумевает, что его будут
 * использовать другие люди, иначе толку от него?!
 *
 * Почему НЕ стоит пихать классы в тот же файл - потому что люди не будут знать, как найти этот класс
 * (это только в университетах код пишет и фиксит 1 человек).
 *
 * Почему стоит пихать классы в тот же файл - если вы посмотрите в исходный код Жава, то вы найдете много примеров,
 * когда абстрактный класс обьявлен как public, и в этом же файле лежит его дефолтная реализация.
 * Нет смысла выносить этот класс в отдельный файл т.к. не предусмотрено, что кто-то будет им пользоватся,
 * он нужен только этому паблик классу.
 */


public class Packages {
}

// класс доступен в рамках пакета
class MainClass {

    // скрытый внутренний класс. Виден только внутри класса MainClass.
    private class MyInnerClass {
    }

    // скрытый интерфейс. Доступен внутри класса MainClass.
    private interface MyInnerInterface {
    }

    // Доступен везде, но создан может быть только изнутри MainClass
    public class MyPublicInnerClass {}

    // Доступен везде. Может быть создан в статическом контексте.
    // В отличие от обычных inner-классов, не имеет доступа к членам MainClass.
    public static class MyStaticClass {}
}

// интерфейс доступен в рамках пакета
interface TestInterface {
}