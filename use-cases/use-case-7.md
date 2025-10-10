# USE CASE: 7 Update an employee’s details

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR advisor* I want *to update an employee’s details* so that *the employee’s information is kept up-to-date.*

### Scope
HR system.

### Level
Primary task.

### Preconditions
The employee exists in the database, and the HR advisor has permission to update details.

### Success End Condition
The employee’s information is successfully updated.

### Failed End Condition
Changes are not saved due to invalid input or a database error.

### Primary Actor
HR Advisor.

### Trigger
The HR advisor needs to correct or change employee information.

## MAIN SUCCESS SCENARIO
1. The HR advisor searches for an employee.
2. The system retrieves and displays the employee’s current details.
3. The HR advisor edits the required fields.
4. The HR advisor submits the changes.
5. The system validates and saves the updates.
6. The system confirms the update is successful.

## EXTENSIONS
3a. **Invalid data entered**  
 1. The system highlights invalid fields and prevents saving.

5a. **Database connection fails**  
 1. The system displays an error message.

## SUB-VARIATIONS
None.

## SCHEDULE
**DUE DATE:** Release 1.0
