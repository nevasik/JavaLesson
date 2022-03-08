import java.util.List;

public class CarsBand {
    private String title; // название
    private int age; // год
    private List<String> cars;

    public CarsBand(String title, int age, List<String> cars) {
        this.title = title;
        this.age = age;
        this.cars = cars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarsBand{" +
                "title='" + title + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }

    public static void transfersCars(CarsBand a, CarsBand b){
        for (String cars : a.getCars()){
            b.getCars().add(cars);
        }
        a.getCars().clear();
    }

    public void printCars(){
        System.out.println(this.cars);
    }
}
