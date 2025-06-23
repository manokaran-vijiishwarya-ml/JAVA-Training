# JDB Debug


Refer the below url for detailed explanation: https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/jdb.html

1. Compile your Java file with debugging information
javac -g Even.java
2. Start your Java program with remote debugging enabled (socket)
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 Class_Name
3. In a new terminal, attach jdb to the running program
jdb -attach 5005
This line connects the debugger to the program
4. Set breakpoints
At the jdb terminal, you can set a breakpoint, for example at line 10:
stop at Even:1
5. Start program execution
At the jdb prompt, type: cont
This continues execution until a breakpoint is hit
6. Use debugger commands as needed
next — step to next line
step — step into methods
print <variable> — print variable value
cont — continue execution
7. To Quit : give exit
