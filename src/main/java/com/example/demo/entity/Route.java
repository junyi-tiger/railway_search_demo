package com.example.demo.entity;

import java.util.ArrayList;

/**
 * 列车路线时刻表
 */

public class Route {
    //内部类Station_Info:列车经停站点信息
    private static class Station_Info{
        private String station_name;//车站名称
        private String arrive_time;//到时
        private String departure_time;//开时
        private double mileage;//里程
    }

    private String name;//车次名称
    ArrayList<Station_Info> station_list;//该车次沿途经过的各站点信息列表

}