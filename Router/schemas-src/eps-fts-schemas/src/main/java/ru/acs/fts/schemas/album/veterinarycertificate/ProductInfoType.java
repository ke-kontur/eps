
package ru.acs.fts.schemas.album.veterinarycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о продукции/животном
 */
public class ProductInfoType
{
    private String productName;
    private String productMark;
    private String productPacking;
    private String sex;
    private String breed;
    private String age;
    private String IDNumber;
    private String brand;
    private String nickName;
    private String weight;
    private SupplementaryQuantityType productQuantity;

    /** 
     * Get the 'ProductName' element value. Наименование продукции
     * 
     * @return value
     */
    public String getProductName() {
        return productName;
    }

    /** 
     * Set the 'ProductName' element value. Наименование продукции
     * 
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /** 
     * Get the 'ProductMark' element value. Маркировка
     * 
     * @return value
     */
    public String getProductMark() {
        return productMark;
    }

    /** 
     * Set the 'ProductMark' element value. Маркировка
     * 
     * @param productMark
     */
    public void setProductMark(String productMark) {
        this.productMark = productMark;
    }

    /** 
     * Get the 'ProductPacking' element value. Упаковка
     * 
     * @return value
     */
    public String getProductPacking() {
        return productPacking;
    }

    /** 
     * Set the 'ProductPacking' element value. Упаковка
     * 
     * @param productPacking
     */
    public void setProductPacking(String productPacking) {
        this.productPacking = productPacking;
    }

    /** 
     * Get the 'Sex' element value. Пол
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. Пол
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'Breed' element value. Порода
     * 
     * @return value
     */
    public String getBreed() {
        return breed;
    }

    /** 
     * Set the 'Breed' element value. Порода
     * 
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /** 
     * Get the 'Age' element value. Возраст
     * 
     * @return value
     */
    public String getAge() {
        return age;
    }

    /** 
     * Set the 'Age' element value. Возраст
     * 
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /** 
     * Get the 'IDNumber' element value. Идентификационный номер
     * 
     * @return value
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /** 
     * Set the 'IDNumber' element value. Идентификационный номер
     * 
     * @param IDNumber
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /** 
     * Get the 'Brand' element value. Клеймо (номер, форма)
     * 
     * @return value
     */
    public String getBrand() {
        return brand;
    }

    /** 
     * Set the 'Brand' element value. Клеймо (номер, форма)
     * 
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /** 
     * Get the 'NickName' element value. Кличка
     * 
     * @return value
     */
    public String getNickName() {
        return nickName;
    }

    /** 
     * Set the 'NickName' element value. Кличка
     * 
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /** 
     * Get the 'Weight' element value. Вес, кг
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Вес, кг
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'ProductQuantity' element value. Количество продукции
     * 
     * @return value
     */
    public SupplementaryQuantityType getProductQuantity() {
        return productQuantity;
    }

    /** 
     * Set the 'ProductQuantity' element value. Количество продукции
     * 
     * @param productQuantity
     */
    public void setProductQuantity(SupplementaryQuantityType productQuantity) {
        this.productQuantity = productQuantity;
    }
}
