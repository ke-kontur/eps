
package ru.acs.fts.schemas.album.represapplicstatinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения о поставках в адрес физического лица
 */
public class RepresApplicStatInfoType extends BaseDocType
{
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private DocIDType docID;
    private String documentModeID;

    /** 
     * Get the list of 'Consignment' element items. Сведения о товарах, ранее поступивших получателю
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. Сведения о товарах, ранее поступивших получателю
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'DocID' element value. Регистрационный номер документа
     * 
     * @return value
     */
    public DocIDType getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' element value. Регистрационный номер документа
     * 
     * @param docID
     */
    public void setDocID(DocIDType docID) {
        this.docID = docID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
