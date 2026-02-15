# 🚢 BattleShip-Java

A clean, object-oriented implementation of the classic Battleship game, built with core Java. This project demonstrates foundational software engineering principles like state management, coordinate-based logic, and interactive console design.

## 📌 Features

- **Interactive Two-Player Gameplay**: Fully immersive turn-based experience.
- **Dynamic Board Visualization**: Real-time grid updates for placement and attacks.
- **Smart Logic System**: Automatic detection of hits, misses, and fleet status.
- **Randomized Toss Mechanic**: Fair starting system using Java's `Random` class.
- **Encapsulated Architecture**: Clean separation of concerns between `Player`, `Board`, and `Ship` classes.

## 🛠 Tech Stack

- **Language**: Java 8+
- **Concepts**: Object-Oriented Programming (OOP), 2D Array Manipulation, Console UX/UI.

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) installed and configured in your environment.

### Compilation & Execution

To run the game, follow these steps in your terminal:

1. **Compile the source files:**
   ```bash
   javac RunGame.java
   ```

2. **Start the game:**
   ```bash
   java RunGame
   ```
   *(Note: The class name is case-sensitive! Ensure you use `RunGame`.)*

## 🎮 How to Play

1. **Setup**: Enter names for players and their ship fleets.
2. **The Toss**: Choose heads (0) or tails (1) to determine who goes first.
3. **Placement**: Strategically place your ships on the 5x5 grid (hidden from the opponent).
4. **Attack**: Take turns guessing coordinates to sink the enemy's fleet.
5. **Victory**: The first player to sink all opponent ships wins!

## 📂 Project Structure

- `RunGame.java`: The main entry point and game setup logic.
- `BattleShipGame.java`: Manages the overall game flow, turns, and toss.
- `Board.java`: Handles the 5x5 grid, ship placement, and hit detection.
- `Player.java`: Manages player state, name, and their respective board.
- `Ship.java`: Simple object tracking ship health and fleet count.

---

*Refined for growth as part of a personal development journey.*
