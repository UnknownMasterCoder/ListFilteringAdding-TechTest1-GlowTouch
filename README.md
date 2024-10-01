# ListFilteringAdding-TechTest1-GlowTouch

> ## List Add - Java Technical Test

This is a Java program that adds a filtered array to an existing list. The filtering process removes duplicate elements from the array before adding them to the list.

> ## Technologies Used

- **Java**: 17

> ## Problem Statement - Project Requirements

Please write a method based on the following requirements:

1. The method should take a List and an Object array as arguments.
2. The method should add the contents of the array to the list.
3. If either the list or the array are null, the method should throw an IllegalArgumentException.
4. If the array has any duplicate objects, they should be filtered out. For example, if the array has two Strings 'abc', only a single 'abc' should be added to the list

> ## Solution
The solution is implemented in a single class, `ListAddTechTest`, which includes:

- A main method that defines test data and prints the results.
- A method to add the filtered array to the list (`addToList`).
- A method to filter duplicates from the array (`filterArrayDuplicates`).

> ## Requirements

- **Java 11** or higher.

> ## How to Run the API

1. **Clone the repository:**

   ```bash
   git clone https://github.com/UnknownMasterCoder/ListFilteringAdding-TechTest1-GlowTouch.git
   cd ListFilteringAdding-TechTest1-GlowTouch
   
2. **Compile the java file:**
   ```bash
   javac src/ListAddTechTest.java
   
3. Run the program
   ```bash
   java -cp src ListAddTechTest

> ## File Structure
Here is the files structure of the project in IntelliJ IDEA:

   ```css
   src
   └── ListAddTechTest.java

> ## Class Diagram
Here is a simple architecture overview of the Java Class:

![Class Diagram](/docs/ClassDiagram.png "Class Diagram")

- **main:** defines test data and prints the results.
- **addToList:** add the filtered array to the list.
- **filterArrayDuplicates:** filter duplicates from the array.

> ## Example Usage

### Input

   ```markdown
   List: ["test", "aaa", 4, "err", "temp", 6, "xyz"]
   Array: [9, 2, 3, "acb", 3, 5, "acb", 2, 7, "empty", "empty", 8, 8, 2, "acb", 1, 1, 1]

![Class](/docs/Code_TechTest1.png "Class")

### Output

   ```markdown
   List: ["test", "aaa", 4, "err", "temp", 6, "xyz"]
   Array: [9, 2, 3, "acb", 3, 5, "acb", 2, 7, "empty", "empty", 8, 8, 2, "acb", 1, 1, 1]

![result](/docs/Result_TechTest1.jpg "result")

> ## Author

This project was developed as part of a technical test by:
- **PEDRO MAYORGA** (UnknownMasterCoder) - _Initial work_
- [LinkedIn](https://linkedin.com/in/PedroMayorga)
- [GitHub](https://github.com/UnknownMasterCoder)
