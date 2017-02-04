/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecsite;

import javax.swing.Icon;

/**
 *
 * @author razu
 */
/*
-- Product
-- ProductId (PK)
-- CategoryId (Fk)
-- AdminId (Fk) -
-- ProductName
-- ProductPicture
-- Discount
-- FinalPrice
-- UnitPrice
-- ProductDescription
*/
public class ProductRow {
    
    int productId;
    int categoryId;
    int adminId;
    String productName;
    Icon icon;
    int doscount;
    int finalPrice;
    int unitPrice;
    String productDescription;
    String productImageLink;

    public ProductRow(String productName, Icon icon, int doscount, int finalPrice, int unitPrice, String productDescription) {
        this.productName = productName;
        this.icon = icon;
        this.doscount = doscount;
        this.finalPrice = finalPrice;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
    }

    public ProductRow(int productId, String productName, Icon icon, int doscount, int finalPrice, int unitPrice, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.icon = icon;
        this.doscount = doscount;
        this.finalPrice = finalPrice;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
    }

    public ProductRow(int productId, int categoryId, int adminId, String productName) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.adminId = adminId;
        this.productName = productName;
    }

    public ProductRow(int productId, int categoryId, int adminId, String productName, Icon icon, int doscount, int finalPrice, int unitPrice, String productDescription) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.adminId = adminId;
        this.productName = productName;
        this.icon = icon;
        this.doscount = doscount;
        this.finalPrice = finalPrice;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
    }

    public ProductRow(int productId, int categoryId, String productName, Icon icon, int doscount, int finalPrice, int unitPrice, String productDescription) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.icon = icon;
        this.doscount = doscount;
        this.finalPrice = finalPrice;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
    }

    public ProductRow(int productId, int categoryId, String productName, Icon icon, int doscount, int finalPrice, int unitPrice, String productDescription, String productImageLink) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.icon = icon;
        this.doscount = doscount;
        this.finalPrice = finalPrice;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
        this.productImageLink = productImageLink;
    }

    public String getProductImageLink() {
        return productImageLink;
    }

    public void setProductImageLink(String productImageLink) {
        this.productImageLink = productImageLink;
    }
    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getDoscount() {
        return doscount;
    }

    public void setDoscount(int doscount) {
        this.doscount = doscount;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    
    
}
