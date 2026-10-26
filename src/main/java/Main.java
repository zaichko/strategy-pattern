public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());

        System.out.println(
                navigator.navigate("Astana", "Borovoe")
        );

        navigator.setStrategy(new WalkStrategy());

        System.out.println(
                navigator.navigate("University", "Library")
        );

        navigator.setStrategy(new CycleStrategy());

        System.out.println(
                navigator.navigate("Home", "Park")
        );

        navigator.setStrategy(new PublicTransportStrategy());

        System.out.println(
                navigator.navigate("Home", "University")
        );
    }
}