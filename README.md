# Mafia Pass the Phone

A mobile-first social deduction game where players share one device to play Mafia. Players secretly receive roles, perform night actions, discuss suspicions, and vote to eliminate members of the Mafia.

**Project Type:** College Mini Project
**Development Status:** In Progress
**Backend:** Java, Spring Boot
**Frontend:** HTML, CSS, JavaScript
**Build Tool:** Maven

---

## Team Members

| Member   | Name                      | Role                            |
| -------- | ------------------------- | ------------------------------- |
| Member 1 | **Siddhi Iyer**           | Backend & Integration Lead      |
| Member 2 | **Alysha D'Souza**        | UI/UX Design Lead               |
| Member 3 | **Jerina Rajendra Kumar** | Game Flow & Testing Coordinator |

### Responsibilities

**Siddhi Iyer — Backend & Integration**

* Set up the Java Spring Boot project.
* Implement game logic and REST APIs.
* Manage GitHub integration and project structure.
* Establish and test frontend–backend communication.
* Coordinate API integration with the team.

**Alysha D'Souza — UI/UX Design**

* Design the mobile-first interface in Figma.
* Prepare layouts for player setup, role reveal, gameplay, voting, and results.
* Maintain visual consistency and usability.
* Coordinate the design handoff for frontend implementation.

**Jerina Rajendra Kumar — Game Flow & Testing**

* Document game rules and the player journey.
* Identify edge cases and expected game behaviour.
* Prepare test scenarios for gameplay.
* Support integration testing and project documentation.

---

## Overview

Mafia Pass the Phone is a local multiplayer social deduction game designed for groups playing together in person.

Players are assigned secret roles such as Mafia, Doctor, Detective, or Villager. During the night, players perform role-specific actions. During the day, they discuss the events and vote to eliminate a suspected Mafia member.

The application manages the game state, player roles, actions, voting, eliminations, and win conditions.

The project uses a Java backend and a browser-based frontend served by Spring Boot. It is designed to be simple, explainable, and suitable for a college mini project.

---

## Objectives

* Create a playable Mafia game using a single shared device.
* Implement core gameplay rules using Java.
* Provide a responsive, mobile-first user interface.
* Keep player roles private during gameplay.
* Manage game phases, night actions, voting, and eliminations.
* Demonstrate communication between a frontend and a REST API backend.

---

## Planned Features

### 1. Player Setup

* Add players using their names.
* Configure the number of Mafia, Doctors, and Detectives.
* Assign remaining players as Villagers.
* Validate player and role counts before starting the game.

### 2. Secret Role Assignment

* Randomly assign roles to players.
* Reveal each role privately when the device is passed to that player.
* Keep roles hidden from other players during gameplay.

### 3. Night Phase

* Mafia selects a player to attack.
* Doctor selects a player to protect.
* Detective investigates a player and privately learns whether that player is Mafia.

### 4. Day Phase

* Announce the outcome of the night.
* Allow players to discuss and identify suspicious behaviour.
* Conduct private voting.
* Eliminate the player receiving the most votes.
* If votes are tied, no player is eliminated that round.

### 5. Win Conditions

* **Town wins:** All Mafia members have been eliminated.
* **Mafia wins:** The number of living Mafia members is equal to or greater than the number of living Town members.

### 6. Final Results

* Display the winning team.
* Reveal all players' roles after the game ends.

---

## Technology Stack

| Component               | Technology            |
| ----------------------- | --------------------- |
| Programming Language    | Java                  |
| Backend Framework       | Spring Boot           |
| Frontend                | HTML, CSS, JavaScript |
| API Communication       | REST APIs             |
| Build Tool              | Maven                 |
| Version Control         | Git                   |
| Repository Hosting      | GitHub                |
| Development Environment | Visual Studio Code    |

The frontend is served directly by Spring Boot from the `static` resources directory. This allows the frontend and backend to run on the same local server during development.

---

## Gameplay Flow

```text
Create Game
    |
Add Players
    |
Configure Roles
    |
Validate Setup
    |
Randomly Assign Roles
    |
Private Role Reveal
    |
Night Phase
    |
Mafia Attack / Doctor Protect / Detective Investigate
    |
Day Announcement
    |
Discussion and Voting
    |
Elimination or Tie
    |
Check Win Condition
    |
Continue to Next Round OR Display Final Results
```

---

## Project Structure

```text
mafiagame/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
│
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── mafiapassphone/
    │   │           ├── Application.java
    │   │           │
    │   │           ├── controller/
    │   │           │   └── GameController.java
    │   │           │
    │   │           ├── model/
    │   │           │   ├── Game.java
    │   │           │   ├── Player.java
    │   │           │   ├── Role.java
    │   │           │   └── GamePhase.java
    │   │           │
    │   │           └── service/
    │   │               └── GameService.java
    │   │
    │   └── resources/
    │       ├── application.properties
    │       ├── static/
    │       │   └── index.html
    │       └── templates/
    │
    └── test/
        └── java/
```

*The project structure will expand as additional game logic, frontend assets, and tests are implemented.*

---

## Getting Started

### Prerequisites

* Java Development Kit (JDK) compatible with the project configuration
* Git
* A code editor such as Visual Studio Code
* A modern web browser

The project includes the Maven Wrapper, so a separate Maven installation is not required.

### 1. Clone the Repository

```bash
git clone https://github.com/alysha07/mafiagame.git
```

### 2. Navigate to the Project Directory

```bash
cd mafiagame
```

If the repository contains a nested project directory, navigate into the directory containing `pom.xml`.

### 3. Run the Application

**Windows PowerShell:**

```powershell
.\mvnw.cmd spring-boot:run
```

**macOS / Linux:**

```bash
./mvnw spring-boot:run
```

Wait until Spring Boot reports that the application has started successfully.

### 4. Open the Application

Visit the following URL in your browser:

```text
http://localhost:8080/
```

The current starter page includes a button for testing game creation through the backend API.

---

## Current API Endpoints

The following endpoints are implemented in the current backend foundation.

| Method | Endpoint                     | Description                |
| ------ | ---------------------------- | -------------------------- |
| `POST` | `/api/game`                  | Creates a new game         |
| `GET`  | `/api/game/{gameId}`         | Retrieves a game by its ID |
| `POST` | `/api/game/{gameId}/players` | Adds a player to a game    |

### Create a Game

**Request**

```http
POST /api/game
```

**Description:** Creates a new game and generates a unique game ID.

### Add a Player

**Request**

```http
POST /api/game/{gameId}/players
Content-Type: application/json
```

**Request Body**

```json
{
  "name": "Siddhi"
}
```

**Description:** Adds a player to the specified game.

> These are the initial development endpoints. Role assignment, private role retrieval, night actions, voting, phase transitions, and final results are planned for later development.

---

## Development Roadmap

### Phase 1 — Project Setup & Planning

* [x] Initialize the Spring Boot project.
* [x] Set up the GitHub repository.
* [x] Implement initial game creation and player APIs.
* [x] Create the frontend static directory and starter page.
* [x] Verify frontend–backend communication.
* [ ] Finalize Figma screens.
* [ ] Document game rules and edge cases.
* [ ] Confirm the API contract with the team.

### Phase 2 — Core Game Logic

* [ ] Implement player and role configuration.
* [ ] Validate player and role counts.
* [ ] Implement random role assignment.
* [ ] Implement private role reveal.
* [ ] Implement Mafia, Doctor, and Detective night actions.
* [ ] Implement day announcements and voting.
* [ ] Implement eliminations and win conditions.

### Phase 3 — Frontend Implementation

* [ ] Implement screens based on the approved Figma design.
* [ ] Connect frontend screens to backend APIs.
* [ ] Implement the pass-the-phone interaction flow.
* [ ] Add input validation and user feedback.
* [ ] Improve mobile responsiveness.

### Phase 4 — Testing & Finalization

* [ ] Test gameplay from setup through final results.
* [ ] Test tied votes and protected targets.
* [ ] Test restrictions for eliminated players.
* [ ] Test all win conditions.
* [ ] Prepare project documentation.
* [ ] Prepare the final project demonstration.

---

## Current Limitations

* Game data is stored in memory and is not persisted in a database.
* Game state is lost when the application restarts.
* The current frontend is a connection-test page, not the final game interface.
* Complete gameplay logic and role-privacy safeguards are still under development.
* The application is designed for local, in-person play on a shared device.

---

## License

This project is developed for academic purposes as a college mini project.
