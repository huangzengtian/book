package com.shichimi.book.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author Huang Zengtian on 2021/5/28 18:05
 */
public class TbBookVO implements Serializable {
    private static final long serialVersionUID = -26472901178202745L;
    /**
     * 主键
     */
    private String idBook;
    /**
     * 名称
     */
    private String name;
    /**
     * 作者
     */
    private String author;
    /**
     * 出版日期
     */
    private Date publishDate;
    /**
     * 价格
     */
    private Double price;
    /**
     * 描述
     */
    private String description;
    /**
     * 表状态： 0无效，1有效
     */
    private String status;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 最低价格
     */
    private Double priceLow;

    /**
     * 最高价格
     */
    private Double priceHigh;

    public TbBookVO() {
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Double getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(Double priceLow) {
        this.priceLow = priceLow;
    }

    public Double getPriceHigh() {
        return priceHigh;
    }

    public void setPriceHigh(Double priceHigh) {
        this.priceHigh = priceHigh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TbBookVO tbBookVO = (TbBookVO) o;
        return Objects.equals(idBook, tbBookVO.idBook) && Objects.equals(name, tbBookVO.name) && Objects.equals(author, tbBookVO.author) && Objects.equals(publishDate, tbBookVO.publishDate) && Objects.equals(price, tbBookVO.price) && Objects.equals(description, tbBookVO.description) && Objects.equals(status, tbBookVO.status) && Objects.equals(createBy, tbBookVO.createBy) && Objects.equals(createDate, tbBookVO.createDate) && Objects.equals(updateBy, tbBookVO.updateBy) && Objects.equals(updateDate, tbBookVO.updateDate) && Objects.equals(priceLow, tbBookVO.priceLow) && Objects.equals(priceHigh, tbBookVO.priceHigh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, name, author, publishDate, price, description, status, createBy, createDate, updateBy, updateDate, priceLow, priceHigh);
    }

    @Override
    public String toString() {
        return "TbBookVO{" +
                "idBook='" + idBook + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", priceLow=" + priceLow +
                ", priceHigh=" + priceHigh +
                '}';
    }
}
