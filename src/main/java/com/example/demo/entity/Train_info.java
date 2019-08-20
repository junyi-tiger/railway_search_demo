package com.example.demo.entity;

//车次类型:普通列车，动车，高铁
enum Train_Type{
    TRAIN, BULLET_TRAIN, HIGH_SPEED_TRAIN
}

/**
 * 车次信息表
 */
public class Train_info {
    private String name;//车次名称
    private String description;//描述说明信息
    private Train_Type ticket_type;//车票类型（火车票or动车票or高铁票）
    private String departure_time;//开时
    private String arrive_time;//到时
    private String duration;//历时
    private Fare fare;//票价
    private Route route;//路线时刻表
}