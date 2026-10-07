/*
1. Writing the Java Code
You write Java source code in a .java file using a text editor or IDE (e.g., Eclipse, IntelliJ, VS Code).

2. Compilation (javac)
The Java Compiler (javac) converts the .java source file into bytecode stored in a .class file.
Bytecode is platform-independent — it’s not machine code yet.

3. Class Loading
The Class Loader in the Java Virtual Machine (JVM) loads the .class file into memory.
It can load classes from:
Local file system
Network
JAR files
Class Loader types:
Bootstrap Class Loader (loads core Java classes from rt.jar)
Extension Class Loader (loads classes from ext directory)
Application Class Loader (loads classes from your project)

4. Bytecode Verification
The Bytecode Verifier checks:
No illegal code (e.g., accessing private memory directly)
No stack overflows/underflows
Correct method calls
This ensures security and stability before execution.

5. Execution by JVM
The Execution Engine runs the bytecode.
It has two main parts:
Interpreter
Reads and executes bytecode instructions one by one.
Slower for repeated code.
JIT Compiler (Just-In-Time)
Converts frequently used bytecode into native machine code for faster execution.
Stores compiled code in memory for reuse.

6. Runtime Environment
The Java Runtime Environment (JRE) provides:
JVM
Core libraries (e.g., java.lang, java.util)
Other runtime components
Garbage Collector (GC) automatically frees unused memory.

7. Output
The program runs and produces output:

Internal Flow Diagram

Copy code
Source Code (.java)
       ↓
Compilation (javac)
       ↓
Bytecode (.class)
       ↓
Class Loader
       ↓
Bytecode Verifier
       ↓
Execution Engine (Interpreter / JIT)
       ↓
Native Machine Code
       ↓
Output
✅ Key Points:

Java is platform-independent because bytecode runs on JVM, not directly on hardware.
JIT compilation makes Java faster over time.
Garbage Collection handles memory automatically.

 */
