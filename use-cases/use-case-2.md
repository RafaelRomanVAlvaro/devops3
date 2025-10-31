# USE CASE: 2 Produce a report on the salary of employees in a department

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to produce a report on the salary of employees in a department* so that *I can support financial reporting of the organisation.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know which department each employee belongs to.

### Success End Condition

A report is available for HR to provide to finance.

### Failed End Condition

No report is produced due to failed database connection or no data produced.

### Primary Actor

HR Advisor.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for employees in a particular department.
2. HR advisor captures the specific department for each employee to get salary information for employees in that department.
3. HR advisor extracts current salary information of all employees from a specific department.
4. HR advisor provides report to finance.

## EXTENSIONS

3a. **Department is closed**:
    1. No employees exist in that department anymore.
3b **Database failed to connect**
    2. System failed to connect to the database.
3c **Failure to produce data** 
    3. The system fails to produce any form of data.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
