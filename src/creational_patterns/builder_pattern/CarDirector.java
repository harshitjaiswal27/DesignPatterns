package creational_patterns.builder_pattern;

public class CarDirector {
    public void buildLamboAvent(CarBuilder carBuilder){
        carBuilder.brand("Lamborghini")
                .model("Aventador")
                .nbrDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildBugattiChiron(CarBuilder carBuilder){
        carBuilder.brand("Bugatti")
                .model("Chiron")
                .nbrDoors(2)
                .engine("9L")
                .height(125);
    }
}
