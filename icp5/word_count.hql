drop table IF EXISTS FILES;

create table FILES(line STRING);

SHOW TABLES;

LOAD DATA LOCAL INPATH '/home/cloudera/Documents/workspaces/icp5/thinkbig-hive-tutorial/data/shakespeare/input/' INTO TABLE FILES;

CREATE TABLE word_counts AS
SELECT word, count(1) AS count FROM
(SELECT explode(split(line, ' ')) AS word FROM FILES) w
GROUP BY word
ORDER BY word;

SELECT * FROM word_counts;




