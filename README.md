The concept of abstract classes can be seen in the classes 'Food', and its subclasses 'Apple' and 'Strawberry'. 
- 'Food' is an abstract class because it represents the general concept of a food item in the game, but does not specify how each food behaves.
- 'Apple' and 'Strawberry' are specific types of food, which makes them the subclass providing their own implementation of the move() method.
- Adding these classes make sense because all food items in the game should behave similarly in some ways, but each type of food could have its own unique behaviour.

Polymorphism can be seen in the class 'MyWorld' under the method 'createFood()'.
- Polymorphism means having many forms, it can be seen that 'food' can either "take form" of a 'new Apple()' or a 'new Strawberry()'.
- This method uses a random number to determine whether the new food created will be an 'Apple' or a 'Strawberry'.
- This method makes sense because it simplifies the code and allows the game to easily add more food types without needing to change the logic in 'MyWorld'.

Overriding is used in the classes 'Food', 'Apple' and 'Strawberry'. 
- All three classes include a method called 'move()'. The difference is that the method in 'Food' is empty but in the classes 'Apple' and 'Strawberry' the methods are defined. This will override the empty 'move()' method in the class 'Food'.

Interfaces can be seen in the class 'Bear' that implements the destructable interface.
- The 'destruct()' method in 'Bear' defines how the bear can interact with food objects like 'Apple' and 'Strawberry', which includes removing the food from the world and updating the score.
- By using the 'Destructable' interface, the bear's destruction behaviour can be easily extended to other types of objects if needed.
