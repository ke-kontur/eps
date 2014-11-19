
package ru.acs.fts.schemas.album.veterinarycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � ���������/��������
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
     * Get the 'ProductName' element value. ������������ ���������
     * 
     * @return value
     */
    public String getProductName() {
        return productName;
    }

    /** 
     * Set the 'ProductName' element value. ������������ ���������
     * 
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /** 
     * Get the 'ProductMark' element value. ����������
     * 
     * @return value
     */
    public String getProductMark() {
        return productMark;
    }

    /** 
     * Set the 'ProductMark' element value. ����������
     * 
     * @param productMark
     */
    public void setProductMark(String productMark) {
        this.productMark = productMark;
    }

    /** 
     * Get the 'ProductPacking' element value. ��������
     * 
     * @return value
     */
    public String getProductPacking() {
        return productPacking;
    }

    /** 
     * Set the 'ProductPacking' element value. ��������
     * 
     * @param productPacking
     */
    public void setProductPacking(String productPacking) {
        this.productPacking = productPacking;
    }

    /** 
     * Get the 'Sex' element value. ���
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. ���
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'Breed' element value. ������
     * 
     * @return value
     */
    public String getBreed() {
        return breed;
    }

    /** 
     * Set the 'Breed' element value. ������
     * 
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /** 
     * Get the 'Age' element value. �������
     * 
     * @return value
     */
    public String getAge() {
        return age;
    }

    /** 
     * Set the 'Age' element value. �������
     * 
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /** 
     * Get the 'IDNumber' element value. ����������������� �����
     * 
     * @return value
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /** 
     * Set the 'IDNumber' element value. ����������������� �����
     * 
     * @param IDNumber
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /** 
     * Get the 'Brand' element value. ������ (�����, �����)
     * 
     * @return value
     */
    public String getBrand() {
        return brand;
    }

    /** 
     * Set the 'Brand' element value. ������ (�����, �����)
     * 
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /** 
     * Get the 'NickName' element value. ������
     * 
     * @return value
     */
    public String getNickName() {
        return nickName;
    }

    /** 
     * Set the 'NickName' element value. ������
     * 
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /** 
     * Get the 'Weight' element value. ���, ��
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. ���, ��
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'ProductQuantity' element value. ���������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getProductQuantity() {
        return productQuantity;
    }

    /** 
     * Set the 'ProductQuantity' element value. ���������� ���������
     * 
     * @param productQuantity
     */
    public void setProductQuantity(SupplementaryQuantityType productQuantity) {
        this.productQuantity = productQuantity;
    }
}
