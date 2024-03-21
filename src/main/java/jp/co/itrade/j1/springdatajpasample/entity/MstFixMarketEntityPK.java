package jp.co.itrade.j1.springdatajpasample.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MstFixMarketEntityPK implements Serializable {
    public String venderName;
    public String marketCode;
}
