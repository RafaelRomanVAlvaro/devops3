# USE CASE: 5 Add a new employee’s details

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR advisor* I want *to add a new employee’s details* so that *I can ensure the new employee is paid.*

### Scope
HR system.

### Level
Primary task.

### Preconditions
The HR advisor is logged in and has permission to add employees.

### Success End Condition
The new employee’s details are successfully stored in the database.

### Failed End Condition
Employee details are not saved due to missing data or system error.

### Primary Actor
HR Advisor.

### Trigger
A new employee joins the organisation.

## MAIN SUCCESS SCENARIO
1. The HR advisor opens the “Add Employee” form.
2. The HR advisor enters the employee’s personal and job details.
3. The HR advisor submits the form.
4. The system validates and saves the employee’s details in the database.
5. The system confirms that the new employee has been added.

## EXTENSIONS
2a. **Incomplete details entered**  
 1. The system highlights missing or invalid fields.

4a. **Database connection fails**  
 1. The system displays an error message and logs the issue.

## SUB-VARIATIONS
None.

## SCHEDULE
**DUE DATE:** Release 1.0