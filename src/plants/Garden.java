package plants;

public class Garden {
    /**
     * Садовод-любитель
     * Выращиваем растения в течение нескольких лет и смотрим что будет
     * Задача: выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики
     * -name,height,age.  Каждый из видов растений вырастает за сезон на разную высоту, одинаковую для всех деревьев
     * и всех цветов
     *
     * Каждый сезон состоит из четырех времен года , в которые цветы и деревья ведут себя не всегда одинаково
     * Сезон для  цветов и деревьев начинается весной
     * Цветы: зимой не растут, летом тоже не растут а цветут,осенью их срезают
     * Деревья: зимой не растут,летом растут,осенью не растут, весной растут
     * В классе Garden создать по одному цветку и дереву и создать метод growPlants в котором происходит
     * процесс роста этих двух растений в течение нескольких лет.
     *
     * */
    public static void main(String[] args) {
        Plant t1 = new Tree("Pine",100,1);
        Plant f1 = new Flower("Tulip",0,1);

        Plant[] plants={t1,f1};

        int yearsToGrow =2;

        System.out.println("Growing plants for "+yearsToGrow+" years");

        growPlantsForNumberOfYears(plants,yearsToGrow);

        System.out.println(" Tree has height: "+t1.getHeight()+" and is "+t1.getAge()+ " years old");
        System.out.println(" Flower has height: "+f1.getHeight()+" and is "+f1.getAge()+" years old");

    }

    public static void growPlantsForNumberOfYears(Plant[] plants,int numberOfYears){
        for(int i=0;i<numberOfYears;i++){ //
            for(Plant plant:plants){//plants[i] plants[0]
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }
    }
}
