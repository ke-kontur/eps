
package ru.acs.fts.schemas.album.mistakeletter;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ���������� ������
 */
public class MistakesDescriptionType
{
    private List<PresentedDocMistakeType> customsDocsMistakeList = new ArrayList<PresentedDocMistakeType>();
    private List<PresentedDocMistakeType> commercialDocsMistakeList = new ArrayList<PresentedDocMistakeType>();
    private List<TransportDocMistakeType> transportDocsMistakeList = new ArrayList<TransportDocMistakeType>();

    /** 
     * Get the list of 'CustomsDocsMistakes' element items. ������ � ���������� ���������� ����������
     * 
     * @return list
     */
    public List<PresentedDocMistakeType> getCustomsDocsMistakeList() {
        return customsDocsMistakeList;
    }

    /** 
     * Set the list of 'CustomsDocsMistakes' element items. ������ � ���������� ���������� ����������
     * 
     * @param list
     */
    public void setCustomsDocsMistakeList(List<PresentedDocMistakeType> list) {
        customsDocsMistakeList = list;
    }

    /** 
     * Get the list of 'CommercialDocsMistakes' element items. ������ � ���������� ������������ ����������
     * 
     * @return list
     */
    public List<PresentedDocMistakeType> getCommercialDocsMistakeList() {
        return commercialDocsMistakeList;
    }

    /** 
     * Set the list of 'CommercialDocsMistakes' element items. ������ � ���������� ������������ ����������
     * 
     * @param list
     */
    public void setCommercialDocsMistakeList(List<PresentedDocMistakeType> list) {
        commercialDocsMistakeList = list;
    }

    /** 
     * Get the list of 'TransportDocsMistakes' element items. ������ � ���������� ������������ ���������� (� ���������)
     * 
     * @return list
     */
    public List<TransportDocMistakeType> getTransportDocsMistakeList() {
        return transportDocsMistakeList;
    }

    /** 
     * Set the list of 'TransportDocsMistakes' element items. ������ � ���������� ������������ ���������� (� ���������)
     * 
     * @param list
     */
    public void setTransportDocsMistakeList(List<TransportDocMistakeType> list) {
        transportDocsMistakeList = list;
    }
}
