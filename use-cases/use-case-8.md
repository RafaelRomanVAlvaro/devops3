# USE CASE: 8 Delete an employee’s details

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR advisor* I want *to delete an employee’s details* so that *the company is compliant with data retention legislation.*

### Scope
HR system.

### Level
Primary task.

### Preconditions
The employee exists in the database, and the HR advisor has permission to delete records.

### Success End Condition
The employee’s details are permanently removed from the database.

### Failed End Condition
The employee’s details remain due to an error or missing permissions.

### Primary Actor
HR Advisor.

### Trigger
The employee leaves the organisation and their data must be deleted.

## MAIN SUCCESS SCENARIO
1. The HR advisor searches for the employee.
2. The system retrieves and displays the employee’s details.
3. The HR advisor confirms deletion.
4. The system removes the employee’s data from the database.
5. The system confirms deletion was successful.

## EXTENSIONS
3a. **Deletion cancelled**  
 1. The HR advisor cancels the action, and the data remains intact.

4a. **Database connection fails**  
 1. The system displays an error message and logs the issue.

## SUB-VARIATIONS
None.

## SCHEDULE
**DUE DATE:** Release 1.0