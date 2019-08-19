package com.example.demo.entity;

/**
 * 车站信息表
 */
public class Station {
    //经过该站的车次信息
    private static class train_Info{
        private String train_name;//车次名称
        private String arrive_time;//到时
        private String departure_time;//开时
    }

    private String station_name;//车站名称
    private String train_cnt;//经过该站点的车次数目

}
