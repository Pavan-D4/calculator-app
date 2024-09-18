# Define the compiler
CC = gcc

# Compiler flags (optional)
CFLAGS = -Wall -g

# Define the target executable name
TARGET = cal.exe

# Default rule to build the executable
all: $(TARGET)

# Rule to link the object file and create the executable
$(TARGET): Calculator.o
	$(CC) -o $(TARGET) Calculator.o

# Rule to compile the C source file into an object file
Calculator.o: Calculator.c
	$(CC) $(CFLAGS) -c Calculator.c

# Clean up by removing the object files and the executable
clean:
	rm -f *.o $(TARGET)

