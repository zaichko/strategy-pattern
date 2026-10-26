public class WalkStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String origin, String destination) {
        return "Walking route from " + origin + " to " + destination
                + ": use pedestrian paths and sidewalks.";
    }
}