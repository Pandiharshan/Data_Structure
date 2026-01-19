# Data Structures and Algorithms Practice

A comprehensive collection of Data Structures and Algorithms implementations in Java, organized by topic and difficulty level. This repository contains solutions to common DSA problems following the Striver's A2Z DSA Course structure.

## Tech Stack

- **Language**: Java
- **Development Environment**: Any Java IDE or text editor
- **Version Control**: Git

## Project Structure

```
├── Binary Search Tree/
│   ├── Easy/           # Basic BST operations and problems
│   ├── Medium/         # Intermediate BST problems (empty)
│   └── Hard/           # Advanced BST problems (empty)
├── Binary Tree/
│   ├── Easy/           # Basic binary tree problems (empty)
│   ├── Medium/         # Intermediate binary tree problems (empty)
│   ├── Hard/           # Advanced binary tree problems (empty)
│   └── PROGRESS_LOG.md # Progress tracking file
├── Graph/
│   ├── easy/           # Basic graph algorithms
│   ├── Medium/         # Intermediate graph problems (empty)
│   └── Hard/           # Advanced graph problems
├── Greedy/
│   ├── Easy/           # Basic greedy algorithm problems
│   ├── Medium/         # Intermediate greedy problems
│   ├── Hard/           # Advanced greedy problems
│   └── PROGRESS_LOG.md # Progress tracking file
└── Heap/
    ├── easy/           # Basic heap problems (empty)
    ├── Medium/         # Intermediate heap problems (empty)
    └── Hard/           # Advanced heap problems (empty)
```

## Implemented Features

### Binary Search Tree (11 implementations)
- Basic BST operations (search, insert, delete)
- Tree traversal and validation
- Finding ceil and floor values
- Lowest Common Ancestor (LCA)
- Kth smallest and largest elements
- Merging two BSTs
- Successor and predecessor finding

### Graph Algorithms (6 implementations)
- **Basic Traversals**: BFS and DFS implementations
- **Graph Representation**: Adjacency list representation
- **Topological Sorting**: DFS-based approach
- **Advanced**: Alien Dictionary problem (topological sort application)
- **Cycle Detection**: Kahn's algorithm implementation

### Greedy Algorithms (20 implementations)
- **Easy Problems**: Cookie assignment, coin change, parenthesis validation, knapsack
- **Medium Problems**: Interval merging, job scheduling, jump games, meeting rooms
- **Hard Problems**: Candy distribution problem
- **System Design**: LRU cache implementation, CPU scheduling algorithms

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Running Individual Solutions

1. Navigate to the specific problem directory
2. Compile the Java file:
   ```bash
   javac FileName.java
   ```
3. Run the compiled class:
   ```bash
   java ClassName
   ```

### Example
```bash
cd "Binary Search Tree/Easy"
javac BinarySearchTree.java
java Main
```

Most files include a `main` method with sample test cases for immediate execution.

## Code Structure

Each implementation follows a consistent pattern:
- **Solution Class**: Contains the main algorithm implementation
- **Helper Classes**: TreeNode, ListNode, or other data structure definitions when needed
- **Main Method**: Includes test cases and driver code
- **Input/Output**: Scanner-based input for interactive testing

## Use Cases

- **Interview Preparation**: Practice common DSA problems asked in technical interviews
- **Competitive Programming**: Reference implementations for contest problems
- **Learning Resource**: Understand algorithm implementations with working code
- **Academic Study**: Supplement coursework with practical implementations

## Current Status

### Completed Topics
- **Binary Search Tree**: 11/11 easy problems implemented
- **Graph**: 5 easy + 1 hard problem implemented
- **Greedy**: 9 easy + 11 medium + 1 hard problems implemented

### In Progress
- Binary Tree implementations (structure ready)
- Heap data structure problems (structure ready)
- Medium and Hard level problems for existing topics

## Limitations

- No automated test suite or unit tests
- Limited documentation within individual files
- Some duplicate files exist (e.g., FractionalKnapsackProblem.java appears twice)
- Progress logs are currently empty
- No build automation or dependency management
- Medium and Hard sections for some topics are incomplete

## Future Improvements

- Add comprehensive test cases for all implementations
- Implement remaining problems in Binary Tree and Heap sections
- Add time and space complexity analysis for each solution
- Create automated testing framework
- Add more detailed inline documentation
- Implement solutions for Medium and Hard difficulty levels
- Add problem statements and explanations

## Author

**Pandiharshan**
- GitHub: [@Pandiharshan](https://github.com/Pandiharshan)
- Repository: [Data_Structure](https://github.com/Pandiharshan/Data_Structure.git)

## Contributing

This is a personal practice repository. Feel free to fork and use for your own learning purposes.