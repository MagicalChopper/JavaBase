package com.coder.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdbc
 */
public class JdbcUtil {

//连接MySql数据库："jdbc:mysql://host:port/database", "user", "password";
// 其他参数如：useUnicode=true&characterEncoding=utf8
//连接Oracle数据库："jdbc:oracle:thin:@host:port:database", "user", "password";
//连接SqlServer数据库："jdbc:microsoft:sqlserver://host:port; DatabaseName=database", "user", "password";

    private static String url = "jdbc:mysql://localhost:3306/testjdbc";
    private static String name = "root";
    private static String pass = "root";

//    装载MySql驱动：Class.forName("com.mysql.jdbc.Driver");
//　　装载Oracle驱动：Class.forName("oracle.jdbc.driver.OracleDriver")

    private static String driver = "com.mysql.jdbc.Driver";

    /**
     * 加载驱动
     */
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Connection接口常用方法:
     * createStatement()：创建向数据库发送sql的statement对象。
     * prepareStatement(sql) ：创建向数据库发送预编译sql的PrepareSatement对象。
     * prepareCall(sql)：创建执行存储过程的callableStatement对象。
     * setAutoCommit(boolean autoCommit)：设置事务是否自动提交。
     * commit() ：在链接上提交事务。
     * rollback() ：在此链接上回滚事务。
     */

    /**
     * Statement常用方法:
     * execute(String sql):运行语句，返回是否有结果集
     * executeQuery(String sql)：运行select语句，返回ResultSet结果集。
     * executeUpdate(String sql)：运行insert/update/delete操作，返回更新的行数。
     * addBatch(String sql) ：把多条sql语句放到一个批处理中。
     * executeBatch()：向数据库发送一批sql语句执行。
     */

    /**
     * ResultSet常用方法:
     * getString(int index)、getString(String columnName)：获得在数据库里是varchar、char等类型的数据对象。
     * getFloat(int index)、getFloat(String columnName)：获得在数据库里是Float类型的数据对象。
     * getDate(int index)、getDate(String columnName)：获得在数据库里是Date类型的数据。
     * getBoolean(int index)、getBoolean(String columnName)：获得在数据库里是Boolean类型的数据。
     * getObject(int index)、getObject(String columnName)：获取在数据库里任意类型的数据。
     *
     * next()：移动到下一行
     * Previous()：移动到前一行
     * absolute(int row)：移动到指定行
     * beforeFirst()：移动resultSet的最前面。
     * afterLast() ：移动到resultSet的最后面。
     */

    /**
     * 更新操作
     * @param sql
     * @return
     * @throws SQLException
     */
    public static int update(String sql) throws SQLException {
        Connection conn = DriverManager.getConnection(url,name,pass);
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(sql);
        close(conn,stmt);
        return result;
    }

    /**
     * 查询操作
     * @param sql
     * @return
     */
    public static List<Map<String,Object>> query(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Map<String,Object>> list = null;
        try {
            conn = DriverManager.getConnection(url,name,pass);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while(rs.next()){
                Map<String,Object> map = new HashMap<>();//map中存的是一行数据
                //使用结果集元数据得到列名
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();//得到列的总数
                for (int i = 1;i<=columnCount;i++){
                    map.put(rsmd.getColumnLabel(i),rs.getObject(i));
                }
                list.add(map);
            }
            for (Map<String, Object> stringObjectMap : list) {
                System.out.println(stringObjectMap);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(conn,stmt,rs);
        }
        return list;
    }

    /**
     * 关闭流
     * @param conn
     * @param stmt
     */
    public static void close(Connection conn,Statement stmt){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭流
     * @param conn
     * @param stmt
     * @param rs
     */
    public static void close(Connection conn,Statement stmt,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
