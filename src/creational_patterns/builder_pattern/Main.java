package creational_patterns.builder_pattern;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.id(1234).color("Red").engine("8L").model("Urus").nbrDoors(2).brand("Lamborgini");
        Car car = carBuilder.build();
        car.displayAttributes();
        System.out.println("-----------------------------");
        CarDirector lamboDirector = new CarDirector();
        CarBuilder lamboBuilder = new CarBuilder();
        lamboDirector.buildLamboAvent(lamboBuilder);
        lamboBuilder.color("Red").id(12345);
        Car lambo = lamboBuilder.build();
        lambo.displayAttributes();
        System.out.println("-----------------------------");
        CarDirector bugattiDirector = new CarDirector();
        CarBuilder bugattiBuilder = new CarBuilder();
        bugattiDirector.buildBugattiChiron(bugattiBuilder);
        Car bugatti = bugattiBuilder.build();
        bugatti.displayAttributes();
    }
}
