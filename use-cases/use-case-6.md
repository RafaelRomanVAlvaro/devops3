# USE CASE: 6 View an employee’s details

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR advisor* I want *to view an employee’s details* so that *the employee’s promotion request can be supported.*

### Scope
HR system.

### Level
Primary task.

### Preconditions
The employee exists in the database.

### Success End Condition
The employee’s details are displayed to the HR advisor.

### Failed End Condition
The system cannot find or display the employee’s information.

### Primary Actor
HR Advisor.

### Trigger
An HR advisor searches for or selects an employee.

## MAIN SUCCESS SCENARIO
1. The HR advisor opens the “View Employee” page.
2. The HR advisor searches for an employee by ID or name.
3. The system retrieves the employee’s details.
4. The system displays the information on screen.
5. The HR advisor reviews the employee’s details.

## EXTENSIONS
3a. **Employee not found**  
 1. The system displays “No employee found.”

4a. **Database error**  
 1. The system shows an error message.

## SUB-VARIATIONS
None.

## SCHEDULE
**DUE DATE:** Release 1.0