
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;

/** 
 * Наименование операции в соответствии с условиями соглашения 
 */
public class OperationType
{
    private String operationName;
    private String operationNumber;
    private List<ProductType> productList = new ArrayList<ProductType>();

    /** 
     * Get the 'OperationName' element value. Наименование операции в соответствии с условиями соглашения 
     * 
     * @return value
     */
    public String getOperationName() {
        return operationName;
    }

    /** 
     * Set the 'OperationName' element value. Наименование операции в соответствии с условиями соглашения 
     * 
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /** 
     * Get the 'OperationNumber' element value. Порядковый номер операции
     * 
     * @return value
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    /** 
     * Set the 'OperationNumber' element value. Порядковый номер операции
     * 
     * @param operationNumber
     */
    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    /** 
     * Get the list of 'Product' element items. Товар
     * 
     * @return list
     */
    public List<ProductType> getProductList() {
        return productList;
    }

    /** 
     * Set the list of 'Product' element items. Товар
     * 
     * @param list
     */
    public void setProductList(List<ProductType> list) {
        productList = list;
    }
}
