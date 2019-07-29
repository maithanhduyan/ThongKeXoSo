package com.tkxs.data;

/**
 * @author Mai Thành Duy An
 */

public class MainClass {

    public static void main(String[] args) {
        Database database = new Database();
        DaiManagerUtil.statistic(database.getDai("BacLieu"), 120);
    }
}
