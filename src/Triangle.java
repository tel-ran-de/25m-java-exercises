public class Triangle {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getPerimeter(){
        return a+b+c;
    }
}
