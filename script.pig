data =
    LOAD 'input'
    AS (query:CHARARRAY);
limited = LIMIT data $n;
STORE limited INTO 'output';