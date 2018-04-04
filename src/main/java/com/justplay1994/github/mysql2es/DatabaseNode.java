package com.justplay1994.github.mysql2es;

import java.util.List;

/**
 * Created by JustPlay1994 on 2018/4/3.
 * https://github.com/JustPlay1994/daily-log-manager
 */

public class DatabaseNode {
    String dbName;
    List<TableNode> tableNodeList;

    public DatabaseNode(){

    }

    public DatabaseNode(String dbName, List<TableNode> tableNodeList){
        this.dbName = dbName;
        this.tableNodeList = tableNodeList;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public List<TableNode> getTableNodeList() {
        return tableNodeList;
    }

    public void setTableNodeList(List<TableNode> tableNodeList) {
        this.tableNodeList = tableNodeList;
    }

}
