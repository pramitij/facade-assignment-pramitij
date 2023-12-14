[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10843256&assignment_repo_type=AssignmentRepo)
# Welcome to the course CSYE6200 - Object Oriented Design
> Northeastern University, College of Engineering


## Professor: Daniel Peters

### Requirements
1. Eclipse or VS Code or IntelliJ.

Note: If you are using Eclipse, please have git CLI installed on your system or GitHub Desktop to commit the code in this repository

### SetUp Instructions
1. Please clone the repository on your local system
2. For Eclipse Import the project as Existing Maven Project, For IntelliJ you can directlty open it using 'Get from VCS'.
4. All code should be pushed to the main branch
3. Ensure the GitHub actions are successful post push

Submissions will have deadlines, failed GitHub Actions would result in point deductions.

### References
1. Cloning a Repository: <https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository>
2. Any GitHub Setup: Please refer to the Git & GitHub Fundamentals Repository shared to you by your respective TA and refer the README.md section

Please reach out to your respective TA if you need any help in regards with submission/ GitHub

Author:
- Aditya Mulik (mulik.a@northeastern.edu)
- Sai Akhil Vemula (vemula.v@northeastern.edu)

### Assignmet Data
Facade pattern Assignment:

Click here to access your repoLinks to an external site.

Using Java code to read and write files,

Use the Facade Pattern to Implement a simple API for saving program data to file (SSD or disk) which can be loaded at any later time using the following high level API for your Facade:

void save(List<String> programData);

List<String> programData load();

Above Facade API can be used with a Roster (list of registered students) application to save all registered students so a subsequent invocation does not have to re-register each student.