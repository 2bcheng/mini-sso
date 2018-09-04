package com.bigjj.minisso.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mr-liu
 */
@Data
public class VideoOrder  implements Serializable {

  private static final long serialVersionUID = -5664723144767329259L;
  private long id;
  private String openid;
  private String outTradeNo;
  private long state;
  private Date createTime;
  private Date notifyTime;
  private long totalFee;
  private String nickname;
  private String headImg;
  private long videoId;
  private String videoTitle;
  private String videoImg;
  private long userId;
  private String ip;
  private long del;

}
