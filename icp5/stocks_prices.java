// ORM class for table 'stocks_prices'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 21 22:08:58 PDT 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class stocks_prices extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("stock_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_date = (java.sql.Date)value;
      }
    });
    setters.put("stock_price_open", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_price_open = (Float)value;
      }
    });
    setters.put("stock_price_high", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_price_high = (Float)value;
      }
    });
    setters.put("stock_price_low", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_price_low = (Float)value;
      }
    });
    setters.put("stock_price_close", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_price_close = (Float)value;
      }
    });
    setters.put("stock_volume", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_volume = (Float)value;
      }
    });
    setters.put("stock_price_adj_close", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        stock_price_adj_close = (Float)value;
      }
    });
  }
  public stocks_prices() {
    init0();
  }
  private java.sql.Date stock_date;
  public java.sql.Date get_stock_date() {
    return stock_date;
  }
  public void set_stock_date(java.sql.Date stock_date) {
    this.stock_date = stock_date;
  }
  public stocks_prices with_stock_date(java.sql.Date stock_date) {
    this.stock_date = stock_date;
    return this;
  }
  private Float stock_price_open;
  public Float get_stock_price_open() {
    return stock_price_open;
  }
  public void set_stock_price_open(Float stock_price_open) {
    this.stock_price_open = stock_price_open;
  }
  public stocks_prices with_stock_price_open(Float stock_price_open) {
    this.stock_price_open = stock_price_open;
    return this;
  }
  private Float stock_price_high;
  public Float get_stock_price_high() {
    return stock_price_high;
  }
  public void set_stock_price_high(Float stock_price_high) {
    this.stock_price_high = stock_price_high;
  }
  public stocks_prices with_stock_price_high(Float stock_price_high) {
    this.stock_price_high = stock_price_high;
    return this;
  }
  private Float stock_price_low;
  public Float get_stock_price_low() {
    return stock_price_low;
  }
  public void set_stock_price_low(Float stock_price_low) {
    this.stock_price_low = stock_price_low;
  }
  public stocks_prices with_stock_price_low(Float stock_price_low) {
    this.stock_price_low = stock_price_low;
    return this;
  }
  private Float stock_price_close;
  public Float get_stock_price_close() {
    return stock_price_close;
  }
  public void set_stock_price_close(Float stock_price_close) {
    this.stock_price_close = stock_price_close;
  }
  public stocks_prices with_stock_price_close(Float stock_price_close) {
    this.stock_price_close = stock_price_close;
    return this;
  }
  private Float stock_volume;
  public Float get_stock_volume() {
    return stock_volume;
  }
  public void set_stock_volume(Float stock_volume) {
    this.stock_volume = stock_volume;
  }
  public stocks_prices with_stock_volume(Float stock_volume) {
    this.stock_volume = stock_volume;
    return this;
  }
  private Float stock_price_adj_close;
  public Float get_stock_price_adj_close() {
    return stock_price_adj_close;
  }
  public void set_stock_price_adj_close(Float stock_price_adj_close) {
    this.stock_price_adj_close = stock_price_adj_close;
  }
  public stocks_prices with_stock_price_adj_close(Float stock_price_adj_close) {
    this.stock_price_adj_close = stock_price_adj_close;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stocks_prices)) {
      return false;
    }
    stocks_prices that = (stocks_prices) o;
    boolean equal = true;
    equal = equal && (this.stock_date == null ? that.stock_date == null : this.stock_date.equals(that.stock_date));
    equal = equal && (this.stock_price_open == null ? that.stock_price_open == null : this.stock_price_open.equals(that.stock_price_open));
    equal = equal && (this.stock_price_high == null ? that.stock_price_high == null : this.stock_price_high.equals(that.stock_price_high));
    equal = equal && (this.stock_price_low == null ? that.stock_price_low == null : this.stock_price_low.equals(that.stock_price_low));
    equal = equal && (this.stock_price_close == null ? that.stock_price_close == null : this.stock_price_close.equals(that.stock_price_close));
    equal = equal && (this.stock_volume == null ? that.stock_volume == null : this.stock_volume.equals(that.stock_volume));
    equal = equal && (this.stock_price_adj_close == null ? that.stock_price_adj_close == null : this.stock_price_adj_close.equals(that.stock_price_adj_close));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stocks_prices)) {
      return false;
    }
    stocks_prices that = (stocks_prices) o;
    boolean equal = true;
    equal = equal && (this.stock_date == null ? that.stock_date == null : this.stock_date.equals(that.stock_date));
    equal = equal && (this.stock_price_open == null ? that.stock_price_open == null : this.stock_price_open.equals(that.stock_price_open));
    equal = equal && (this.stock_price_high == null ? that.stock_price_high == null : this.stock_price_high.equals(that.stock_price_high));
    equal = equal && (this.stock_price_low == null ? that.stock_price_low == null : this.stock_price_low.equals(that.stock_price_low));
    equal = equal && (this.stock_price_close == null ? that.stock_price_close == null : this.stock_price_close.equals(that.stock_price_close));
    equal = equal && (this.stock_volume == null ? that.stock_volume == null : this.stock_volume.equals(that.stock_volume));
    equal = equal && (this.stock_price_adj_close == null ? that.stock_price_adj_close == null : this.stock_price_adj_close.equals(that.stock_price_adj_close));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.stock_date = JdbcWritableBridge.readDate(1, __dbResults);
    this.stock_price_open = JdbcWritableBridge.readFloat(2, __dbResults);
    this.stock_price_high = JdbcWritableBridge.readFloat(3, __dbResults);
    this.stock_price_low = JdbcWritableBridge.readFloat(4, __dbResults);
    this.stock_price_close = JdbcWritableBridge.readFloat(5, __dbResults);
    this.stock_volume = JdbcWritableBridge.readFloat(6, __dbResults);
    this.stock_price_adj_close = JdbcWritableBridge.readFloat(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.stock_date = JdbcWritableBridge.readDate(1, __dbResults);
    this.stock_price_open = JdbcWritableBridge.readFloat(2, __dbResults);
    this.stock_price_high = JdbcWritableBridge.readFloat(3, __dbResults);
    this.stock_price_low = JdbcWritableBridge.readFloat(4, __dbResults);
    this.stock_price_close = JdbcWritableBridge.readFloat(5, __dbResults);
    this.stock_volume = JdbcWritableBridge.readFloat(6, __dbResults);
    this.stock_price_adj_close = JdbcWritableBridge.readFloat(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(stock_date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_open, 2 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_high, 3 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_low, 4 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_close, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_volume, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_adj_close, 7 + __off, 7, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(stock_date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_open, 2 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_high, 3 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_low, 4 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_close, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_volume, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(stock_price_adj_close, 7 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.stock_date = null;
    } else {
    this.stock_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_open = null;
    } else {
    this.stock_price_open = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_high = null;
    } else {
    this.stock_price_high = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_low = null;
    } else {
    this.stock_price_low = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_close = null;
    } else {
    this.stock_price_close = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_volume = null;
    } else {
    this.stock_volume = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.stock_price_adj_close = null;
    } else {
    this.stock_price_adj_close = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.stock_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stock_date.getTime());
    }
    if (null == this.stock_price_open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_open);
    }
    if (null == this.stock_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_high);
    }
    if (null == this.stock_price_low) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_low);
    }
    if (null == this.stock_price_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_close);
    }
    if (null == this.stock_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_volume);
    }
    if (null == this.stock_price_adj_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_adj_close);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.stock_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stock_date.getTime());
    }
    if (null == this.stock_price_open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_open);
    }
    if (null == this.stock_price_high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_high);
    }
    if (null == this.stock_price_low) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_low);
    }
    if (null == this.stock_price_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_close);
    }
    if (null == this.stock_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_volume);
    }
    if (null == this.stock_price_adj_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.stock_price_adj_close);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(stock_date==null?"null":"" + stock_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_open==null?"null":"" + stock_price_open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_high==null?"null":"" + stock_price_high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_low==null?"null":"" + stock_price_low, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_close==null?"null":"" + stock_price_close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_volume==null?"null":"" + stock_volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_adj_close==null?"null":"" + stock_price_adj_close, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(stock_date==null?"null":"" + stock_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_open==null?"null":"" + stock_price_open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_high==null?"null":"" + stock_price_high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_low==null?"null":"" + stock_price_low, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_close==null?"null":"" + stock_price_close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_volume==null?"null":"" + stock_volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock_price_adj_close==null?"null":"" + stock_price_adj_close, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_date = null; } else {
      this.stock_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_open = null; } else {
      this.stock_price_open = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_high = null; } else {
      this.stock_price_high = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_low = null; } else {
      this.stock_price_low = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_close = null; } else {
      this.stock_price_close = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_volume = null; } else {
      this.stock_volume = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_adj_close = null; } else {
      this.stock_price_adj_close = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_date = null; } else {
      this.stock_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_open = null; } else {
      this.stock_price_open = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_high = null; } else {
      this.stock_price_high = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_low = null; } else {
      this.stock_price_low = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_close = null; } else {
      this.stock_price_close = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_volume = null; } else {
      this.stock_volume = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stock_price_adj_close = null; } else {
      this.stock_price_adj_close = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    stocks_prices o = (stocks_prices) super.clone();
    o.stock_date = (o.stock_date != null) ? (java.sql.Date) o.stock_date.clone() : null;
    return o;
  }

  public void clone0(stocks_prices o) throws CloneNotSupportedException {
    o.stock_date = (o.stock_date != null) ? (java.sql.Date) o.stock_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("stock_date", this.stock_date);
    __sqoop$field_map.put("stock_price_open", this.stock_price_open);
    __sqoop$field_map.put("stock_price_high", this.stock_price_high);
    __sqoop$field_map.put("stock_price_low", this.stock_price_low);
    __sqoop$field_map.put("stock_price_close", this.stock_price_close);
    __sqoop$field_map.put("stock_volume", this.stock_volume);
    __sqoop$field_map.put("stock_price_adj_close", this.stock_price_adj_close);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("stock_date", this.stock_date);
    __sqoop$field_map.put("stock_price_open", this.stock_price_open);
    __sqoop$field_map.put("stock_price_high", this.stock_price_high);
    __sqoop$field_map.put("stock_price_low", this.stock_price_low);
    __sqoop$field_map.put("stock_price_close", this.stock_price_close);
    __sqoop$field_map.put("stock_volume", this.stock_volume);
    __sqoop$field_map.put("stock_price_adj_close", this.stock_price_adj_close);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
