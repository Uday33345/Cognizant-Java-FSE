CREATE OR REPLACE TRIGGER after_salary_update
AFTER UPDATE OF salary ON employees
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Salary changed from ' || :OLD.salary || ' to ' || :NEW.salary);
END;
/
