CREATE TABLE IF NOT EXISTS EMP_NEW (
  first_name STRING,
  middle_name STRING,
  last_name STRING
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'
STORED AS TEXTFILE;

LOAD DATA LOCAL INPATH '/home/cloudera/Documents/workspaces/icp5/csvs/' INTO TABLE EMP_NEW;

SELECT COUNT(*) FROM EMP_NEW;