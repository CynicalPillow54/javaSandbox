# Challenge: Weather Analysis

## Weather Reporting 

 You have been asked to write a Java program to analyse the following weather stats.

 |            | Day 1 | Day 2 | Day 3 | Day 4 | Day 5 |
|------------|-------|-------|-------|-------|-------|
|            | ☀     | 🌧     | ☁     | 🌥     | 🌧     |
| Temerature | 15.5  | 10.5  | 16.0  | 12.5  | 17.0  |


The output is expected to look like this :

```text
Weather analysis
____________________________________
Day 1 
Temp     : 15.5 
Sun      : true
Above average Temp
____________________________________
Day 2 
Temp     : 10.5 
Sun      : false
____________________________________
Day 3 
Temp     : 16.0 
Sun      : true
Above average Temp
____________________________________
Day 4 
Temp     : 12.5 
Sun      : true
____________________________________
Day 5 
Temp     : 17.0 
Sun      : false
Above average Temp
____________________________________

Overall stats
Average temp              : 14.3
Number of days of sun     : 3
```

Hints : 

Getting started. You'll first need to store the data. Pick suitable variable types for temperature and sun (where sun is considered true if there was any sunshine during the day - hint boolean).

```
double tempDay1, ...
boolean sunDay1, ...
```

To selectively output if the day was Above average Temp you'll need to first calculate the average temp for the week (another var needed) and then compare that to each day's temp. if statement will be useful there.

You'll also need to keep a total var for the total number of days of sun (another variable). Another question / decision to ask so another if statement.

Remember to comment and indent your code. 

Use tabs, new lines, etc to make the output align as shown. 