
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������������ �������� � ������������ � ��������� ���������� 
 */
public class OperationType
{
    private String operationName;
    private String operationNumber;
    private List<ProductType> productList = new ArrayList<ProductType>();

    /** 
     * Get the 'OperationName' element value. ������������ �������� � ������������ � ��������� ���������� 
     * 
     * @return value
     */
    public String getOperationName() {
        return operationName;
    }

    /** 
     * Set the 'OperationName' element value. ������������ �������� � ������������ � ��������� ���������� 
     * 
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /** 
     * Get the 'OperationNumber' element value. ���������� ����� ��������
     * 
     * @return value
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    /** 
     * Set the 'OperationNumber' element value. ���������� ����� ��������
     * 
     * @param operationNumber
     */
    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    /** 
     * Get the list of 'Product' element items. �����
     * 
     * @return list
     */
    public List<ProductType> getProductList() {
        return productList;
    }

    /** 
     * Set the list of 'Product' element items. �����
     * 
     * @param list
     */
    public void setProductList(List<ProductType> list) {
        productList = list;
    }
}
