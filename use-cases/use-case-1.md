# USE CASE: 1 Produce a report on the salary of all employees

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *produce a report on the salary of all employees* so that *I can support financial reporting of the organisation*

### Scope

HR System.

### Level

Primary task.

### Preconditions

We know the role.  Database contains current employee salary data.

### Success End Condition

System generates and displays a report showing all employees with their current salary.

### Failed End Condition

Database connection fails or no data is available.

### Primary Actor

HR Advisor.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for all employees.
2. HR advisor captures the names to get salary information for.
3. HR advisor extracts current salary information of all employees.
4. HR advisor provides report to finance.

## EXTENSIONS

3a. **Database connection fails**:
    1. System shows an error message.
4a **No employees found** 
    2. System displays "No data available".

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
