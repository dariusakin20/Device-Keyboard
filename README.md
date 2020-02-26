# Device Keyboard 

"We are developing a keyboard autocomplete algorithm to be used in various mobile devices. This algorithm will analyze the passages typed by the user in order to suggest a set of candidate autocomplete words given a word fragment.

We need you to write the algorithm that will learn the words typed by the user over time and then determine a ranked list of autocomplete candidates given a word fragment (you should ignore capitalization when providing suggestions). The algorithm will be trained in an online manner, meaning that additional training passages can be submitted and incorporated into the algorithm at the same time as the algorithm is being used to provide autocomplete suggestions. Ideally, the accuracy of the algorithm will improve over time as more and more training passages are incorporated. Due to the deployment environment for this algorithm, efficiency is critical. The data structure utilized by your algorithm should be optimized for space and time.

For the challenge, we need you to build a command line interface or graphical user interface that allows the interactive entry of training text and also allows the user to provide word fragments and get autocomplete suggestions in return. We have provided you with an interface specification [1] that we’d like you to implement, as well as a sample passage [2] and example inputs and outputs."

## Getting Started
Programmed in Java

Built in [Eclipse IDE](https://www.eclipse.org/ide/)

Converted to bash compatible using [Maven](https://maven.apache.org/)

## Running

To run it, open the file location on the cmd (Command Line) window and input mvn exec:java -Dexec.mainClass="Keyboard". This runs the main method of the code.


## Instructions

For this coding challenge, the user needs to input half written words so the program can output suggestions to them. To start I created a class called "Typing". This class Typing contains variables that hold the half completed words, the user input, the uses of the words, the confidences of the words, and the corrections. The Constructor outputs to the user to complete the sentence to see the auto complete keyboard and the sentence that needs to be completed. In getword() method, a while loop is inserted to make sure only correct inputs are put. The user is prompted to input a half written word such as "th" to get suggestions from the system. The user then inputs which word they mean and a if statement is there for the multiple conditions. Depending on whatever word the user picked the confidence for that word is increased and the sentence is changed. Next is to type "ne" which gives suggestions aswell. The confidence for whatever word increased too. Finally the user is prompted to input "th" again and depending on the confidence information obtained beforehand, outputs the word with the most confidence as the top choice. The sentence is then completed and the method getConfidence() shows every word used and the amount of times it was used. In the main method, the object "AutoComplete" is intialized and used to run all the methods.


## Authors

Darius Akinrimisi
