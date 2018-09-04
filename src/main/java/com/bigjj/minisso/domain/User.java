package com.bigjj.minisso.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mr-liu
 */
@Data
public class User  implements Serializable {

  private static final long serialVersionUID = -5959464949230749467L;
  private long id;
  private String openid;
  private String name;
  private String headImg;
  private String phone;
  private String sign;
  private long sex;
  private String city;
  private Date createTime;

}
