//Example of association
//A state can have several cities, and those cities are related to that single state.
//creates two calass city and states. 
//It defines the many-to-one relationship.

import java.util.ArrayList;
import java.util.List;

class City{
    String cityName;
    int population;
    City(String cityName,int population){
        this.cityName=cityName;
        this.population=population;
    }
    void displayCity(){
     System.out.println(cityName+" total population is :" +population);
    }
     @Override
    public String toString() {
    return String.valueOf(cityName);
    }
}

class State{
    String stateName;
    int total_population;
    List<City> city;
    State(String stateName){
        this.stateName=stateName;
    }
    public String getStateName() {
        return stateName;
    }
    void setCity(List<City> city){
        this.city=city;
    }
    List<City> getCity(){
        return city;
    }
    int getPopulation(List<City> city1) {
    total_population = 0;
    for (City n : city1) {
        total_population += n.population;
    }
    return total_population;
}

    int getTotalcity(List<City> city1){
        int no_of_city=0;
        for (City n : city) {
        no_of_city++;
        }
        return no_of_city;
    }
}
public class Program24 {
    public static void main(String[] args) {
        City c1=new City("Contai" ,5000);
        City c2=new City("Burdwan", 4000);
        City c3=new City("Kolkata",8000);
        City c4=new City("Durgapur", 5000);
        State s1=new State("WEST BANGAL");
        List<City> mystate=new ArrayList<>();
        s1.setCity(mystate);
        mystate.add(c1);
        mystate.add(c2);
        mystate.add(c3);
        mystate.add(c4);
        c1.displayCity();
        c2.displayCity();
        c3.displayCity();
        c4.displayCity();
        System.out.println("Total number of city:"+s1.getTotalcity(mystate));
        System.out.println("All City Names are:"+s1.getCity());
        System.out.println("In "+s1.getStateName()+" tOtal population = "+s1.getPopulation(mystate));

    }
}
