package com.bigjj.minisso.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * @author mr-liu
 */
public class Video  implements Serializable {

  private static final long serialVersionUID = 8276020027262175382L;
  private long id;
  private String title;
  private String summary;
  private String coverImg;
  private long viewNum;
  private long price;
  private Date createTime;
  private long online;
  private double point;



}
