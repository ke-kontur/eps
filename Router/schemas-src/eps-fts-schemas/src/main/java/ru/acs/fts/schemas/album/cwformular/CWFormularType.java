
package ru.acs.fts.schemas.album.cwformular;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.CWDocType;

/** 
 * �������� �������� ������� 
 */
public class CWFormularType extends CWDocType
{
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private List<CommodityType> commodityList = new ArrayList<CommodityType>();
    private FormularHeadType header;
    private String documentModeID;

    /** 
     * Get the list of 'Document' element items. ���������� � �������������� ����������
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. ���������� � �������������� ����������
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
    }

    /** 
     * Get the list of 'Commodity' element items. ���������� � ������
     * 
     * @return list
     */
    public List<CommodityType> getCommodityList() {
        return commodityList;
    }

    /** 
     * Set the list of 'Commodity' element items. ���������� � ������
     * 
     * @param list
     */
    public void setCommodityList(List<CommodityType> list) {
        commodityList = list;
    }

    /** 
     * Get the 'Header' element value. ���������� � ���������� ���������
     * 
     * @return value
     */
    public FormularHeadType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. ���������� � ���������� ���������
     * 
     * @param header
     */
    public void setHeader(FormularHeadType header) {
        this.header = header;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
