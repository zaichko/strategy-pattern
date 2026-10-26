public class CarStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String origin, String destination) {
        return "Car route from " + origin + " to " + destination
                + ": use main roads and highways.";
    }
}