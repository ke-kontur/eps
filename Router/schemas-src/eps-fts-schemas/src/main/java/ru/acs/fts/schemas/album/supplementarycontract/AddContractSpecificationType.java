
package ru.acs.fts.schemas.album.supplementarycontract;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ������������ � ���������� � ���������
 */
public class AddContractSpecificationType
{
    private LocalDate issueDate;
    private String ID;
    private List<AddSpecificationGoodsType> addSpecificationGoodList = new ArrayList<AddSpecificationGoodsType>();

    /** 
     * Get the 'IssueDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ����������� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'ID' element value. ����� ���������
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. ����� ���������
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the list of 'AddSpecificationGoods' element items. �������� ������� �� ������������ � ���������
     * 
     * @return list
     */
    public List<AddSpecificationGoodsType> getAddSpecificationGoodList() {
        return addSpecificationGoodList;
    }

    /** 
     * Set the list of 'AddSpecificationGoods' element items. �������� ������� �� ������������ � ���������
     * 
     * @param list
     */
    public void setAddSpecificationGoodList(List<AddSpecificationGoodsType> list) {
        addSpecificationGoodList = list;
    }
}
