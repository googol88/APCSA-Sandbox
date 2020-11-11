# Free Throw Record Simulator

## background

* The greatest free throw shooter in NBA history was Steve Nash, who made approximately 90% of his foul shots over the course of his 18 year career.
* The record for most consecutive free throws made is 97, by Michael Williams in 1993.

## todo

You will write a console program that simulates an elite free throw shooter (accuracy of 90%) shooting free throws until breaking the record number of shots in row.

## must have (please watch video for demo)

* must randomly assign hit or miss with 90% probability of hit.
* must keep track of:
  * total shots taken
  * current streak for simulated player
  * longest streak for the simulated player
* Only a single line of console output should be made for each simulated shot. It must include the following:
  * "HIT" or "MISS" result
  * The current streak (if player misses, streak should be 0)
  * The longest streak the simulated player achieved so far.
* The iteration must be controlled by a while loop. You can scrap the condition and starter code except for the sleep try/catch block.
* The given "sleep" code must execute once per shot attempt (you may adjust the time to your preference. We can use this time slow down the runtime and help us debug problems)
* after exiting the while loop print out how many total shots it took to break the record.