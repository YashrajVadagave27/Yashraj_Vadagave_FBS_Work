**🏏 Player Management System – C (Console Based)**

A console-based **Player Management System** developed in **C language** to efficiently manage cricket player records.  
The system allows adding, removing, updating, searching, and sorting players.  
Data is stored using **dynamic memory allocation (`malloc` / `realloc`)** for unlimited expansion.

---

## 📌 **Features**
- ➕ Add new players  
- 🗑 Remove players  
- ✏️ Update runs, wickets & matches  
- 🔍 Search players (by jersey number or name)  
- 📊 Display all players  
- 🏆 Sort players by:
  - Highest Runs  
  - Highest Wickets  

---

## 🧱 **1️⃣ Data Model – Player Structure**

Each player contains:

| Field     | Description                          |
|-----------|--------------------------------------|
| jerseyNo  | Unique player ID / Jersey number     |
| name      | Full name of the player              |
| runs      | Total runs scored                    |
| wickets   | Total wickets taken                  |
| matches   | Total matches played                 |

---

## ⚙️ **2️⃣ Core Modules**

| Function Name         | Purpose                               |
|-----------------------|-----------------------------------------|
| `storePlayers()`       | Stores initial player records           |
| `addPlayer()`          | Adds a new player                       |
| `removePlayer()`       | Deletes player by jersey number         |
| `updatePlayer()`       | Updates runs, wickets, matches          |
| `searchPlayer()`       | Searches player by name or number       |
| `displayAll()`         | Displays all players                    |
| `displaySortedPlayers()` | Shows players sorted by performance   |

---

## 🧠 **Dynamic Memory Storage**

Players stored dynamically:

```c
struct Player* players = (struct Player*) malloc(n * sizeof(struct Player));
players = realloc(players, (count + 1) * sizeof(struct Player));
````

✔ Auto-expands when players are added
✔ Shrinks when players are deleted

---

## 🖥 **User Menu**

```
1. Add Player
2. Remove Player
3. Search Player
4. Update Player
5. Display All Players
6. Display Sorted Players
7. Exit
```

---

## 📂 **Source Code File**

```
player_management.c
```

---

## ▶ **How to Run**

### **1️⃣ Compile**

```
gcc player_management.c
```

### **2️⃣ Run**

#### Linux / Mac:

```
./a.out
```

#### Windows:

```
a.exe
```

---

## 📑 **Sample Output**

### Initial Entry Example

```
Enter number of players to store initially: 2

Enter details for Player 1
Jersey Number: 18
Name: Virat Kohli
Runs: 12000
Wickets: 5
Matches: 250
```

---

### Display Example

```
--- All Players ---
Player Id : 18
Name : Virat Kohli
Runs : 12000
Wickets : 5
Matches Played : 250
```

---

### Sorted Output Example

```
--- Sorted Players ---
Jersey No: 18 | Name: Virat Kohli | Runs: 12000 | Wickets: 5 | Matches: 250
Jersey No: 45 | Name: Rohit Sharma | Runs: 9000 | Wickets: 10 | Matches: 220
```

---

## 🛠 **Technology Stack**

| Component         | Details                 |
| ----------------- | ----------------------- |
| Language          | C Programming           |
| Memory Management | malloc, realloc, free   |
| Interface         | Console-based           |
| Sorting Algorithm | Bubble Sort             |
| Storage           | Dynamic Structure Array |

---

## 📜 **License**

This project is open-source and free to use.

---

## 👨‍💻 **Author**

**YASHRAJ Vadagave**
Player Management System – C Project

```


