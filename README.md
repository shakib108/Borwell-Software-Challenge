# Borwell-Software-Challenge
Borwell Software Challenge By Mohammed Belal

This is my attempt at the Borwell Software Challenge to apply for a year's internship position at Borwell. As advised on the website, I have spent 4 hours on this project. I decided to use Java with Maven to complete this project.

Please note that the times in the git commit history may not reflect that as I ran into some issues with getting the JUnit tests to run outside of my IDE. However, I have resolved this by creating this new repository with a Maven-friendly structure, and copying the commits over to this new repository.

<h2>Running the Project</h2>

<h3>To Run</h3>

1. Make sure you have Maven installed
2. Pull the files from the repository OR copy the files manually to your machine
3. Open a terminal and `cd` to the location you have stored all the files in
4. Run `mvn compile`
5. Run `mvn exec:java -Dexec.mainClass=com.mycompany.app.PaintCalc` to run the program. 

<h3>To Test</h3>

1. `cd` to the root folder
2. Run `mvn test`

<h2>How I Developed this Project</h2>

I used a test driven development (TDD) approach when creating this project. I wrote some initial tests and wrote the program to eventually pass these tests. I also added more tests as needed, when I felt like it is reasonable to add more features to the application. 

My plan was to create a simple version of the paint calculator first; one that assumes the room is a rectangular prism of some size. This assumption makes the calculations easier and removes edge cases. Then I planned to expand the programs functionality to be able to handle rooms of different shapes. Unfortunately, due to the time restriction I set myself, I did not get to this part. If I had more time to complete this project I would work to add in these features.

Please feel free to have a look at the commit history for both the main class and the test class to get an insight into the development process. I have done my best to implement a TDD approach and to test as many things as I saw relevant for the aim of the project.

If I had more time, I would add functionality for rooms of different shapes and even custom shapes. I would also consider adding another output which shows the cost of paint required to complete the paint job, as this fits the scenario of this program.

I would appreciate any feedback on this project and to discuss how I can improve on my work. I look forward to hearing from you soon.

  
