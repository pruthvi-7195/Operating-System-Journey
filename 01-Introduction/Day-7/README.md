# Day 7 - Priority Scheduling

## Topics Covered

* Priority Scheduling
* Preemptive Priority Scheduling
* Non-Preemptive Priority Scheduling
* Starvation
* Aging

## Program

PriorityScheduling.java

## Learning Outcome

* Learned how Priority Scheduling works.
* Understood starvation and aging.
* Compared FCFS, SJF, and Priority Scheduling.
* Implemented Priority Scheduling in Java.

## Example

Priority Table:

P1 → Priority 3

P2 → Priority 1

P3 → Priority 4

P4 → Priority 2

Execution Order:

P2 → P4 → P1 → P3

## Key Takeaway

Priority Scheduling executes important processes first but may cause starvation. Aging is used to solve this problem.

## Program Output

```text
Execution Order:

P2 Priority = 1
P4 Priority = 2
P1 Priority = 3
P3 Priority = 4
```
