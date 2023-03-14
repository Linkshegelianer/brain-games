
## Game logic

The app consists of three parts: App class, Game classes + Cli class and Engine class.

* App class contains main() through which different game methods can be invoked depending on the console input.
* There are five game classes (Calc, Even, Gcd, Prime, Prog) + Cli class containig simple greeting logic. Each math-based games have the same logic: randomly generate a question and recieve an answer from the user.
  * If the answer is correct, the loop continues until the counter reaches 3. After this, the user is congratulated and the game ends.
  * If the answer is incorrect, the game is ended depicting the correct answer. 

In every game class, we use matrix String[][] questionsAnswers to store:
* iterable for three unique questions for one session in a first row;
* in the first index of the second row store the randomly generated question;
* in the second index of the second row store the answer to this question.

In order to avoid repetition, the verification algorithm is written in the Engine class, which receives the matrix containing questions and answers and a task from every game.
