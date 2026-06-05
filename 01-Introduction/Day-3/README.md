# Day 3 - Processes and PCB

## Topics Covered

- Process
- Components of a Process
- Process States
- Process Control Block (PCB)

## Program

ProcessStateSimulator.java

## Learning Outcome

- Learned what a process is.
- Understood process life cycle.
- Learned Process Control Block (PCB).
- Simulated process state transitions using Java.

## Process Life Cycle

NEW → READY → RUNNING → WAITING → READY → RUNNING → TERMINATED

## Program Output

```text
Process Created
State : NEW

Process moved to READY state

CPU Assigned
State : RUNNING

Waiting for I/O
State : WAITING

Back to READY

CPU Assigned Again
State : RUNNING

Execution Completed
State : TERMINATED
```
