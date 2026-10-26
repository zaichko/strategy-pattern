import java.util.Objects;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(
                strategy, "Strategy must not be null"
        );
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(
                strategy, "Strategy must not be null"
        );
    }

    public String navigate(String origin, String destination) {
        return strategy.buildRoute(origin, destination);
    }
}