
package ru.acs.fts.schemas.album.cwquitance;

import java.util.ArrayList;
import java.util.List;

/** 
 * Документ,содержащий ошибки
 */
public class DocumentWithErrorsType
{
    private String documentNumber;
    private String orderNumberOfEdition;
    private List<ErrorsType> errorList = new ArrayList<ErrorsType>();

    /** 
     * Get the 'DocumentNumber' element value. Номер подтверждаемого/ошибочного документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер подтверждаемого/ошибочного документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'OrderNumberOfEdition' element value. Номер версии подтверждаемого/ошибочного документа
     * 
     * @return value
     */
    public String getOrderNumberOfEdition() {
        return orderNumberOfEdition;
    }

    /** 
     * Set the 'OrderNumberOfEdition' element value. Номер версии подтверждаемого/ошибочного документа
     * 
     * @param orderNumberOfEdition
     */
    public void setOrderNumberOfEdition(String orderNumberOfEdition) {
        this.orderNumberOfEdition = orderNumberOfEdition;
    }

    /** 
     * Get the list of 'Errors' element items. Ошибки
     * 
     * @return list
     */
    public List<ErrorsType> getErrorList() {
        return errorList;
    }

    /** 
     * Set the list of 'Errors' element items. Ошибки
     * 
     * @param list
     */
    public void setErrorList(List<ErrorsType> list) {
        errorList = list;
    }
}
