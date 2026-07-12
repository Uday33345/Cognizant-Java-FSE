DECLARE
    CURSOR c1 IS SELECT emp_id, name, salary FROM employees;
    v_id employees.emp_id%TYPE;
    v_name employees.name%TYPE;
    v_sal employees.salary%TYPE;
BEGIN
    OPEN c1;
    LOOP
        FETCH c1 INTO v_id, v_name, v_sal;
        EXIT WHEN c1%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(v_id || ' ' || v_name || ' ' || v_sal);
    END LOOP;
    CLOSE c1;
END;
/
