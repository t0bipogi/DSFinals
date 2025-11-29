# Project Assessment Rubric

**Project:** Data Structures Finals
**Section:** C2A
**Course:** Data Structures

## Grading Breakdown

### 1. Data Structure Completeness & Implementation (50%)

**Score:** 25/50

| Data Structure | Implementation    | Functions                                       | Notes                               |
| -------------- | ----------------- | ----------------------------------------------- | ----------------------------------- |
| ArrayList      | **Java Built-in** | add, addFirst, addAt, search*, sort*, clear     | Uses java.util.ArrayList            |
| LinkedList     | **Java Built-in** | addLast, addFirst, addAt, search*, sort*, clear | Uses java.util.LinkedList           |
| Stack          | **Java Built-in** | push, search*, sort*, clear                     | Uses java.util.Stack                |
| Queue          | **Java Built-in** | offer (enqueue), search*, sort*, clear          | Uses LinkedList as queue            |
| Tree           | **Java Built-in** | add, search\*, clear                            | Uses java.util.TreeSet (auto-sorts) |

_\* = Manual implementation (not using built-in methods)_

**Deductions:**

- -20: Uses Java built-in ArrayList, LinkedList, Stack, Queue, TreeSet instead of custom implementations
- -5: Tree uses TreeSet (not a proper BST implementation with nodes)

**Positive Notes:**

- Manual search implemented (linear traversal, not using built-in contains/indexOf)
- Manual sort implemented (bubble sort for ArrayList, LinkedList, Stack)
- All required functions present (add at end, start, index, search, sort, clear)

### 2. Visualization (30%)

**Score:** 25/30

- Shows current contents before each operation menu
- Uses `System.out.println("Current: " + list)` for visualization
- Clear menu-driven interface
- -5: Basic visualization, just prints the collection state

### 3. Short Paper (20%)

**Score:** 0/20

- **No short paper submitted**
- No .txt, .pdf, or .docx reflection file found

---

## Final Grade: **50/100**

### Summary

The implementation uses Java's built-in data structures instead of creating custom classes from scratch as required. While manual search and sort functions are implemented (not using built-in methods), the core requirement of implementing the data structures themselves was not met. No reflection paper was submitted.

### Recommendations

- Implement custom ArrayList, LinkedList, Stack, Queue, and BST classes without using java.util
- Submit a short paper reflecting on the implementation experience

---

_Assessment generated on November 29, 2025_
