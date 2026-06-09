# Day 6 - Shortest Job First (SJF)

## Topics Covered

* Shortest Job First (SJF)
* Starvation
* SJF Advantages and Disadvantages
* Waiting Time Calculation
* Turnaround Time Calculation

## Program

SJFScheduling.java

## Learning Outcome

* Learned SJF Scheduling Algorithm.
* Understood why SJF minimizes average waiting time.
* Learned the concept of starvation.
* Implemented SJF Scheduling using Java.

## Example

Processes:

P1 = 6

P2 = 2

P3 = 8

P4 = 3

Execution Order:

P2 → P4 → P1 → P3

## Key Takeaway

SJF is considered one of the most efficient scheduling algorithms because it minimizes average waiting time, but it may lead to starvation of longer processes.

## Program Output

```text
BT WT TAT

2  0  2
3  2  5
6  5 11
8 11 19
```
