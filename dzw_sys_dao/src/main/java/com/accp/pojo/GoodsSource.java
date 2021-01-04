package com.accp.pojo;

public class GoodsSource {
    private Integer goodsid;

    private Integer supplierasid;

    private Integer paymenttypeid;

    private String goodsno;

    private String goodsname;

    private String goodsaddress;

    private String goodsphone;

    private String goodsemail;

    private Integer paymentdays;

    private String goodsremarks;

    private String linkmanname;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getSupplierasid() {
        return supplierasid;
    }

    public void setSupplierasid(Integer supplierasid) {
        this.supplierasid = supplierasid;
    }

    public Integer getPaymenttypeid() {
        return paymenttypeid;
    }

    public void setPaymenttypeid(Integer paymenttypeid) {
        this.paymenttypeid = paymenttypeid;
    }

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno == null ? null : goodsno.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsaddress() {
        return goodsaddress;
    }

    public void setGoodsaddress(String goodsaddress) {
        this.goodsaddress = goodsaddress == null ? null : goodsaddress.trim();
    }

    public String getGoodsphone() {
        return goodsphone;
    }

    public void setGoodsphone(String goodsphone) {
        this.goodsphone = goodsphone == null ? null : goodsphone.trim();
    }

    public String getGoodsemail() {
        return goodsemail;
    }

    public void setGoodsemail(String goodsemail) {
        this.goodsemail = goodsemail == null ? null : goodsemail.trim();
    }

    public Integer getPaymentdays() {
        return paymentdays;
    }

    public void setPaymentdays(Integer paymentdays) {
        this.paymentdays = paymentdays;
    }

    public String getGoodsremarks() {
        return goodsremarks;
    }

    public void setGoodsremarks(String goodsremarks) {
        this.goodsremarks = goodsremarks == null ? null : goodsremarks.trim();
    }

    public String getLinkmanname() {
        return linkmanname;
    }

    public void setLinkmanname(String linkmanname) {
        this.linkmanname = linkmanname == null ? null : linkmanname.trim();
    }
}