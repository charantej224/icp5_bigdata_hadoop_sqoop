
CREATE TABLE IF NOT EXISTS STOCKS_PRICES (
  stock_date DATE,
  stock_price_open FLOAT,
  stock_price_high FLOAT,
  stock_price_low FLOAT,
  stock_price_close FLOAT,
  stock_volume FLOAT,
  stock_price_adj_close FLOAT
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'
STORED AS TEXTFILE;

SHOW TABLES;

LOAD DATA LOCAL INPATH '/home/cloudera/Documents/workspaces/icp5/thinkbig-hive-tutorial/data/stocks/input/plain-text/NASDAQ/AAPL/' INTO TABLE STOCKS_PRICES;
LOAD DATA LOCAL INPATH '/home/cloudera/Documents/workspaces/icp5/thinkbig-hive-tutorial/data/stocks/input/plain-text/NASDAQ/INTC/' INTO TABLE STOCKS_PRICES;
LOAD DATA LOCAL INPATH '/home/cloudera/Documents/workspaces/icp5/thinkbig-hive-tutorial/data/stocks/input/plain-text/NYSE/GE/' INTO TABLE STOCKS_PRICES;
LOAD DATA LOCAL INPATH '/home/cloudera/Documents/workspaces/icp5/thinkbig-hive-tutorial/data/stocks/input/plain-text/NYSE/IBM/' INTO TABLE STOCKS_PRICES;

SELECT * FROM STOCKS_PRICES;
DESCRIBE STOCKS_PRICES;
DESCRIBE EXTENDED STOCKS_PRICES;
