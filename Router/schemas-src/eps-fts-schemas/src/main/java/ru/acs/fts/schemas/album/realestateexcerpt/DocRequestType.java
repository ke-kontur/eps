
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Запрос документа
 */
public class DocRequestType
{
    private String reqSign;
    private String describeContract;
    private IdentityCardType identityDoc;
    private List<EstateObjectType> objectList = new ArrayList<EstateObjectType>();
    private DocumentBaseType documentDetails;

    /** 
     * Get the 'ReqSign' element value. Признак: 1 - Запрос копии документа (Указываются вид (наименование) и реквизиты договора (сделки)); 2 - Справка о содержании правоустанавливающих документов
     * 
     * @return value
     */
    public String getReqSign() {
        return reqSign;
    }

    /** 
     * Set the 'ReqSign' element value. Признак: 1 - Запрос копии документа (Указываются вид (наименование) и реквизиты договора (сделки)); 2 - Справка о содержании правоустанавливающих документов
     * 
     * @param reqSign
     */
    public void setReqSign(String reqSign) {
        this.reqSign = reqSign;
    }

    /** 
     * Get the 'DescribeContract' element value. Положения, интересующие заявителя
     * 
     * @return value
     */
    public String getDescribeContract() {
        return describeContract;
    }

    /** 
     * Set the 'DescribeContract' element value. Положения, интересующие заявителя
     * 
     * @param describeContract
     */
    public void setDescribeContract(String describeContract) {
        this.describeContract = describeContract;
    }

    /** 
     * Get the 'IdentityDoc' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityDoc() {
        return identityDoc;
    }

    /** 
     * Set the 'IdentityDoc' element value. Документ, удостоверяющий личность
     * 
     * @param identityDoc
     */
    public void setIdentityDoc(IdentityCardType identityDoc) {
        this.identityDoc = identityDoc;
    }

    /** 
     * Get the list of 'Object' element items. Объект
     * 
     * @return list
     */
    public List<EstateObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. Объект
     * 
     * @param list
     */
    public void setObjectList(List<EstateObjectType> list) {
        objectList = list;
    }

    /** 
     * Get the 'DocumentDetails' element value. Реквизиты документа
     * 
     * @return value
     */
    public DocumentBaseType getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'DocumentDetails' element value. Реквизиты документа
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(DocumentBaseType documentDetails) {
        this.documentDetails = documentDetails;
    }
}
