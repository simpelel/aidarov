package ru.mirea.task3.exs3;

public class Test {
    public static void main(String[] args)
    {
        MovableRectangle obj = new MovableRectangle(5, 5, 10, 10, 1, 1);
        obj.moveLeft();
        obj.moveUp();
        obj.moveRight();
        obj.moveDown();
        System.out.println(obj.toString());
    }
}