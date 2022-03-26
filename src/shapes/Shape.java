package shapes;

public abstract class Shape {
/**
 * 1.создать классы содержащие методы для подсчета площади прямоугольника
 * квадарата и круга. Кроме результата подсчета должно выводиться также
 * название соответствующей фигуры. Создать массив таких обьектов и вывести
 * его на экран
 * Прямоугольник1 имеет площкдь 50
 * Круг имеет площадь 20
 */
    private String displayName;

    public Shape(String displayName){
        this.displayName=displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
    public abstract double getArea();
}
