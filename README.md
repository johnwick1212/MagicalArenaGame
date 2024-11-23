Magical Arena Game


Welcome to the Magical Arena Game! This project is a simulation of a fantasy battle arena where two players engage in combat until one emerges victorious. Players use their health, strength, and attack power, along with dice rolls, to attack and defend. The goal is to reduce the opponent's health to zero by strategically overpowering them.

Files Overview


-----------------------Arena.java------------------------------

The core of the game, this file represents the arena where the battle takes place. It handles:

-> The sequence of turns between the two players.
-> Calculations for attacking and defending based on dice rolls and player attributes.
-> Logic to determine the winner when one player’s health reaches zero.
-> This file ensures the game mechanics run smoothly, simulating each turn and displaying the results.


------------------------Player.java-----------------------------

This file defines the Player object and encapsulates its attributes and actions:

Attributes:
 -> health: The player’s life points, which decrease during the battle.
 -> strength: Determines how much damage the player can defend.
 -> attack: Defines the offensive power for attacking.

Actions:
 -> Updates health based on incoming damage.
 -> Tracks whether the player is still alive or defeated.
 -> Each player is a unique instance created from this class, with their own stats and abilities.


-------------------------Dice.java-------------------------------

This file adds the randomness that makes the game unpredictable and exciting. It:

 -> Simulates a six-sided dice roll with values between 1 and 6.
 -> Is used by both the attacker and the defender during their respective turns to calculate their impact.
 -> The randomness from this class keeps the gameplay fresh and engaging.


---------------------MagicalArenaGame.java------------------------

This is the starting point of the game. It:

 -> Creates the players and initializes their stats.
 -> Sets up the arena and starts the game.
 -> Coordinates the turns and ensures the correct sequence of attacks and defenses.
 -> Displays detailed updates about dice rolls, health changes, and the final result.
 -> This file ties everything together and drives the gameplay.



-----------How to Run the Game-----------------------

To play the game, follow these steps:


Compile the Code: Navigate to the src directory in your terminal and compile all files:
   - javac files/*.java


Run the Game: Start the game using:
   - java files.MagicalArenaGame


Watch the battle unfold in the terminal as players take turns attacking and defending!