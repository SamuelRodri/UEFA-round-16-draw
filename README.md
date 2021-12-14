# UEFA-round-16-draw
A program that simulates a round 16 draw of UEFA Champions League

A simple joke simulator of the UEFA round 16 draw. You can add some clubs in two different groups (Winners and Runners-Up) and the software make a simple draw following the two rules imposed by UEFA:
  - Two clubs from the same country cannot face each other.
  - Two clubs from the same group stage (A, B, C, D, E, F, G, H) cannot face each other.
  
 The process is the following:
    1. The groups are randomized
    2. The software take a club out of Runners-Up and get the potential rivals fulfilling the above conditions.
    3. The software get a rival.
    4. Repeat steps 2 and 3 until there are no more clubs.
    
 The simulator fails in a specific case. When a club is drawn sometimes a potential rival must be discarded to avoid that the conditions are not met with the remaining clubs. The software does not meet this condition.
 
 Feel free to edit and improve this code and try to fix the problem with it.
 
