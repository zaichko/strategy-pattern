# Strategy Design Pattern: Route Planning

## Overview

This project demonstrates the **Strategy behavioral design pattern** using a navigation system.

The application supports three interchangeable route-planning strategies:

- `CarStrategy` — plans a route using main roads and highways.
- `WalkStrategy` — plans a route using pedestrian paths and sidewalks.
- `CycleStrategy` — plans a route using bicycle-friendly roads and cycling paths.

The `Navigator` class acts as the context. It delegates route planning to the currently selected strategy and allows the client to change the strategy at runtime.

This is a simplified educational implementation. It demonstrates the design pattern rather than calculating real geographical routes.

## Project Structure

```text
src/
├── RouteStrategy.java
├── CarStrategy.java
├── WalkStrategy.java
├── CycleStrategy.java
├── Navigator.java
└── Main.java
```

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or Java-compatible IDE

No external libraries are required.

## How to Build and Run

Open a terminal in the project root directory.

Compile the source files:

```bash
javac -d out src/*.java
```

Run the application:

```bash
java -cp out Main
```

On Windows, these commands work in Command Prompt and PowerShell when `javac` and `java` are available in `PATH`.

## Example Output

```text
Car route from Astana to Borovoe: use main roads and highways.
Walking route from University to Library: use pedestrian paths and sidewalks.
Cycling route from Home to Park: prefer bike lanes and cycling paths.
```

## How to Add a New Strategy

The Strategy pattern makes it possible to add a new routing algorithm without modifying the existing `Navigator` class.

For example, to add a public transport strategy:

1. Create a new class named `PublicTransportStrategy`.
2. Implement the `RouteStrategy` interface.
3. Override the `buildRoute()` method.
4. Pass an instance of the new strategy to the navigator.

Example:

```java
public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String origin, String destination) {
        return "Public transport route from " + origin
                + " to " + destination
                + ": use buses and trains.";
    }
}
```

Select the new strategy in `Main.java`:

```java
navigator.setStrategy(new PublicTransportStrategy());

System.out.println(
    navigator.navigate("Home", "Airport")
);
```

The new strategy can be used immediately because it implements the same interface as the existing strategies. No changes to `Navigator` are necessary.

## Design Pattern Roles

| Component       | Responsibility                                                               |
|-----------------|------------------------------------------------------------------------------|
| `RouteStrategy` | Declares the common route-planning interface.                                |
| `CarStrategy`   | Implements the car route-planning variant.                                   |
| `WalkStrategy`  | Implements the walking route-planning variant.                               |
| `CycleStrategy` | Implements the cycling route-planning variant.                               |
| `Navigator`     | Stores the current strategy and delegates route planning.                    |
| `Main`          | Creates the context, selects strategies, and demonstrates runtime switching. |

## License

This project was created for educational purposes.
