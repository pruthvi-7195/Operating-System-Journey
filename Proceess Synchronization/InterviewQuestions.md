1. What is Process Synchronization?

Answer:
Process Synchronization is the mechanism used to coordinate multiple processes or threads that access shared resources, ensuring data consistency and preventing conflicts.

Interview One-Liner:

Process Synchronization ensures that multiple processes or threads access shared resources in a controlled and coordinated manner.

2. What is a Critical Section?

Answer:
A Critical Section is the part of a program where shared resources (variables, files, memory, etc.) are accessed or modified.

Only one process/thread should execute its critical section at a time to avoid data inconsistency.

Example:

count++;

If multiple threads execute this statement simultaneously, incorrect results may occur.

Interview One-Liner:

A Critical Section is the code segment where shared resources are accessed and therefore requires controlled access.

3. What is a Race Condition?

Answer:
A Race Condition occurs when multiple processes or threads access and modify shared data simultaneously, and the final output depends on the order of execution.

Example:

Initial Count = 0

Thread 1 reads count = 0
Thread 2 reads count = 0

Thread 1 increments to 1
Thread 2 increments to 1

Expected Count = 2
Actual Count = 1

Interview One-Liner:

A Race Condition occurs when multiple threads access shared data concurrently, leading to unpredictable results.

4. Why does a Race Condition occur?

Answer:
A Race Condition occurs because multiple threads access and update shared resources simultaneously without proper synchronization.

Reasons:

Shared resource access
Concurrent execution
Lack of synchronization mechanisms

Interview One-Liner:

Race Conditions occur due to unsynchronized concurrent access to shared resources.

5. What are the three requirements of a Critical Section solution?

Answer:

1. Mutual Exclusion

Only one process/thread can enter the Critical Section at a time.

2. Progress

If no process is in the Critical Section, a waiting process should be allowed to enter without unnecessary delay.

3. Bounded Waiting

Every process gets a fair chance to enter the Critical Section within a limited waiting period.

Interview One-Liner:

The three requirements are Mutual Exclusion, Progress, and Bounded Waiting.

6. What is Mutual Exclusion?

Answer:
Mutual Exclusion ensures that only one process or thread can access a shared resource at a time.

This prevents data corruption and race conditions.

Example:

Thread 1 enters Critical Section

Thread 2 waits

Thread 1 exits

Thread 2 enters

Interview One-Liner:

Mutual Exclusion guarantees exclusive access to a shared resource by one process at a time.

7. What is Bounded Waiting?

Answer:
Bounded Waiting guarantees that every process waiting for a Critical Section will eventually get access after a finite number of turns.

It prevents starvation.

Example:

P1 Waiting
P2 Waiting
P3 Waiting

Eventually all will execute.

Interview One-Liner:

Bounded Waiting ensures no process waits indefinitely to enter the Critical Section.

8. What problems arise without synchronization?

Answer:
Without synchronization, the following issues may occur:

Race Condition

Incorrect updates to shared data.

Data Inconsistency

Different threads see different values.

Lost Updates

One thread's update overwrites another's.

Unpredictable Results

Program output changes from run to run.

Resource Corruption

Shared resources become invalid or corrupted.

Interview One-Liner:

Without synchronization, systems may suffer from race conditions, data inconsistency, lost updates, and unpredictable behavior.

Most Important Placement Question
Q. What is the difference between Race Condition and Critical Section?

Answer:

Critical Section	Race Condition
A code segment where shared resources are accessed	A problem caused by concurrent access to shared resources
Requires protection	Occurs when protection is absent
Part of the program	Undesired outcome

Interview One-Liner:

A Critical Section is the code that accesses shared data, while a Race Condition is the problem that occurs when that code is executed concurrently without proper synchronization.
