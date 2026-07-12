CREATE OR REPLACE PACKAGE emp_pkg IS
    PROCEDURE add_emp(id NUMBER, name VARCHAR2, sal NUMBER);
    FUNCTION get_sal(id NUMBER) RETURN NUMBER;
END emp_pkg;
/

CREATE OR REPLACE PACKAGE BODY emp_pkg IS
    PROCEDURE add_emp(id NUMBER, name VARCHAR2, sal NUMBER) IS
    BEGIN
        INSERT INTO employees VALUES(id, name, sal);
        COMMIT;
    END;

    FUNCTION get_sal(id NUMBER) RETURN NUMBER IS
        s NUMBER;
    BEGIN
        SELECT salary INTO s FROM employees WHERE emp_id = id;
        RETURN s;
    END;
END emp_pkg;
/
