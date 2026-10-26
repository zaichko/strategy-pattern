public class CycleStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String origin, String destination) {
        return "Cycling route from " + origin + " to " + destination
                + ": prefer bike lanes and cycling paths.";
    }
}