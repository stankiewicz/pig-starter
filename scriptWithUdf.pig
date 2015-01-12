register ./dist/pig-udf.jar
data =
    LOAD 'input'
    AS (query:CHARARRAY);
transformed = FOREACH data GENERATE pl.stankiewicz.bigdata.starter.pig.MyUdf(query);
limited = LIMIT transformed $n;
STORE limited INTO 'output';