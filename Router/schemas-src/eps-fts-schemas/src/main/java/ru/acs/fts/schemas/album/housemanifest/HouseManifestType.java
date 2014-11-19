
package ru.acs.fts.schemas.album.housemanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ����������������� ��������
 */
public class HouseManifestType extends BaseDocType
{
    private String linesNumberTotal;
    private String totalNumberOfPieces;
    private SupplementaryQuantityType totalGrossWeight;
    private HeaderType header;
    private List<ItemDetailsType> itemDetailList = new ArrayList<ItemDetailsType>();
    private String documentModeID;

    /** 
     * Get the 'LinesNumberTotal' element value. ����� ���������� ������������ �������
     * 
     * @return value
     */
    public String getLinesNumberTotal() {
        return linesNumberTotal;
    }

    /** 
     * Set the 'LinesNumberTotal' element value. ����� ���������� ������������ �������
     * 
     * @param linesNumberTotal
     */
    public void setLinesNumberTotal(String linesNumberTotal) {
        this.linesNumberTotal = linesNumberTotal;
    }

    /** 
     * Get the 'TotalNumberOfPieces' element value. ����� ���������� �������
     * 
     * @return value
     */
    public String getTotalNumberOfPieces() {
        return totalNumberOfPieces;
    }

    /** 
     * Set the 'TotalNumberOfPieces' element value. ����� ���������� �������
     * 
     * @param totalNumberOfPieces
     */
    public void setTotalNumberOfPieces(String totalNumberOfPieces) {
        this.totalNumberOfPieces = totalNumberOfPieces;
    }

    /** 
     * Get the 'TotalGrossWeight' element value. ����� ��� �������
     * 
     * @return value
     */
    public SupplementaryQuantityType getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /** 
     * Set the 'TotalGrossWeight' element value. ����� ��� �������
     * 
     * @param totalGrossWeight
     */
    public void setTotalGrossWeight(SupplementaryQuantityType totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /** 
     * Get the 'Header' element value. ��������� ���������
     * 
     * @return value
     */
    public HeaderType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. ��������� ���������
     * 
     * @param header
     */
    public void setHeader(HeaderType header) {
        this.header = header;
    }

    /** 
     * Get the list of 'ItemDetails' element items. �������� ������
     * 
     * @return list
     */
    public List<ItemDetailsType> getItemDetailList() {
        return itemDetailList;
    }

    /** 
     * Set the list of 'ItemDetails' element items. �������� ������
     * 
     * @param list
     */
    public void setItemDetailList(List<ItemDetailsType> list) {
        itemDetailList = list;
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
