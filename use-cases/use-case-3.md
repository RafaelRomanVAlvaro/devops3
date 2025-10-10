# USE CASE: 3 Produce a report on the salary of employees in my department

## CHARACTERISTIC INFORMATION

### Goal in Context
As a *department manager* I want *to produce a report on the salary of employees in my department* so that *I can support financial reporting for my department.*

### Scope
Department management system.

### Level
Primary task.

### Preconditions
The manager is logged into the HR system and manages an existing department.

### Success End Condition
The manager successfully generates a salary report for their department.

### Failed End Condition
The system fails to generate the report due to a missing department, data issue, or system error.

### Primary Actor
Department Manager.

### Trigger
The department manager requests a salary report for their team.

## MAIN SUCCESS SCENARIO
1. The department manager logs into the HR system.
2. The manager selects their department.
3. The system retrieves all employees within the department and their current salaries.
4. The system generates a report displaying the data.
5. The manager reviews and saves the report.

## EXTENSIONS
3a. **Department has no employees**  
 1. The system displays “No employees found in this department.”

3b. **Database connection fails**  
 1. The system displays an error message and logs the issue.

## SUB-VARIATIONS
None.

## SCHEDULE
**DUE DATE:** Release 1.0
