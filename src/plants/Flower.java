package plants;

public class Flower extends Plant {

    private static int FLOWER_GROW_PER_SEASON=2;

    public Flower(String name,int height, int age) {
        super(name,height,age);
    }


    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName()+ " is not growing in Summer, but flourishing "+ getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.println(getName()+" is cut to zero in Autumn "+getHeight());
    }
}
