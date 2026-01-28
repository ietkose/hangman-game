# CLI Hangman Game (Java)

A classic Hangman game designed to be played in the command line interface (CLI).
It features file handling to load words dynamically and displays ASCII art for the game state.

## Features

* **Dynamic Word Loading:** Reads the word list from an external `assets/words.txt` file.
* **ASCII Art:** Visual representation of the hangman using Java Text Blocks.
* **Input Handling:** Validates user input and tracks guessed letters.
* **Win/Loss Conditions:** Logic to determine the game outcome based on 6 allowed mistakes.

## Requirements

* **Java 15 or higher** (Required due to Text Blocks and Switch Expressions).

## Installation & Usage

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/ietkose/hangman-game.git
    ```

2.  **Verify File Structure:**
    Ensure the `assets` folder is in the same directory where you run the command.
    ```
    /Project-Folder
    ├── App.java
    └── assets/
        └── words.txt
    ```

3.  **Compile the Code:**
    ```bash
    javac App.java
    ```

4.  **Run the Game:**
    ```bash
    java App
    ```

## Customization

You can add your own words to the game!
* Open `assets/words.txt`.
* Add new words line by line.
* Restart the game.

## Tech Stack

* **Language:** Java
* **Libraries:** `java.io`, `java.nio`, `java.util`
