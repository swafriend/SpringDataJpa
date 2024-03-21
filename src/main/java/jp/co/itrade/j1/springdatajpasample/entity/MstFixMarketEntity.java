package jp.co.itrade.j1.springdatajpasample.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@Entity
@jakarta.persistence.Table(name = "MST_FIX_MARKET")
@jakarta.persistence.IdClass(jp.co.itrade.j1.springdatajpasample.entity.MstFixMarketEntityPK.class)
public class MstFixMarketEntity {
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "VENDER_NAME")
    private String venderName;

    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "MARKET_CODE")
    private String marketCode;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "FIX_MARKET_CODE")
    private String fixMarketCode;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "FIX_SECURITY_EXCHANGE")
    private String fixSecurityExchange;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "INPUT_FLAG")
    private String inputFlag;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "SEND_TO_BACK_FLAG")
    private String sendToBackFlag;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "RESERVE1")
    private String reserve1;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "RESERVE2")
    private String reserve2;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "RESERVE3")
    private String reserve3;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "RESERVE4")
    private String reserve4;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "RESERVE5")
    private String reserve5;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "CREATE_TIME")
    private Date createTime;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "UPDATE_TIME")
    private Date updateTime;

    @jakarta.persistence.Basic
    @jakarta.persistence.Column(name = "BROKER_ID")
    private String brokerId;

}
