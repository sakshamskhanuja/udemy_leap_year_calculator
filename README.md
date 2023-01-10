## Leap Year Calculator

### Description

Write a method <b>isLeapYear</b> with a parameter of type <b>int</b> named <b>year</b>. The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return <b>false</b>. Otherwise, if it is in the valid range, calculate if the year is a leap year and return <b>true</b> if it is a leap year, otherwise return <b>false</b>.

To determine whether a year is a leap year, follow these steps: 

1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return <b>true</b>.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return <b>false</b>.

### Examples of input/output

<ul>
<li>isLeapYear(-1600); → should return <b>false</b> since the parameter is not in range (1-9999)</li>
<li>isLeapYear(1600); → should return <b>true</b> since 1600 is a leap year</li>
<li>isLeapYear(2017); → should return <b>false</b> since 2017 is not a leap year</li>
<li>isLeapYear(2000);  → should return <b>true</b> because 2000 is a leap year </li>
</ul>
