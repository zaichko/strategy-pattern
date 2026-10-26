public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String origin, String destination) {
        return "Public transport route from " + origin
                + " to " + destination
                + ": use buses and trains.";
    }
}