CREATE OR REPLACE PROCEDURE give_raise(emp_id IN NUMBER, pct IN NUMBER) IS
BEGIN
    UPDATE employees SET salary = salary + (salary * pct / 100) WHERE emp_id = emp_id;
    COMMIT;
END;
/

CREATE OR REPLACE FUNCTION get_yearly_salary(emp_id IN NUMBER) RETURN NUMBER IS
    sal NUMBER;
BEGIN
    SELECT salary INTO sal FROM employees WHERE emp_id = emp_id;
    RETURN sal * 12;
END;
/
