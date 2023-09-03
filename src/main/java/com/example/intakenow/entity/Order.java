package com.example.intakenow.entity;

import java.sql.Timestamp;
import java.util.Map;

public class Order {
    private int storeId;
    private Timestamp orderTime;
    private Map<Integer,Integer> foodsMap;
}
