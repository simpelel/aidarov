package ru.mirea.task2.exs1;

public class TestAuthor {
    public static void main(String[] args){
        Author People = new Author("Pushkin","feed03@yandex.ru",'m');
        System.out.println(People.getName());
        System.out.println(People.getEmail());
        System.out.println(People.getGender());
        System.out.println(People.toString());
        People.setEmail("point.r-123@yandex.ru");
        System.out.println(People.getEmail());
        System.out.println(People.toString());
    }
}