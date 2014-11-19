
package ru.acs.fts.schemas.album.ktsoutcustomsmark;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� ������� ���
 */
public class KTSOutCustomsMarkType extends BaseDocType
{
    private String KTSDocumentID;
    private List<KTSOutCustomsMarkGoodsType> KTSOutCustomsMarkGoodList = new ArrayList<KTSOutCustomsMarkGoodsType>();
    private List<KTSOutCustomsMarkGeneralType> KTSOutCustomsMarkGeneralList = new ArrayList<KTSOutCustomsMarkGeneralType>();
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'KTSDocumentID' element value. ���������� ������������� ���, � ������� ��������� ��������� �������.
     * 
     * @return value
     */
    public String getKTSDocumentID() {
        return KTSDocumentID;
    }

    /** 
     * Set the 'KTSDocumentID' element value. ���������� ������������� ���, � ������� ��������� ��������� �������.
     * 
     * @param KTSDocumentID
     */
    public void setKTSDocumentID(String KTSDocumentID) {
        this.KTSDocumentID = KTSDocumentID;
    }

    /** 
     * Get the list of 'KTSOutCustomsMarkGoods' element items. ���-��������� ������� �� �������
     * 
     * @return list
     */
    public List<KTSOutCustomsMarkGoodsType> getKTSOutCustomsMarkGoodList() {
        return KTSOutCustomsMarkGoodList;
    }

    /** 
     * Set the list of 'KTSOutCustomsMarkGoods' element items. ���-��������� ������� �� �������
     * 
     * @param list
     */
    public void setKTSOutCustomsMarkGoodList(
            List<KTSOutCustomsMarkGoodsType> list) {
        KTSOutCustomsMarkGoodList = list;
    }

    /** 
     * Get the list of 'KTSOutCustomsMarkGeneral' element items. ��������� ������� �����
     * 
     * @return list
     */
    public List<KTSOutCustomsMarkGeneralType> getKTSOutCustomsMarkGeneralList() {
        return KTSOutCustomsMarkGeneralList;
    }

    /** 
     * Set the list of 'KTSOutCustomsMarkGeneral' element items. ��������� ������� �����
     * 
     * @param list
     */
    public void setKTSOutCustomsMarkGeneralList(
            List<KTSOutCustomsMarkGeneralType> list) {
        KTSOutCustomsMarkGeneralList = list;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ����������� ���������.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ����������� ���������.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
